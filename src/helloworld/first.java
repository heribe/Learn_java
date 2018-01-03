package helloworld;

public class first {
	private String danbaizhi="danbaizhi";
	public void prt() {
		System.out.println(danbaizhi);
	}
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		 
		first member1 = new first();
		System.out.println(member1.danbaizhi);
		member1.prt();
	}

}
