package java8;

public class UseCAl {

	public static void main(String[] args) {
		
		Cal add=(a,b)->a+b;
		Cal sub=(a,b)->a-b;
		Cal mul=(a,b)->a*b;
		Cal div=(a,b)->a/b;
		
		System.out.println("ADD-"+add.math(20, 90));
		System.out.println("SUB-"+sub.math(20, 15));
		System.out.println("MUL-"+mul.math(20, 20));
		System.out.println("DIV-"+div.math(20, 4));
		
		
		
	}

}
