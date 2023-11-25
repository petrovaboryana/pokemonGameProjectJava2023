import java.util.List;
import java.util.Random;
import java.util.Scanner;

    // Клас за представяне на покемон
    public abstract class Pokemon {
        protected String name;
        protected int healthPoints;
        protected int attackPoints;
        protected int defensePoints;
        protected String type;
        protected Size size;
        protected Attack attack;

        Pokemon(String name, String type,Size size, Attack attack) {
            this.name = name;
            this.type = type;
            this.healthPoints = 100;
            this.attackPoints = 50;
            this.defensePoints = 50;
            this.size = size;
            this.attack = attack;
            adjustStatsBasedOnSize();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHealthPoints() {
            return healthPoints;
        }

        public void setHealthPoints(int healthPoints) {
            this.healthPoints = healthPoints;
        }

        public int getAttackPoints() {
            return attackPoints;
        }

        public void setAttackPoints(int attackPoints) {
            this.attackPoints = attackPoints;
        }

        public int getDefensePoints() {
            return defensePoints;
        }

        public void setDefensePoints(int defensePoints) {
            this.defensePoints = defensePoints;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Size getSize() {
            return size;
        }

        public void setSize(Size size) {
            this.size = size;
        }

        public Attack getAttack() {
            return attack;
        }

        public void setAttack(Attack attack) {
            this.attack = attack;
        }

        void adjustStatsBasedOnSize() {
            if (size == Size.SMALL) {
                healthPoints -= 20;
            } else if (size == Size.BIG) {
                healthPoints += 20;
            }
            if(this.healthPoints > 100){
                this.healthPoints = 100;
            }
        }
        public boolean isDead() {
            return this.healthPoints <= 0;
        }

        public void attack(Pokemon opponent) {
            attack.performAttack(this, opponent);
        }

        @Override
        public String toString() {
            return "Pokemon Name : " + this.name + ", Health : " + this.healthPoints;
        }


    }




