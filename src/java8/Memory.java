package java8;

public class Memory {
	static int count = 0;

	public Memory() {
		count++;
		System.out.println(count);
	}

}
