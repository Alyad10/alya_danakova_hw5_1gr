public class Hero {
private int health;
private int damage;
private String superAbilities;

    public Hero(int health, int damage, String superAbilities) {
        this.health = health;
        this.damage = damage;
        this.superAbilities = superAbilities;
    }

    public Hero(int health, int damage){
        this.health = health;
        this.damage = damage;
    }

    public int getHealth(){
    return health;
}

    public int getDamage() {
        return damage;
    }

    public String getSuperAbilities() {
        return superAbilities;
    }
}


