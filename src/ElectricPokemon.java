import java.util.List;

public class ElectricPokemon extends Pokemon{
    ElectricPokemon(String name, Size size) {
        super(name, "Electric", size, new ElectricAttack("Blaster",5));
    }
}
