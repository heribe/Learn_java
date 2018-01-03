package cn.itcsat.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
//增强循环
public class Demo3 {

	@Test
	public void test1() {
		int arr[] = {1,2,3};
		for (int num : arr) {
			System.out.println(num);
		}
	}
	
	@Test
	public void test2() {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		for(Object obj : list) {
			int i = (Integer)obj;
			System.out.println(i);
		}
	}
	
	@Test
	public void test3() {
		Map map = new HashMap();
		map.put("1","aaa");
		map.put("2", "bbb");
		map.put("3", "ccc");
		
		//传统方式
		Set set = map.keySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			String value = (String)map.get(key);
			System.out.println(key + "=" + value);
		}
	}
	
}
