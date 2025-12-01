public abstract class Character {
    protected String name;
    protected int hp;
    protected int attackPower;
    protected int defense;

    public Character(String name, int hp, int attackPower, int defense) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        this.defense = defense;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public abstract void attack(Character target);
}
