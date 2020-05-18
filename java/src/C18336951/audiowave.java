package C18336951;

import processing.core.*;

public class audiowave {
    AssignmentVisuals mv;

    public audiowave(AssignmentVisuals mv)
    {
        this.mv = mv;
    }

    public void render()
    {
        mv.colorMode(PApplet.HSB);
                
        float cy = mv.height/2;
        mv.stroke(PApplet.map(mv.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);

        for(int i = 0 ; i < mv.getAudioBuffer().size() ; i ++)
        {
            float x3 = PApplet.map(i, 0, mv.getAudioBuffer().size(), 0, mv.width);
            mv.line(x3, cy, x3, cy + cy * mv.getAudioBuffer().get(i));
        }
    }
}