import entity.Money;
import enums.Currency;
import serivce.MoneyOperation;
import serivce.impl.MoneyOperationImpl;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
	public static void main(String[] args) {

		Money initialMoney = new Money(Currency.AMD, new BigDecimal(10000));
		BigDecimal bigDecimal1 = new BigDecimal("100.3");
		bigDecimal1 = bigDecimal1.setScale(2, RoundingMode.FLOOR);
		Money secondMoney = new Money(Currency.USD, bigDecimal1);

		Money third = new Money(initialMoney);

		Money forth = (Money) secondMoney.clone();

		MoneyOperation moneyOperation = new MoneyOperationImpl();

		System.out.println(moneyOperation.add(initialMoney, secondMoney));
		System.out.println(secondMoney);
		System.out.println(third);
		System.out.println(forth);
	}
}
