package serivce.impl;

import entity.Money;
import enums.Currency;
import serivce.MoneyOperation;

import java.math.BigDecimal;

public class MoneyOperationImpl implements MoneyOperation {

	@Override
	public Money add(Money initialMoney, Money moneyToAdd) {
		BigDecimal amount = initialMoney.getValue().add(moneyToAdd.getValue().multiply(BigDecimal.valueOf(moneyToAdd.getCurrency().getValue())));
		return new Money(Currency.AMD, amount);
	}
}
