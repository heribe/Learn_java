package headfirstjava.MIDI_music_player;
/* created at 7:58 PM 1/9/2018  */
/* 利用MakeEvent播放一串音乐 */
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Track;

public class MiniMusicPlayer1 {
    public static void main(String[] args) {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            for (int i = 5; i < 61; i+=4) {
                track.add(MakeEvent.makeEvent(144, 1, i, 100, i));
                track.add(MakeEvent.makeEvent(128, 1, i, 100, i + 2));
            }
            sequencer.setSequence(seq);  //将sequence送到sequencer上
            sequencer.start();   //开始播放
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
