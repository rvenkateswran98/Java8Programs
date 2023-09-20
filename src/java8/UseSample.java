package java8;

public class UseSample {

	public static void main(String[] args) {

		Sample1 s = new Sample1();
		
		System.out.println(s.age(1998));
		
//		s.gender("Male");
		
		Sample gen=(a)->System.out.println(a.toUpperCase());
		gen.gender("Male");
		
		
		System.out.println((Sample.name()));

	}

}
