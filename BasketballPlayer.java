package chalange088;

public class BasketballPlayer extends Player {
    private int position;
    private double height;
    private double ppg;

    public BasketballPlayer(String name, int maxHPM, int position, double height, double ppg) {
        super(name);
        this.setMaxHPM(200);
        this.position = position;
        this.height = height;
        this.ppg = ppg;
    }

    public BasketballPlayer(String name) {
        this(name,200,1,190,10);
    }

    public int getPosition() {
        return position;
    }

    public double getHeight() {
        return height;
    }

    public double getPpg() {
        return ppg;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setPpg(double ppg) {
        this.ppg = ppg;
    }
}
