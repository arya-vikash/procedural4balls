import processing.core.PApplet;
public class TryProcessingOOPS extends PApplet  {
    public static void main(String[] args)
    {

        PApplet.main("TryProcessingProcedural",args);

    }

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int Diameter=10;
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
        TryProcessing prs=new TryProcessing();
        prs.drawCircle1(Diameter,HEIGHT);
        prs.drawCircle2(Diameter,HEIGHT);
        prs.drawCircle3(Diameter,HEIGHT);
        prs.drawCircle4(Diameter,HEIGHT);
    }
}
