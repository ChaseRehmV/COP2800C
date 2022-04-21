public class Sephiroth extends Fighter implements SwordUse, MagicAbility {
    private final int swordDmg = 20;
    private final int magicRating = 2;

    Sephiroth() {
        super(220, 15, "Sephiroth");
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
