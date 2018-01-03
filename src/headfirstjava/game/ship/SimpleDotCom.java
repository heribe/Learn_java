package headfirstjava.game.ship;

import java.util.ArrayList;

public class SimpleDotCom {
	private ArrayList<String> a;
	private int k ;

	SimpleDotCom(){
		k = 0;
	}

	public void setA(ArrayList<String> a) {
		this.a = a;
	}




	public String checkyourself(String sguess) {
//		int guess = Integer.parseInt(sguess);
		String s = "miss";
		int index = a.indexOf(sguess);
		if(index >= 0) {
			a.remove(sguess);
			if(a.isEmpty())
				s = "kill";
			else s = "hit";
		}
		System.out.println(s);
		return s;
	}
}
