package chalange088;

public abstract class Player {
    private String name;
    private int maxHPM;

    public Player(String name) {
        this.name = name;
        this.maxHPM = 200;
    }

    public String getName() {
        return name;
    }

    public int getMaxHPM() {
        return maxHPM;
    }

    public void setMaxHPM(int maxHPM) {
        this.maxHPM = maxHPM;
    }

}
