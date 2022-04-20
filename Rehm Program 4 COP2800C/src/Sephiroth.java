public class Sephiroth extends Fighter implements SwordUse, MagicAbility {
    private final int sephirothAttackPower = 15;
    private final int sephirothTotalHealth = 220;
    private final int sephirothSwordDmg = 20;
    private final int magicRating = 2;
    private final String name = "Sephiroth";

    Sephiroth() {
        this.setBaseAttackPower(sephirothAttackPower);
        this.setCurrentHealth(sephirothTotalHealth);
        this.setTotalHealth(sephirothTotalHealth);
        this.setName(name);
    }

    @Override
    public void swordSwipe(Fighter opponent) {
        int damage = this.getBaseAttackPower() + sephirothSwordDmg;
        int health = opponent.getCurrentHealth();
        opponent.setCurrentHealth(health - damage);
    }

    @Override
    public void swordStab(Fighter opponent) {
        int damage = this.getBaseAttackPower() + sephirothSwordDmg + 5;
        int health = opponent.getCurrentHealth();
        opponent.setCurrentHealth(health - damage);
    }

    @Override
    public void weakeningSpell(Fighter opponent) {
        opponent.setBaseAttackPower(opponent.getBaseAttackPower() - 5);
    }

    @Override
    public void attackSpell(Fighter opponent) {
        int damage = magicBasePower * magicRating;
        int health = opponent.getCurrentHealth();
        opponent.setCurrentHealth(health - damage);
    }


}
