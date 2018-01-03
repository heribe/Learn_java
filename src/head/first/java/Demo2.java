package head.first.java;

public class Demo2 {
	public static void main(String[] args) {
		Demo1[] demo;
		demo = new Demo1[10];
		demo[1] = new Demo1();
		demo[1].setA(3);
		System.out.println(demo[1].getA());

		
	}
}
