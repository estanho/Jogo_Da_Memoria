package codigo_jogo_da_memoria;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

public class AudioClip {
    private File file;
    
    public AudioClip(String path) {
        file = new File(path);
        if(!file.exists()) {
            System.out.println("Error >> AudioClip Not Found!");
        }
    }
    
    public AudioInputStream getAudioStream() {
        try {
            
            return AudioSystem.getAudioInputStream(file);
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
}
