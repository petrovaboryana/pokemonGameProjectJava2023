public class WaterPokemon extends Pokemon{
    WaterPokemon(String name, Size size) {
        super(name, "Water", size, new WaterAttack("Water blast",9));
    }
}
