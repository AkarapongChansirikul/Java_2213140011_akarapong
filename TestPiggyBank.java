public class TestPiggyBank {
	public int one;
	public int two;
	public int five;
	public int ten;
	public int size;
	public void setPiggyBack(int s) {
		clear();
		size = s;
	}

	public void clear() {
		one = two = five = ten = 0;
	}

	public int getPiggyBank() {
		return size;
	}

	public int getTotal() {
		return one + (two * 2) + (five * 5) + (ten * 10);
	}

	public void addOne(int c) {
		if (getTotal() + c <= size) {
			one += c;
		} else {
			System.err.println("Piggy Bank Full");
		}
	}

	public void addTwo(int c) {
		if (getTotal() + (c * 2) <= size) {
			two += c;
		} else {
			System.err.println("Piggy Bank Full");
		}
	}

	public void addFive(int c) {
		if (getTotal() + (c * 5) <= size) {
			five += c;
		} else {
			System.err.println("Piggy Bank Full");
		}
	}

	public void addTen(int c) {
		if (getTotal() + (c * 10) <= size) {
			ten += c;
		} else {
			System.err.println("Piggy Bank Full");
		}
	}

}// end of Class PiggyBank
