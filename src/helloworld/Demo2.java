package helloworld;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//personµÄœyÔ‡î
public class Demo2 {
	
	
	private Person p;
	
	@Before
	public void before() {
		p = new Person();
		System.out.println("before");
	}
	
	@Test
	public void tesetRun() {
	//	Person p = new Person();
		p.run();
	}
	
	@Test
	public void testEat() {
	//	Person p = new Person();
		p.eat();
	}
	
	@After
	public void after() {
		System.out.println("after");
		p = null;
	}
	
}
