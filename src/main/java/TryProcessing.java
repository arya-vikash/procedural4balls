import processing.core.PApplet;
public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int Diameter=10;
    int x1=0,x2=0,x3=0,x4=0;
    int frame=1;

    public static void main(String[] args){
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
    }


    @Override
    public void draw() {
        drawCircle1(Diameter);
        drawCircle2(Diameter);
        drawCircle3(Diameter);
        drawCircle4(Diameter);
    }

    private void drawCircle1(int Diameter) {
        ellipse(x1,HEIGHT/5, Diameter, Diameter);
        x1+=frame;
    }
    private void drawCircle2(int Diameter) {
        ellipse(x2,2*HEIGHT/5, Diameter, Diameter);
        x2+=2*frame;
    }
    private void drawCircle3(int Diameter) {
        ellipse(x3,3*HEIGHT/5, Diameter, Diameter);
        x3+=3*frame;
    }
    private void drawCircle4(int Diameter) {
        ellipse(x4,4*HEIGHT/5, Diameter, Diameter);
        x4+=4*frame;
    }
}
