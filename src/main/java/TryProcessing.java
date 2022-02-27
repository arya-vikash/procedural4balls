import processing.core.PApplet;
public class TryProcessing extends PApplet{

        int x1=0,x2=0,x3=0,x4=0;
        int frame=1;
    protected void drawCircle1(int Diameter,int HEIGHT) {
        ellipse(x1,HEIGHT/5, Diameter, Diameter);
        x1+=frame;
    }
    protected void drawCircle2(int Diameter,int HEIGHT) {
        ellipse(x2,2*HEIGHT/5, Diameter, Diameter);
        x2+=2*frame;
    }
    protected void drawCircle3(int Diameter,int HEIGHT) {
        ellipse(x3,3*HEIGHT/5, Diameter, Diameter);
        x3+=3*frame;
    }
    protected void drawCircle4(int Diameter,int HEIGHT) {
        ellipse(x4,4*HEIGHT/5, Diameter, Diameter);
        x4+=4*frame;
    }

}
