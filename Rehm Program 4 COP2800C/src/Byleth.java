public class Byleth extends Fighter implements SwordUse, WhipTool {
    private final int bylethAttackPower = 25;
    private final int bylethTotalHealth = 250;
    private final int bylethSwordDmg = 12;
    private final String name = "Byleth";

    Byleth() {
        this.setBaseAttackPower(bylethAttackPower);
        this.setCurrentHealth(bylethTotalHealth);
        this.setTotalHealth(bylethTotalHealth);
        this.setName(name);
    }

    @Override
    public void swordSwipe(Fighter opponent) {
        int damage = this.getBaseAttackPower() + bylethSwordDmg;
        int health = opponent.getCurrentHealth();
        opponent.setCurrentHealth(health - damage);
    }

    @Override
    public void swordStab(Fighter opponent) {
        int damage = this.getBaseAttackPower() + bylethSwordDmg + 5;
        int health = opponent.getCurrentHealth();
        opponent.setCurrentHealth(health - damage);
    }

    @Override
    public void immobilizeWhipMove(Fighter opponent) {
        opponent.setCanAttack(false);
    }
}
