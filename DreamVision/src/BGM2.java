
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class BGM2
{
	public BGM2() 
	{
		try
		{
			AudioInputStream ais = AudioSystem.getAudioInputStream(new File("sound/no.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(ais);
			
			// 소리 설정
			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			
			// 볼륨 반복
//			clip.loop(-1); // 무한반복 
			clip.start();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
