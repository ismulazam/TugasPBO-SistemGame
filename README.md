# Sistem Manajemen Koleksi Game Digital (PBO)

## 1. Deskripsi Proyek
Aplikasi **Sistem Manajemen Koleksi Game Digital** adalah program berbasis antarmuka baris perintah (CLI) yang dibangun menggunakan bahasa Java. Program ini berfungsi untuk mendata, melihat, mengubah, dan menghapus (CRUD) koleksi game digital yang dimiliki oleh pengguna. 

Kegunaan utama program ini adalah memudahkan klasifikasi spesifikasi game berdasarkan platformnya (PC atau Mobile). Proyek ini menerapkan arsitektur MVC (Model-View-Controller) dan mencakup seluruh elemen wajib Pemrograman Berorientasi Objek (OOP) meliputi:
- **Inheritance:** Menggunakan model *Hierarchical Inheritance* dengan 1 Superclass (`Game`) dan 2 Subclass (`GamePC` dan `GameMobile`).
- **Polymorphism:** Menerapkan **Method Overriding** pada method `tampilkanDetail()` di subclass, serta **Method Overloading** pada Constructor dan method `tampilkanDetail(boolean)` di class entitas dasar.
- **Condition (If-Else):** Digunakan untuk validasi data kosong, pencarian ID game, dan logika menu.
- **Looping:** Menggunakan `do-while` untuk menahan program agar terus berjalan sampai user memilih keluar, dan `for-each` untuk mencetak seluruh isi `ArrayList`.

---

## 2. Alur Program
Program dieksekusi melalui file `Main.java` yang akan memanggil objek `ConsoleView`. Berikut adalah alur kerja sistem:
1. **Inisialisasi Data Awal:** Saat program dijalankan, `GameController` secara otomatis mengisi koleksi dengan 6 *dummy data* (3 Game PC dan 3 Game Mobile) ke dalam `ArrayList`.
2. **Menampilkan Menu:** Layar akan menampilkan 6 opsi menu menggunakan perulangan `do-while`. Pengguna memilih menu dengan memasukkan angka. Jika input bukan angka, blok `try-catch` akan menangani *error* tersebut.
3. **Menu 1 (Read):** Program melakukan *looping* pada `ArrayList` dan memanggil method `tampilkanDetail()` yang akan mencetak tabel rapi menggunakan fitur format *print* (`printf`).
4. **Menu 2 & 3 (Create):** Program meminta input pengguna (ID, Nama, Harga, Spesifikasi). Data tersebut dibungkus ke dalam objek `GamePC` atau `GameMobile`, lalu dimasukkan ke dalam `ArrayList`.
5. **Menu 4 & 5 (Update & Delete):** Pengguna memasukkan ID Game. Sistem menggunakan *if-else* untuk memeriksa apakah ID cocok. Jika cocok, atribut harga/nama akan ditimpa (Update) atau objek akan dihapus dari *list* (Delete).
6. **Menu 6 (Exit):** Memutus perulangan `do-while` dan menghentikan program.

---

## 3. Penjelasan Gambar (Screenshot Output)

### A. Tampilan Tabel Daftar Game (Read & Dummy Data)
<img width="620" height="287" alt="image" src="https://github.com/user-attachments/assets/4a1696d9-1141-43b3-8c64-d660d0ab96b9" />

**Penjelasan:** Gambar di atas menunjukkan *output* saat pengguna memilih menu 1. Program menampilkan 6 *dummy data* awal yang sudah di-*hardcode*. Method overriding bekerja secara otomatis membedakan pencetakan kolom spesifikasi (RAM/Platform untuk PC, dan Size/OS untuk Mobile).

### B. Validasi Input (Error Handling)
<img width="245" height="255" alt="image" src="https://github.com/user-attachments/assets/11f88e26-3366-4467-b0a3-61e6fc74927b" />

**Penjelasan:** Gambar ini menunjukkan saat pengguna mencoba memasukkan huruf pada isian "Pilih menu (Angka)" atau "Harga". Sistem tidak *crash*, melainkan memunculkan pesan peringatan berkat penanganan exception dan langsung mengulang prompt input.

### C. Proses Penambahan & Penghapusan Data (Create & Delete)
<img width="332" height="368" alt="image" src="https://github.com/user-attachments/assets/a3e95968-5e2b-4b8c-82f4-2f42689f732c" />

**Penjelasan:** Memperlihatkan interaksi di mana pengguna berhasil memasukkan ID game baru dan langsung mengeksekusi penghapusan berdasarkan ID menggunakan logika pencarian berantai (`if-else` kondisi).
