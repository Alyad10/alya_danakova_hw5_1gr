public class Main {
    public static  void main(String[] args) {
        Hero thor = new Hero(70, 30, "Teleport");
        Boss sinyor = new Boss();
        sinyor.setHealthBoss(500);
        sinyor.setDamageBoss(50);
        sinyor.setDefenseBoss("Physical");
        System.out.println("Boss" + " = " + "health: " + (sinyor.getHealthBoss() + (" ")+  "damage: "+ (sinyor.getDamageBoss()
                + (" ") +"defense: " +  (sinyor.getDefenseBoss()))));



        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println( "Hero" + (i+1) + " = " + " Health: " + createHeroes()[i].getHealth() + " Damage: " + createHeroes()[i].getDamage()
                    + " Power " +createHeroes()[i].getSuperAbilities());


        }


    }

    public static Hero[] createHeroes() {
            Hero dick = new Hero(300, 70,"Magic");
            Hero rock = new Hero(400, 25);
            Hero gid = new Hero(290, 90);
            Hero[] heroes = new Hero[]{dick, rock, gid};

            return heroes;


        }











}


