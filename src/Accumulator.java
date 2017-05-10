
public class Accumulator {
	private long value = 0;

	public void add(int amount) {
		this.value += amount;
	}

	public long get() {
		return value;
	}

}
