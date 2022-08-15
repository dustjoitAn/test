package entity;

import enums.Currency;

import java.math.BigDecimal;

public class Money {

	private Currency currency;
	private BigDecimal value;

	public Money(Currency currency, BigDecimal value) {
		this.currency = currency;
		this.value = value;
	}

	public Money(Money init) {
		this.currency = init.getCurrency();
		this.value = init.getValue().multiply(BigDecimal.valueOf(init.getCurrency().getValue()));
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	@Override public String toString() {
		return value + " " + currency;
	}
}
