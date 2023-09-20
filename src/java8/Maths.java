package java8;

public class Maths {

	public int findMax(int[] num) {
		int max = num[0];
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		return max;
	}

	public int findMin(int[] num) {
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if (min > num[i]) {
				min = num[i];
			}
		}
		return min;

	}

	public int findAvg(int[] num) {
		int avg = 0;
		for (int i = 0; i < num.length; i++) {

			avg=num[i]+avg ;

		}
		return avg / 5;

	}

}
