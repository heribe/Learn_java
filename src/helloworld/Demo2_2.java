package helloworld;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

//personµÄœyÔ‡î
public class Demo2_2 {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass");
	}
	
	@Test
	public void tesetRun() {
		Person p = new Person();
		p.run();
	}
	
	@Test
	public void testEat() {
		Person p = new Person();
		p.eat();
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass");
	}
	
}
