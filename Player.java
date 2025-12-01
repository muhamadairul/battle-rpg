import java.util.ArrayList;

public class Player extends Character {
    private ArrayList<Item> inventory = new ArrayList<>();

    public Player(String name) {
        super(name, 100, 20, 5);
        inventory.add(new Item("Potion", 30));
    }

    @Override
    public void attack(Character target) {
        int damage = attackPower - target.defense;
        if (damage < 0)
            damage = 0;
        target.setHp(target.getHp() - damage);

        System.out.println(name + " menyerang dan mengakibatkan " + damage + " kerusakan!");
    }

    public void defend() {
        System.out.println(name + " sedang bertahan! Pertahanan +5 pada giliran ini.");
        defense += 5;
    }

    public void useItem() {
        if (inventory.isEmpty()) {
            System.out.println("Tidak ada item tersisa!");
            return;
        }
        Item i = inventory.remove(0);
        i.use(this);
    }
}