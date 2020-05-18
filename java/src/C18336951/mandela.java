package C18336951;

import processing.core.*;

public class mandela {
    AssignmentVisuals mv;
    public mandela(AssignmentVisuals mv)
    {
        this.mv = mv;
    }

    float cx, cy, colour;
	

    public void render()
    {
		
		cx = mv.width / 4;
		cy = mv.height / 4;
		float x1;
        float[] bands = mv.getSmoothedBands();
		float xgap = (cx*2)/bands.length;
		
		mv.colorMode(PApplet.HSB);
		float r = PApplet.map(mv.getSmoothedAmplitude(), 0, 1, 0, mv.height);
		mv.noFill();
            
		mv.stroke((255-PApplet.map(mv.getSmoothedAmplitude(), 0, 1, 0, 255)), 255, 255);
		for (int i = 10; i > 0; i--) {
			float dist = (r+(i*r)/10);
			mv.ellipse(cx, cy, dist, dist);
		}
		for (int i = 10; i > 0; i--) {
			float dist = (r+(i*r)/10);
			mv.ellipse(cx*3, cy, dist, dist);
		}
		mv.fill(0);
		mv.rect(cx, cy*2, cx*2, cy);
        colour += 255/(bands.length*15f);
            if (colour > 255) {
                colour = 0;
            }   
        for(int i = 0 ; i < bands.length ; i ++)
        {
                
            mv.fill(colour, 255, 255);
			x1 = PApplet.map(i, 0, bands.length, cx, cx*3);
			x1 += xgap * 0.05f;
    
			mv.noStroke();
			float ycord = -bands[i];
			if (ycord < -cy) {
				ycord = -(cy);
			}
            mv.rect(x1, cy*3, xgap * 0.9f,ycord);
        }
	
    }
}