package miosi.prg.n05.es02;

public class Stack {
	private static final int MAX_STACK_SIZE = 100;

	private int[] data;

	int stackSize;

	public Stack() {
		data = new int[MAX_STACK_SIZE];
		stackSize = 0;
	}

	public Stack(int[] data) {
		populate(data);
	}

	private void populate(int[] newData) {
		data = new int[MAX_STACK_SIZE];
		stackSize = newData.length;

		for (int i=0; i<stackSize; ++i) {
			data[i] = newData[i];
		}
	}

	public void push(int obj) {
		if (isFull()) {
			return;
		}
		data[stackSize] = obj;
		++stackSize;
	}

	public int pop() {
		if (isEmpty()) {
			return 0;
		}
		--stackSize;
		return data[stackSize];
	}

	public boolean isEmpty() {
		return stackSize <= 0;
	}

	public boolean isFull() {
		return stackSize >= MAX_STACK_SIZE;
	}
}