public class Enemy extends Character {
    public Enemy(String name) {
        super(name, 80, 15, 3);
    }

    @Override
    public void attack(Character target) {
        int damage = attackPower - target.defense;
        if (damage < 0)
            damage = 0;
        target.setHp(target.getHp() - damage);

        System.out.println(name + " menyerang dan menyebabkan " + damage + " kerusakan!");
    }
}