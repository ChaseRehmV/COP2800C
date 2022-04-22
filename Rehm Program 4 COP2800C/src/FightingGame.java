public class FightingGame {

    // a "status update" method to be a little more DRY instead of posting this block after every attack.
    // it is called in every attack method
    public static void printFighterHealths(Fighter fighter1, Fighter fighter2) {
        System.out.println(fighter1.getName() + " health: " + fighter1.getCurrentHealth());
        System.out.println(fighter2.getName() + " health: " + fighter2.getCurrentHealth());
        System.out.println();
    }

    public static void main(String[] args) {
        Byleth byleth = new Byleth();
        Sephiroth sephiroth = new Sephiroth();

        // So I originally had plans to wrap this in a while loop that would allow users to select from a list
        // of attacks or moves that were available for each character subclass. But school and work and other life
        // stuff got in the way and so this is what I was able to get done :/
        System.out.println(sephiroth.getName() + " enters the fight!");
        System.out.println(byleth.getName() + " enters the fight!");
        FightingGame.printFighterHealths(byleth, sephiroth);

        byleth.baseAttack(sephiroth);

        sephiroth.baseAttackStrong(byleth);

        sephiroth.swordStab(byleth);

        sephiroth.attackSpell(byleth);

        byleth.immobilizeWhipMove(sephiroth);
    }
}
