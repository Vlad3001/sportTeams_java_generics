package chalange088;

public class FootballPlayer extends Player {

    private int maxSpeed;
    private boolean isGoalKeeper;
    private double gpg;

    public FootballPlayer(String name, int maxHPM, int maxSpeed, boolean isGoalKeeper, double gpg) {
        super(name);
        this.setMaxHPM(200);
        this.maxSpeed = maxSpeed;
        this.isGoalKeeper = isGoalKeeper;
        this.gpg = gpg;
    }

    public FootballPlayer(String name) {
        this(name, 200, 25,false, 1.5);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isGoalKeeper() {
        return isGoalKeeper;
    }

    public double getGpg() {
        return gpg;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setGpg(double gpg) {
        this.gpg = gpg;
    }
}
