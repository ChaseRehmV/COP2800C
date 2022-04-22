public class Byleth extends Fighter implements SwordUse, WhipTool {
    private int swordDmg = 12;

    Byleth() {
        super(250, 25, "Byleth");
    }

    @Override
    public void swordSwipe(Fighter opponent) {
        int damage = this.getBaseAttackPower() + swordDmg;
        int health = opponent.getCurrentHealth();
        opponent.setCurrentHealth(health - damage);
        System.out.println(this.getName() + " swipes " + opponent.getName() + " with their sword!");
        FightingGame.printFighterHealths(this, opponent);
    }

    @Override
    public void swordStab(Fighter opponent) {
        int damage = this.getBaseAttackPower() + swordDmg + 5;
        int health = opponent.getCurrentHealth();
        opponent.setCurrentHealth(health - damage);
        System.out.println(this.getName() + " stabs " + opponent.getName() + " with their sword!");
        FightingGame.printFighterHealths(this, opponent);
    }

    @Override
    public void immobilizeWhipMove(Fighter opponent) {
        opponent.setCanAttack(false);
        System.out.println(this.getName() + " immobilizes " + opponent.getName() + " with their whip!");
        FightingGame.printFighterHealths(this, opponent);
    }
}
