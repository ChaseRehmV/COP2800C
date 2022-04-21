public class Byleth extends Fighter implements SwordUse, WhipTool {
    private final int swordDmg = 12;

    Byleth() {
        super(250, 25, "Byleth");
    }

    @Override
    public void swordSwipe(Fighter opponent) {
        int damage = this.getBaseAttackPower() + swordDmg;
        int health = opponent.getCurrentHealth();
        opponent.setCurrentHealth(health - damage);
    }

    @Override
    public void swordStab(Fighter opponent) {
        int damage = this.getBaseAttackPower() + swordDmg + 5;
        int health = opponent.getCurrentHealth();
        opponent.setCurrentHealth(health - damage);
    }

    @Override
    public void immobilizeWhipMove(Fighter opponent) {
        opponent.setCanAttack(false);
    }
}
