public class Item {
    private String name;
    private int healAmount;

    public Item(String name, int healAmount) {
        this.name = name;
        this.healAmount = healAmount;
    }

    public void use(Player p) {
        p.setHp(p.getHp() + healAmount);
        System.out.println(p.getName() + " menggunakan " + name + " dan memulihkan " + healAmount + " HP!");
    }
}
