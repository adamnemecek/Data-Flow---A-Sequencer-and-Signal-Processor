import java.io.File;
import java.io.IOException;

import javax.sound.midi.MidiUnavailableException;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class SoundSyncFormant implements Runnable{

	private Sproc sprocc;
	private Canvas can;
	private File wav;
	byte [] audioBufferF1; 
	//byte [] audioBufferF2; 
	//byte [] audioBufferF3; 
	//byte [] audioBufferF4; 
	
	public SoundSyncFormant(Sproc sproc, File wavFile) {
		
		// TODO Auto-generated constructor stub
		sprocc = sproc;
		wav = wavFile;
		//audioBufferF1 = a;
	}
	
	/*
	public void setbyteArray(byte [] a, byte [] b, byte [] c, byte [] d)
	{
		audioBufferF1 = a;
		audioBufferF2 = b;
		audioBufferF3 = c;
		audioBufferF4 = d;
	} */
	
	public void setSproc(Sproc sproc)
	{
		sprocc = sproc;
	}
	
	public void setCanvas(Canvas canv)
	{
		can = canv;
	}

	@Override
	public void run() {
		sprocc.playFormantParallel(wav);
		//sprocc.playFormant(audioBufferF1,audioBufferF2,audioBufferF3,audioBufferF4);
	}

}
