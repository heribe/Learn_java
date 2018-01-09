package headfirstjava.MIDI_music_player;
/* created at 20:07 2017/11/5  */
/* 判断是否可以取得Sequencer对象 */

import javax.sound.midi.*;

public class MusicTest1 {

    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer(); //这个对象的作用是将MIDI信息组合成“乐曲”
            System.out.println("We got a sequencer");
        }catch(MidiUnavailableException ex) {
            System.out.println("Bummer");
        } //关闭播放
    }

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    } // 关闭main
} //关闭类
