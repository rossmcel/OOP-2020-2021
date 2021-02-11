package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet {

    public void settings() {
        size(500, 500);
        cx = width / 2;
        cy = height / 2;        
    }

    // BTW: 'width' and 'height' are library variables that are equal to the width and the height of the window

    int mode = 0;

    float cx;
    float cy;

    // Don't change the current mode value if a value outside the range 1-9 is entered
    public void keyPressed() {
        // the value of mode will be the number of the 
        // number key pressed
        if (keyCode >= '0' && keyCode <= '9')
            mode = keyCode - '0';
    }

    public void setup() {
        colorMode(HSB);
    }

    // BTW: mouseX = the horizontal coordinate of the mouse
    // rect() method = rect(upper left X coordinate, upper left Y coordinate, width, height)
    // ellipse() method = ellipse(center X coordinate, center Y coordinate, width, height)

    public void draw() {
        background(0);
        noStroke();
        switch (mode)
        {
            case 0:
                fill(50, 255, 255);                    
                if (mouseX < cx)
                {
                    rect(0, 0, cx, height);
                }
                else
                {
                    rect(cx, 0, cx, height);
                }
                break;
            case 1:
                fill(50, 255, 255);                                    
                if (mouseX < cx && mouseY < cy)
                {
                    rect(0, 0, cx, cy);
                }
                else if (mouseX > cx && mouseY < cy)
                {
                    rect(cx, 0, cx, cy);
                }
                else if (mouseX < cx && mouseY > cy)
                {
                    rect(0, cy, cx, cy);
                }
                else
                {
                    rect(cx, cy, cx, cy);
                }
                break;
            case 2:
            {
                // number of rectangles = the location of the mouse divided by 10 - (btw: the f indicates to the compiler 
                // that the number is a float)
                int numRects = (int)(mouseX / 10.0f);
                float w = width / (float) numRects;
                float cgap = 255 / (float) numRects;
                for(int i = 0 ; i < numRects ; i ++)
                {
                    fill(i * cgap, 255, 255);
                    rect(i * w, 0, w, height);
                }
                break;
            }
            case 3:
            {
                int numCircles = (int)(mouseX / 10.0f);
                float w = width / (float) numCircles;
                float cgap = 255 / (float) numCircles;
                for(int i = 0 ; i < numCircles ; i ++)
                {
                    fill(cgap * i, 255, 255);
                    ellipse(w / 2 + (i * w), cy, w, w);
                }
                break;
            }
            // diagonal squares
            case 4:
            {
                for(int i = 0 ; i < 10 ; i ++)
                {
                    fill(i*25, 255, 255);
                    rect(i * width/10, i*(height/10), width/10, height/10);
                }
                break;
            }
            //diagonal squares in shape of X
            case 5:
            {
                for(int i = 0 ; i < 10 ; i ++)
                {
                    fill((9-i)*25, 255, 255);
                    rect(i * width/10, i*(height/10), width/10, height/10);

                    fill(i*25, 255, 255);
                    rect(i * width/10, (9-i)*(height/10), width/10, height/10);
                }
                break;
            }
            case 6:
            {
                int numCircles = 21;
                int w = (width/numCircles)*2;
                int h = (height/numCircles)*2;

                background(0);
                for(int i = 0 ; i < numCircles ; i ++)
                {
                    fill((numCircles-1-i)*(width/numCircles), 255, 255);
                    ellipse(width/2, height/2, (numCircles-1-i)*(h), (numCircles-1-i)*(w));
                }
                break;
            }
            // full screen of circles
            case 7:
            {
                int numCircles = (int)(mouseX / 10.0f);
                float w = width / (float) numCircles;
                float cgap = 255 / (float) numCircles;

                for(int i = 0 ; i < numCircles ; i ++)
                {
                    fill(cgap * i, 255, 255);
                    // w = full circle(from start to finish), w/2 = half circle (from start to mid point)
                    // (i*w), adds a new circle one circle distance away from the previous circle
                    ellipse(w / 2 + (i * w), 0 + w, w, w);

                    for(int j = 0 ; j < numCircles ; j ++)
                    {
                        ellipse(w / 2 + (i * w), j*(0 + w), w, w);
                    }
                }
                break;
            }
        }
    }
}
