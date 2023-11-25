public class GroundPokemon extends Pokemon{
    GroundPokemon(String name, Size size) {
        super(name, "Ground", size, new GroundAttack("Earthquake", 10));
    }

}
