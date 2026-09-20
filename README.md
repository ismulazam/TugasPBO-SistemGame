# Sistem Manajemen Koleksi Game Digital

Proyek ini adalah aplikasi berbasis *Console* (Command Line Interface) menggunakan bahasa pemrograman Java. Aplikasi ini dirancang untuk mengelola pendataan koleksi game digital (Game PC dan Game Mobile) dengan mengimplementasikan konsep dasar Pemrograman Berorientasi Objek (PBO) dan arsitektur pola desain MVC (*Model-View-Controller*).

## Fitur Utama
Aplikasi ini dilengkapi dengan fitur CRUD sederhana dan validasi penanganan *error*:
- **Create:** Menambahkan data Game PC atau Game Mobile baru ke dalam koleksi.
- **Read:** Menampilkan seluruh daftar koleksi game dalam bentuk tabel yang rapi, dilengkapi dengan 6 *dummy data* awal.
- **Update:** Mengubah nama atau harga game berdasarkan ID pencarian.
- **Delete:** Menghapus data game dari koleksi berdasarkan ID.
- **Validasi Input:** Mencegah program *crash* saat pengguna memasukkan huruf pada isian yang seharusnya berupa angka (menggunakan penanganan `NumberFormatException`).

## Implementasi Pemrograman Berorientasi Objek (OOP)
Proyek ini memenuhi kriteria fundamental OOP sebagai berikut:
1. **Encapsulation:** Seluruh atribut pada kelas entitas menggunakan *access modifier* `private` dan dikelola menggunakan metode *Getter* dan *Setter*.
2. **Inheritance (Pewarisan):** Memiliki 1 *Superclass* utama yaitu `Game` yang menurunkan sifatnya ke 2 *Subclass* yaitu `GamePC` dan `GameMobile`.
3. **Polymorphism:** Menerapkan *Method Overriding* pada fungsi `tampilkanDetail()` di masing-masing *subclass* untuk mencetak spesifikasi platform yang berbeda.
4. **Collection:** Menggunakan `ArrayList` untuk menyimpan dan mengelola data objek secara dinamis.

## Struktur Packages (Arsitektur MVC)
Proyek ini memisahkan logika data, antarmuka, dan kontrol alur aplikasi ke dalam 3 *package* utama:

```text
com.sistem.game
│
├── model/                 -> Merepresentasikan struktur data (Entitas).
│   ├── Game.java          (Superclass - Atribut dasar game)
│   ├── GamePC.java        (Subclass 1 - Menambahkan atribut RAM & Platform)
│   └── GameMobile.java    (Subclass 2 - Menambahkan atribut Storage & OS)
│
├── view/                  -> Mengatur tampilan antarmuka (I/O).
│   └── ConsoleView.java   (Menampilkan menu navigasi dan menerima input)
│
├── controller/            -> Menjembatani View dan Model (Logika Bisnis).
│   └── GameController.java(Mengelola ArrayList, logika CRUD, dan pencarian)
│
└── Main.java              -> Entry point aplikasi (Menjalankan program).
