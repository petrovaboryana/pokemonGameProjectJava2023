import java.util.Random;

public class Attack implements Attackable{
    protected String name;
    protected int intensity;

    public Attack(String name, int intensity) {
        this.name = name;
        this.intensity = intensity;
    }
    public Attack(){
        this.name = "Default Attack  ";
        this.intensity = 5;
    }


    @Override
    public void performAttack(Pokemon attacker,Pokemon opponent) {
        int damage = ((new Random().nextInt(10) + 1) + intensity);
        opponent.healthPoints -= damage;
        System.out.println(attacker.name + " used " + this.name + " attack and makes " + damage + " damage to " + opponent.name);
    }

    //    public void attack (Pokemon pokemon){
//        int currentHealth = pokemon.getHealthPoints();
//        int reduceHealth = (int)( Math.ceil(this.intensity * currentHealth) * 2);
//        pokemon.setHealthPoints(currentHealth - reduceHealth);
//        System.out.println("After " + this.name + " attack: ");
//        System.out.print(pokemon.toString());
//        if (pokemon.isDead()) {
//            System.out.println(pokemon.getName() + " is Dead.");
//        }
//    }




}
