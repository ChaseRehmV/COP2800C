public abstract class Fighter {
    private int totalHealth;
    private int currentHealth;
    private boolean canAttack;
    private int baseAttackPower;
    private String name;

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

    public void baseAttack(Fighter opponent) {
        int damage = this.baseAttackPower;
        int health = opponent.getCurrentHealth();
        opponent.setCurrentHealth(health - damage);
    }

    public void baseAttackLight(Fighter opponent) {
        int damage = this.baseAttackPower - 5;
        int health = opponent.getCurrentHealth();
        opponent.setCurrentHealth(health - damage);
    }

    public void baseAttackStrong(Fighter opponent) {
        int damage = this.baseAttackPower + 5;
        int health = opponent.getCurrentHealth();
        opponent.setCurrentHealth((health - damage));
    }

}
