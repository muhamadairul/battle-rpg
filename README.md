# 🎮 Battle RPG: Console Arena

Game RPG sederhana berbasis console dengan mekanisme turn-based. Dibuat sebagai Mini Project untuk mata kuliah **Pemrograman Berorientasi Objek (PBO)**.

---

## 📌 Deskripsi

Battle RPG: Console Arena adalah game text-based di mana pemain bertarung melawan musuh menggunakan tiga aksi utama:

* **Attack**
* **Defend**
* **Use Item (Potion)**

Game berjalan hingga salah satu karakter kehabisan HP. Program ini dibuat untuk menerapkan konsep OOP seperti **class**, **object**, **inheritance**, **polymorphism**, dan **encapsulation**.

---

## ✨ Fitur Utama

* 🧍 **1 Player vs 1 Enemy**
* ⚔️ Aksi Player: Attack, Defend, Use Item
* 💊 Item: Potion (memulihkan HP)
* 🎯 Enemy menyerang otomatis setiap turn
* 🏁 Kondisi menang/kalah jelas

---

## 🧱 Struktur Class

Program ini terdiri dari beberapa class berikut:

| Class       | Deskripsi                                  |
| ----------- | ------------------------------------------ |
| `Character` | Abstract class, parent dari Player & Enemy |
| `Player`    | Class utama yang dikendalikan pemain       |
| `Enemy`     | Musuh yang menyerang otomatis              |
| `Item`      | Item yang dapat digunakan player           |
| `Game`      | Mengatur alur permainan                    |
| `Main`      | Entry point untuk menjalankan game         |

---

## 🗂️ Struktur Folder

```
BattleRPG/
│
├── Main.java
├── Game.java
├── Character.java
├── Player.java
├── Enemy.java
└── Item.java
```

---

## ▶️ Cara Menjalankan

### **1. Pastikan Java sudah terinstal**

```
java -version
```

### **2. Compile semua file Java**

Masuk ke folder project:

```
cd BattleRPG
```

Compile:

```
javac *.java
```

### **3. Jalankan game**

```
java Main
```

---

## 💡 Contoh Gameplay

```
Enter your name:
Rull

===== BATTLE START =====

Your HP: 100
Enemy HP: 80

Choose action:
1. Attack
2. Defend
3. Use Item
=> 1

Rull attacks dealing 15 damage!
Enemy attacks dealing 10 damage!
```

---

## 🛠️ Konsep OOP yang Digunakan

* **Encapsulation** → atribut private, getter/setter
* **Inheritance** → Enemy & Player mewarisi Character
* **Polymorphism** → method `attack()` dioverride
* **Association** → Player memiliki Item

---

## 👨‍💻 Dibuat Untuk

Mata Kuliah **Pemrograman Berorientasi Objek (PBO)**
Mini Project: Game Console-Based

---

## 📜 Lisensi

Proyek ini dibuat untuk tujuan pembelajaran. Silakan gunakan, modifikasi, atau kembangkan sesuai kebutuhan.

---
