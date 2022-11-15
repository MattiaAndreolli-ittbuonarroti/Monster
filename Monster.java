public class Monster {
    private String name;
    private float health;
    private float damage;
    private float armor;

    public Monster(String name, float health, float damage, float armor)
    {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.armor = armor;
    }

    public String getName() { return name; }

    public float getHealth() { return health; }

    public float getDamage() { return damage; }

    public float getArmor() { return armor; }

    public void attack(Monster target)
    {
        target.takeDamage(damage);
    }

    private void takeDamage(float amount)
    {
        health -= amount * (armor >= 0
            ? 100 / (100 + armor)
            : 2 - (100 / (100 - armor)));
    }
}
