package java8;

@FunctionalInterface
public interface Sample {

	public static String name() {
		return "Hari";
	}

	public default int age(int a) {
		return a;

	}

	public void gender(String g);
}
