package C18336951;

import ddf.minim.analysis.FFT;
import ie.tudublin.*;

public class AssignmentVisuals extends Visual {

    public int visualControl =1;
    bars bar;
    spirals spiral;
    audiowave wave;
    mandela mand;

    public void settings()
    {
        size(1024, 800);
    }

    public void setup()
    {
        startMinim();
                
        //loadAudio("heroplanet.mp3");
        loadAudio("Roxbury02119.mp3");   
        setFrameSize(256);
        colorMode(HSB);
        getAudioPlayer().play();
        bar = new bars(this);
        spiral = new spirals(this);
        wave = new audiowave(this);
        mand = new mandela(this);

  
    }

    public void keyPressed()
    {
        switch(key) {
            case ' ':
                getAudioPlayer().cue(0);
                getAudioPlayer().play();
              break;
            case '1':
                visualControl = 1;
            break;
            case '2':
              visualControl = 2;
              break;
            case '3':
              visualControl = 3;
            break;
            case '4':
              visualControl = 4;
            break;
            default:
              System.out.println("Invalid Input");
        }
    }


    public void draw()
    {
        background(0);
        fill(255);
        textSize(height*0.025f);
        text("Mode: "+ visualControl, 0, height*0.025f);
        calculateAverageAmplitude();
        try
        {
            calculateFFT();
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        calculateFrequencyBands();

        switch(visualControl) {
            case 1:
                bar.render();
            break;
            case 2:
                spiral.render();
            break;
            case 3:
                wave.render();
            break;
            case 4:
                mand.render();
            break;
            default:
              System.out.println("Error please press a number from 1-4");
        }


       
    }
}