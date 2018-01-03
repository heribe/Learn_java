package helloworld;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

//personµÄœyÔ‡î
public class Demo2_3 {
	
	

	

	@Test
	public void tesetRun() {
		Person p = new Person();

		//”àÑÔ
		Assert.assertEquals("12", p.say());

	}
	
	@Test
	public void testEat() {
		Person p = new Person();
		p.eat();
	}
	

	
}
