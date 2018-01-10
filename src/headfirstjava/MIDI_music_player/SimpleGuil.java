package headfirstjava.MIDI_music_player;
/* created at 2:45 PM 1/9/2018  */

import javax.swing.*;

public class SimpleGuil {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//在window关闭时把程序结束掉
        frame.getContentPane().add(button); //把buttont加到frame的pane上
        frame.setSize(300, 300); //设定frame的大小
        frame.setVisible(true); //把frame显示出来
    }
}
