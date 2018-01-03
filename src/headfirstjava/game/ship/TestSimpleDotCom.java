package headfirstjava.game.ship;

import java.util.ArrayList;

public class TestSimpleDotCom {
	public static void main(String[] args) {
		SimpleDotCom sdc = new SimpleDotCom();
		ArrayList<String> a = new ArrayList<>();
		a.add("1");
		a.add("2");
		a.add("3");		
		sdc.setA(a);
		
		String[] guess = {"2","4","1","3"};
		for(String s : guess) {
			sdc.checkyourself(s);
		}
	}
}
