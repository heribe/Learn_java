package headfirstjava.MIDI_music_player;
/* created at 20:18 2017/11/6  */
/* 可通过输入来控制乐器和音色的声音播放程序 */

import javax.sound.midi.*;
import java.util.Scanner;

public class MiniMusicCmdLine {

    public static void main(String[] args) {
        MiniMusicCmdLine mini = new MiniMusicCmdLine();
        /*if (args.length < 2) {
            System.out.println("Dont forget the instrument and note args");
        }else{
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);
            mini.play(instrument, note);
        }*/
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please input instrumen and note:");
            int ins = scanner.nextInt();
            int note = scanner.nextInt();
            mini.play(ins, note);
        }
    }

    /* 声音播放程序 */
    public void play(int instrument, int note) {

        try{
            //1.取得Sequencer并将其打开
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            //2.创建新的Sequence
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            //3.从Sequence中创建新的Track
            Track track = seq.createTrack();

            MidiEvent event = null; //?????

            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, instrument, 100);
            MidiEvent changeInstrument = new MidiEvent(first, 1);
            //4.将MidiEvent填入track
            track.add(changeInstrument);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, note, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, note, 100);
            MidiEvent noteOff = new MidiEvent( b, 16);
            track.add(noteOff);
            //5.让Sequencer播放
            player.setSequence(seq);
            player.start();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
