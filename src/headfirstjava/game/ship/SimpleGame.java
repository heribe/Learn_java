package headfirstjava.game.ship;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleGame {

	public static void main(String[] args) {
		SimpleDotCom sdc = new SimpleDotCom();
		int k = 0;
		int num = (int) (Math.random()*5);
		ArrayList<String> a = new ArrayList<>();
		a.add(Integer.toString(num));
		a.add(Integer.toString(num+1));
		a.add(Integer.toString(num+2));
		sdc.setA(a);
		String result = null;
		String guess;
		Scanner scanner = new Scanner(System.in);
		int size;
		
		while(result != "kill") {
			size = a.size();
			System.out.println(size+"please guess your number:");
			guess = scanner.nextLine();
			result = sdc.checkyourself(guess);
			k++;
		}
		System.out.println("your times:"+k);
	}
}
