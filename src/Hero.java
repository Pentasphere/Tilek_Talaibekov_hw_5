public class Hero {
    private int health;
    private int damage;
    private String superpower;

    public Hero(int theHealth, int theDamage, String theSuperpower){
        this.health = theHealth;
        this.damage = theDamage;
        this.superpower = theSuperpower;
    }

    public Hero(int theHealth, int theDamage){
        this.health = theHealth;
        this.damage = theDamage;
    }

    public int getHealth() {
        return health;
    }


    public int getDamage() {
        return damage;
    }


    public String getSuperpower() {
        return superpower;
    }

}
