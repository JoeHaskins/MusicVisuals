package C18336951;

import processing.core.*;

public class spirals {
    AssignmentVisuals mv;

    public spirals(AssignmentVisuals mv)
    {
        this.mv = mv;
    }

    public void render()
    {
        mv.colorMode(PApplet.HSB);
                
                mv.stroke(PApplet.map(mv.getAmplitude(), 0, 1, 0, 255), 255, 255);
                mv.translate(mv.width/3, mv.height/2);
                float gap = 5*mv.getSmoothedAmplitude();
                for (float t = 0; t < mv.width; t+=0.5 ) {
                    float x2 = (t * PApplet.cos(t)*gap);
                    float y = (t * PApplet.sin(t))*gap;
                    mv.point(x2, y);
                }
                mv.translate(mv.width/3, 0);
                for (float t = 0; t < mv.width; t+=0.5 ) {
                    float x2 = (t * PApplet.cos(t)*gap);
                    float y = (t * PApplet.sin(t))*gap;
                    mv.point(x2, y);
                }
    }
}