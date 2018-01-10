package headfirstjava.MIDI_music_player;
/* created at 19:50 2017/11/6  */
/* 声音播放程序 */
//Sequencer-(palys)-Sequence-(has a)-Track-(holds)-MidiEvent

import javax.sound.midi.*;

public class MiniMiniMusicApp {

    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }

    public void play(){

        try {
            Sequencer player = MidiSystem.getSequencer(); //创建Sequencer
            player.open(); //打开Sequencer

            Sequence seq = new Sequence(Sequence.PPQ, 4); //创建Sequence

            Track track = seq.createTrack(); //要求取得track

            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, 5, 100);
            MidiEvent changeInstrument = new MidiEvent(first, 1);
            track.add(changeInstrument);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 70, 100);
                    //信息类型（192表示换乐器，144表示打开，128表示关闭），频道，音符(0~127)，音量
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn); //将MidiEvent填入track
            //message描述做什么,MidiEvent由message和发音时机组成

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 60, 100);
            MidiEvent noteOff = new MidiEvent(b, 10);
            track.add(noteOff);

            player.setSequence(seq);  //将sequence送到sequencer上

            player.start();   //开始播放

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
