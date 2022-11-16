/*
 * Base class for all weapons
 */
public class WeaponBase
{
    private String name;    //Name of the weapon
    private float stat; //Stat value of the weapon
    private WeaponType type;    //Type of the weapon

    public WeaponBase(String name, float stat, WeaponType type)
    {
        this.name = name;
        this.stat = stat;
        this.type = type;
    }

    public String getName()
    {
        return name;
    }

    public float getStat()
    {
        return stat;
    }

    public WeaponType getType()
    {
        return type;
    }
}
