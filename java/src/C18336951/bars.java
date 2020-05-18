package C18336951;

import processing.core.*;

public class bars {
    AssignmentVisuals mv;
    float colour= 0f;

    public bars(AssignmentVisuals mv)
    {
        this.mv = mv;
    }

    public void render()
    {
        mv.colorMode(PApplet.HSB);
        float x1;
        float[] bands = mv.getSmoothedBands();
        float xgap = mv.width/bands.length;
        colour += 255/(bands.length*15f);
            if (colour > 255) {
                colour = 0;
            }   
        for(int i = 0 ; i < bands.length ; i ++)
        {
                
            mv.fill(colour, 255, 255);
            mv.stroke(colour, 255, 255);
            x1 = PApplet.map(i, 0, bands.length, 0, mv.width);
            mv.line(0, mv.height/2, mv.width, mv.height/2);
                    
            mv.noStroke();
            mv.rect(x1, mv.height/2, xgap * 0.95f ,bands[i]);
            mv.rect(x1, mv.height/2, xgap * 0.95f,-bands[i]);
        }
    }
}