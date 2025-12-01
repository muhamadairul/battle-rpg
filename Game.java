import java.util.Scanner;

public class Game {
    public Game() {
    }

    public void start() {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String var2 = var1.nextLine();
        Player var3 = new Player(var2);
        Enemy var4 = new Enemy("Orc Warrior");
        this.battle(var3, var4);
    }

    private void battle(Player var1, Enemy var2) {
        Scanner var3 = new Scanner(System.in);
        System.out.println("\n===== PERTARUNGAN DIMULAI =====");

        while (var1.getHp() > 0 && var2.getHp() > 0) {
            System.out.println("\nHP Anda: " + var1.getHp());
            System.out.println("HP Musuh: " + var2.getHp());
            System.out.println("\nPilih aksi:");
            System.out.println("1. Serang");
            System.out.println("2. Bertahan");
            System.out.println("3. Gunakan Item");
            System.out.print("=> ");
            int var4 = var3.nextInt();
            switch (var4) {
                case 1:
                    var1.attack(var2);
                    break;
                case 2:
                    var1.defend();
                    break;
                case 3:
                    var1.useItem();
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

            if (var2.getHp() <= 0) {
                System.out.println("\nMusuh dikalahkan! Anda menang!");
                return;
            }

            System.out.println("\nGiliran musuh...");
            var2.attack(var1);
            if (var1.getHp() <= 0) {
                System.out.println("\nAnda gugur... Game Over!");
                return;
            }
        }
    }
}