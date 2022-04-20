public class FightingGame {

    public static void printFighterHealths(Fighter fighter1, Fighter fighter2) {
        System.out.println(fighter1.getName() + " health: " + fighter1.getCurrentHealth());
        System.out.println(fighter2.getName() + " health: " + fighter2.getCurrentHealth());
        System.out.println();
    }

    public static void main(String[] args) {
        Byleth byleth = new Byleth();
        Sephiroth sephiroth = new Sephiroth();

        System.out.println("Sephiroth enters the fight!");
        System.out.println("Byleth enters the fight!");

        FightingGame.printFighterHealths(byleth, sephiroth);

        System.out.println("Byleth hits Sephiroth with a standard attack!");
        byleth.baseAttack(sephiroth);

        FightingGame.printFighterHealths(byleth, sephiroth);

        System.out.println("Sephiroth nails Byleth with a strong attack!");
        sephiroth.baseAttackStrong(byleth);

        FightingGame.printFighterHealths(byleth, sephiroth);

        System.out.println("Sephiroth stabs Byleth with his sword!");
        sephiroth.swordStab(byleth);

        FightingGame.printFighterHealths(byleth, sephiroth);

        System.out.println("Sephiroth hits Byleth with a magic attack!");
        sephiroth.attackSpell(byleth);

        FightingGame.printFighterHealths(byleth, sephiroth);

        System.out.println("Byleth hits Sephiroth with a whip attack! Sephiroth can't move!");
        byleth.immobilizeWhipMove(sephiroth);

        FightingGame.printFighterHealths(byleth, sephiroth);

    }
}
