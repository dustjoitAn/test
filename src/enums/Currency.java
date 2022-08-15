package enums;

public enum Currency {

	AMD(1),
	USD(410);

	private final int value;

	Currency(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
