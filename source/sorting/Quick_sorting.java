package sorting;

public class Quick_sorting {
	private int[] input_array;

	public Quick_sorting(int[] input_array) {
		this.input_array = input_array;
		quicksort(0, input_array.length - 1);
	}
	// get sorted array method:
	public int[] get() {
		return input_array;
	}
	// repeat and decrease sroting range till have an array (indexes of array!) with 2 element (then partition() sort it)
	private void quicksort(int p, int r) {
		if (p < r) {
			int q = partition(p, r);
			quicksort(p, q - 1);
			quicksort(q + 1, r);
		}
	}
	// sort array via one element
	private int partition(int p, int r) {
		int x = input_array[r];
		int i = p - 1;
		for (int j = p; j <= r - 1; j++) {
			if (input_array[j] < x) {
				i++;
				exchange(i, j);
			}
		}
		exchange(i + 1, r);
		return i + 1;
	}
	
	private void exchange(int input1, int input2) {
		int temp = input_array[input1];
		input_array[input1] = input_array[input2];
		input_array[input2] = temp;
	}
}
