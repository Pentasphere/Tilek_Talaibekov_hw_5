public class Main {
    public static void main(String[] args) {
        Boss theBoss = new Boss();
        theBoss.setHealth(700);
        theBoss.setDamage(50);
        theBoss.setDefence("No defence");
        System.out.println("Boss health: " + theBoss.getHealth()
                + " Boss damage: " + theBoss.getDamage()
                + " Boss defence: " + theBoss.getDefence());

        Hero[] heroes = createHeroes();
        System.out.println("Heroes info:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth());
            System.out.println("Damage: " + hero.getDamage());
            System.out.println("Superpower: " + hero.getSuperpower());
            System.out.println();
        }
    }

    public static Hero[] createHeroes(){
        Hero[] heroes = new Hero[3];
        heroes[0] = new Hero(280, 10, "Physical");
        heroes[1] = new Hero(270, 15, "Magical");
        heroes[2] = new Hero(280, 10, "Kinetic");
        return heroes;
    }
}