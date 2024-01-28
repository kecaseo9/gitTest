package git테스트;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class BGM {
	
	public BGM() {
		
		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(new File("C:\\Users\\USER-PC\\Downloads\\go-for-it-80s-cheesy-vhs-infomercial-synthpop-soundtrack-187085.wav"));
			
			Clip clip = AudioSystem.getClip();
			
			clip.open(ais);
			
			
			
			
			// 소리 설정 
			
			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			
			// 볼륨 조절
			gainControl.setValue((-30.0f));
			
			clip.start();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
