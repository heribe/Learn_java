package headfirstjava.game.ship;

import java.util.ArrayList;
import java.util.Scanner;

public class DotComGame {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuewsses = 0;

    public void setUpGame() {           //创建.com对象
        DotCom one = new DotCom();
        one.setNameLoc("baidu.com", helper.placeDotCom(3));
        DotCom two = new DotCom();
        two.setNameLoc("google.com", helper.placeDotCom(3));
        DotCom three = new DotCom();
        three.setNameLoc("bing.com", helper.placeDotCom(3));
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        System.out.println("Your goal is to sink three dot coms.\nbaidu.com google.com bing.com");
        System.out.println("Try to sink them all in the fewest number of guesses");
    }

    public void startPlaying() {
        Scanner scanner = new Scanner(System.in);
        while (!dotComsList.isEmpty()) {
            System.out.println("Enter a guess");
            String userGuess = scanner.nextLine();         //取得玩家输入
            checkUserGuess(userGuess);                     //判断猜测
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuewsses++;                                    //递增玩家猜测次数
        String result = "miss";
        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkyourself(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComsList.remove(dotComToTest);
                result = result+dotComToTest.getName();
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        System.out.println("All Dot coms are dead! Your stock is now worthless.");
        if (numOfGuewsses > 18) {
            System.out.println("It only took you " + numOfGuewsses + " guesses.");
            System.out.println("You got out before your options sank.");
        }else{
            System.out.println("Took you long enough. " + numOfGuewsses + " guesses.");
            System.out.println("Fish are dancing with your options");
        }
    }

}
