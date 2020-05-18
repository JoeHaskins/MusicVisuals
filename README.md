# Music Visualiser Project

Name: Joseph Haskins

Student Number: C18336951

## Instructions
- Fork this repository and use it a starter project for your assignment
- Create a new package named your student number and put all your code in this package.
- You should start by creating a subclass of ie.tudublin.Visual
- There is an example visualiser called MyVisual in the example package
- Check out the WaveForm and AudioBandsVisual for examples of how to call the Processing functions from other classes that are not subclasses of PApplet

# Description of the assignment
This program loads a file of the mp3 format from the java/data folder and then runs and displays shapes and images that respond to various parts of the audio. 
1. The first mode displays all the audio bands in the form of bars that increase as the frequency of each bands increase. This means that certain bars respond to diffrent audios as in some respond more to vocals, others base and others just respond to the music.
2. The second mode is the spirals which are responding to the amplitude of the music they create an intresting effect and are by far my favourite visual as they almost appear to be stars. Their colour is also related to the amplitude so both combine for a cool and unique visual.
3. The third mode is a waveform of the music that draws its lines based on the audiobuffers frames. This is something we did in a lecture that I liked and I thought it would create a cool visual.
4. Finally we have the face also known as the 4th mode, it was an idea that came to me as I made the spirals as they sometimes appear as eyes. So i thought it would be cool to make a face that visually responds to the music. So I made a face out of basically a combination of the first two modes using circles instead of spirals as i thought they made better eyes.

# Instructions
The program has 4 modes each displaying a diffrent form of audio visualiser. These can be toggled using the keys 1,2,3 and 4. The current mode of the program is displayed in the top left corner. The program can also be restarted by pressing the "Space" key without changing the mode back to the default.

# How it works
You can run the project by opening the file in VS code and pressing F5 or you can open a console in the java file and type ./run.sh. If for some reason the .class files didnt download
correctly you can type ./compile.sh in that same folder then re-try ./run.sh.

# What I am most proud of in the assignment
The part I am most proud of is the spirals as they where had to get functioning as figuring out how to make the points be drawn further apart depending on the amplitude of the song was a challenge that took a couple hours of tinkering.
Eventually I figured out how to use a variable that stored a gap value and then multiply the rotating x and y variables by that value.
```Java
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
```
# Youtube Video
[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

