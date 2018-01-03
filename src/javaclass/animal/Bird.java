package javaclass.animal;

public class Bird extends animal{
	private String furColor;

	public String getFurColor() {
		return furColor;
	}
	
	
	
	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}



	public void showType() {
		System.out.println("我是一只鸟");
	}

	public void eat() {
		
	}
}
