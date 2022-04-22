public abstract class Fighter {
    private int totalHealth;
    private int currentHealth;
    private boolean canAttack;
    private int baseAttackPower;
    private String name;

    Fighter(int totalHealth, int baseAttackPower, String name) {
        this.currentHealth = totalHealth;
        this.totalHealth = totalHealth;
        this.baseAttackPower = baseAttackPower;
        this.name = name;
        this.canAttack = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalHealth(int totalHealth) {
        this.totalHealth = totalHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getBaseAttackPower() {
        return baseAttackPower;
    }

    public void setBaseAttackPower(int baseAttackPower) {
        this.baseAttackPower = baseAttackPower;
    }

    public boolean canAttack() {
        return canAttack;
    }

    public void setCanAttack(boolean canAttack) {
        this.canAttack = canAttack;
    }

    // Each of the below attack methods takes in a Fighter object as a method parameter.
    // In the main program, the method is always called by a character specific subclass of the Fighter class.
    // The method taking in a Fighter object but then calling the methods needed from the character subclass
    // is a form of derived/base class reference conversion. This is a form of Polymorphism.
    public void baseAttack(Fighter opponent) {
        int damage = this.baseAttackPower;
        int health = opponent.getCurrentHealth();
        opponent.setCurrentHealth(health - damage);
        System.out.println(this.getName() + " hits " + opponent.getName() + " with a standard attack!");
        FightingGame.printFighterHealths(this, opponent);
    }

    public void baseAttackLight(Fighter opponent) {
        int damage = this.baseAttackPower - 5;
        int health = opponent.getCurrentHealth();
        opponent.setCurrentHealth(health - damage);
        System.out.println(this.getName() + " jabs " + opponent.getName() + " with a light attack!");
        FightingGame.printFighterHealths(this, opponent);
    }

    public void baseAttackStrong(Fighter opponent) {
        int damage = this.baseAttackPower + 5;
        int health = opponent.getCurrentHealth();
        opponent.setCurrentHealth((health - damage));
        System.out.println(this.getName() + " nails " + opponent.getName() + " with a heavy attack!");
        FightingGame.printFighterHealths(this, opponent);
    }

}
