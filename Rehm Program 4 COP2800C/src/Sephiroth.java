public class Sephiroth extends Fighter implements SwordUse, MagicAbility {
    private int swordDmg = 20;
    private int magicRating = 2;

    // Constructor that utilizes the super keyword to call the Fighter class constructor and fill the
    // fields the Fighter class for the created object.
    // This was to avoid having attackDamage, totalHealth and name fields in every character subclass.
    Sephiroth() {
        super(220, 15, "Sephiroth");
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
    public void weakeningSpell(Fighter opponent) {
        opponent.setBaseAttackPower(opponent.getBaseAttackPower() - 5);
        System.out.println(this.getName() + " successfully hits " + opponent.getName() + " with a weakening spell!");
        FightingGame.printFighterHealths(this, opponent);
    }

    @Override
    public void attackSpell(Fighter opponent) {
        int damage = magicBasePower * magicRating;
        int health = opponent.getCurrentHealth();
        opponent.setCurrentHealth(health - damage);
        System.out.println(this.getName() + " successfully hits " + opponent.getName() + " with a spell attack!");
        FightingGame.printFighterHealths(this, opponent);
    }


}
