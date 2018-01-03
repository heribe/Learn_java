package headfirstjava.game.ship;

import java.util.ArrayList;

public class DotCom {
	private String name;
	private ArrayList<String> loc;

    public void setNameLoc(String name,ArrayList<String> loc) {
        this.loc = loc;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String checkyourself(String sguess) {
        String s = "miss";
        int index = loc.indexOf(sguess);
        if(index >= 0) {
            loc.remove(sguess);
            if(loc.isEmpty())
                s = "kill";
            else s = "hit";
        }
//        System.out.println(s);
        return s;
    }

}
