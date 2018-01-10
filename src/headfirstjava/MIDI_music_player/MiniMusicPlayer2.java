package headfirstjava.MIDI_music_player;
/* created at 8:28 PM 1/9/2018  */
/* 通过监听实现每播放一个音符打印一次字符 */
import com.sun.org.apache.xpath.internal.SourceTree;

import javax.sound.midi.*;

public class MiniMusicPlayer2 implements ControllerEventListener{ //因为要监听ControllerEvent，所以要实现这个接口
    private int n=0;
    public static void main(String[] args) {
        MiniMusicPlayer2 mini = new MiniMusicPlayer2();
        mini.go();
    }

    public void go(){
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            int[] eventsIWant = {127};
            sequencer.addControllerEventListener(this, eventsIWant);
            //向sequence注册事件。注册的方法取用监听者与代表想要监听的事件的int数组，我们只需要127事件

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            for (int i = 5; i < 60; i += 4) {
                track.add(MakeEvent.makeEvent(144, 1, i, 100, i));
                track.add(MakeEvent.makeEvent(176, 1, 127, 0, i));
                    //插入事件编号为127的自定义ControllerEvent（176），它不会做任何事情，只是让我们知道有音符被播放，因为它的tick跟NOTE ON是同时进行的
                track.add(MakeEvent.makeEvent(128, 1, i, 100, i + 2));
            }
            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override //获知事件时在命令打印出字符串的处理程序
    public void controlChange(ShortMessage event) {
        n++;
        System.out.println("la" + n);
    }
}
