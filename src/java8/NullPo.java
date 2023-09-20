package java8;

import java.util.Optional;
import java.util.Scanner;

public class NullPo {
	public static void main(String[] args) {

		String a = null;
		String b = "Hari";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name");
		String name = s.next();
		System.out.println("Age");
		int age = s.nextInt();
		System.out.println("Year of Birth" + (age - 2023));

		Optional<String> y = Optional.ofNullable(name);
		if (y.isPresent()) {
			System.out.println(name.toUpperCase());
		} else {
			System.out.println("Please Enter the Name ");
		}
		System.out.println(y.orElse("Please Enter"));

	}

}
