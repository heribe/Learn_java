package headfirstjava.MIDI_music_player;
/* created at 7:49 PM 1/9/2018  */
/* 用于制作MidiEvent的类 */

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

public class MakeEvent {
    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try{
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception ex) {
            System.out.println("event error!");
        }
        return event;
    }
}
