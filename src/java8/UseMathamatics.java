package java8;

public class UseMathamatics {

	public static void main(String[] args) {
		int[] marks = { 78, 40, 80, 85, 68 };

		Maths m = new Maths();
		
		Mathamatics maxi = m::findMax;
		
		System.out.println(maxi.maths(marks));

		Mathamatics mini = m::findMin;
		System.out.println(mini.maths(marks));

		Mathamatics avgs = m::findAvg;
		System.out.println(avgs.maths(marks));

	}

}
