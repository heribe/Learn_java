package headfirstjava.MIDI_music_player;
/* created at 19:50 2017/11/6  */

//Sequencer-(palys)-Sequence-(has a)-Track-(holds)-MidiEvent

import javax.sound.midi.*;

public class MiniMiniMusicApp {

    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }

    public void play(){

        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);

            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 70, 100);  //信息类型，频道，音符(0~127)，音量
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);
            //message描述做什么,MidiEvent指定何时做

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 14);
            track.add(noteOff);

            player.setSequence(seq);  //将sequence送到sequencer上

            player.start();   //开始播放

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
