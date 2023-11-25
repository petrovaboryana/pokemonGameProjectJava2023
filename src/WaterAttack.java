import java.util.Random;

public class WaterAttack extends Attack{
    public WaterAttack(String name, int intensity) {
        super(name, intensity);

    }
    public WaterAttack() {
        name = "Water Gun";
        intensity = 7;
    }
}
