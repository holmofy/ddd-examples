package cn.hff.ddd.types.primitives;

import lombok.Value;
import org.apache.commons.lang3.Validate;

import java.math.BigDecimal;
import java.util.Currency;

@Value
public class ExchangeRate {
    private BigDecimal rate;
    private Currency from;
    private Currency to;

    public ExchangeRate(BigDecimal rate, Currency from, Currency to) {
        this.rate = rate;
        this.from = from;
        this.to = to;
    }

    public Money exchange(Money fromMoney) {
        Validate.notNull(fromMoney);
        Validate.isTrue(this.from.equals(fromMoney.getCurrency()));
        BigDecimal targetAmount = fromMoney.getAmount().multiply(rate);
        return new Money(targetAmount, to);
    }
}