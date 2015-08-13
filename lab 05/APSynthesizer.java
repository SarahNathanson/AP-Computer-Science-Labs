import javax.sound.midi.*;

public class APSynthesizer {
	public static void main(String[] args) {

	}

	public void run(int[][] song) {
		try {
			Synthesizer synth = MidiSystem.getSynthesizer();
			synth.open();
			MidiChannel[] channels = synth.getChannels();
			for (int i = 0; i < song.length; i++) {
				/*
				 * Access sleep time: song[i][0] play/stop: song[i][1+(4*j)]
				 * channel: song[i][1+(4*j)+1] note: song[i][1+(4*j)+2] volume:
				 * song[i][1+(4*j)+3]
				 */
				for (int j = 0; j < (song[i].length - 1) / 4; j++) {
					// play notes
					if (song[i][1 + (4 * j)] == 1) {// play
						channels[song[i][1 + (4 * j) + 1]].noteOn(
								song[i][1 + (4 * j) + 2],
								song[i][1 + (4 * j) + 3]);
						// System.out.println(song[i][1 + (4 * j) + 3]);
					} else {// stop
						// System.out.println("test");
						channels[song[i][1 + (4 * j) + 1]]
								.noteOff(song[i][1 + (4 * j) + 2]);

						// same as play but with noteOff and ignore volume
					}

				}

				Thread.sleep(song[i][0]); // rest
				// System.out.println(song[i][0]);
			}
			synth.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
