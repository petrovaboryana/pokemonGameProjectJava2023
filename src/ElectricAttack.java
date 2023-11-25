import java.util.Random;

public class ElectricAttack extends Attack{
    public ElectricAttack(String name, int intensity) {
        super(name, intensity);
    }
    public ElectricAttack(){
        this.name = "Electric Shock";
        this.intensity = 10;
    }



}
