import java.util.ArrayList;
import java.util.List;

public class Monster {
    private String name;
    private float health;

    private List<Weapon> weapons;

    public Monster(String name, float health)
    {
        this.name = name;
        this.health = health;

        weapons = new ArrayList<>();
    }

    public void addWeapon(Weapon weapon)
    {
        weapons.add(weapon);
    }

    public String getName() { return name; }

    public float getHealth() { return health; }

    public float getDamage()
    {
        float dmg = .0f;
        for(Weapon weapon : weapons)
        {
            if(weapon.getType() == WeaponType.Attack)
            {
                dmg += weapon.getStat();
            }
        }

        return dmg;
    }

    public float getArmor()
    {
        float armor = .0f;
        for(Weapon weapon : weapons)
        {
            if(weapon.getType() == WeaponType.Defense)
            {
                armor += weapon.getStat();
            }
        }

        return armor;
    }

    public void attack(Monster target)
    {
        target.takeDamage(getDamage());
    }

    private void takeDamage(float amount)
    {
        float armor = getArmor();
        health -= amount * (armor >= 0
            ? 100 / (100 + armor)
            : 2 - (100 / (100 - armor)));
    }
}
