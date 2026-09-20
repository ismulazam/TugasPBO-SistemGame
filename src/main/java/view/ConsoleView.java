/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.GameController;
import model.Game;
import model.GamePC;
import model.GameMobile;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ConsoleView {
    private GameController controller;
    private Scanner scanner;

    public ConsoleView() {
        controller = new GameController();
        scanner = new Scanner(System.in);
    }

    public void mulai() {
        int pilihan = 0;
        do {
            System.out.println("\n=== SISTEM MANAJEMEN KOLEKSI GAME ===");
            System.out.println("1. Lihat Koleksi Game");
            System.out.println("2. Tambah Game PC");
            System.out.println("3. Tambah Game Mobile");
            System.out.println("4. Ubah Data Game (Update)");
            System.out.println("5. Hapus Game (Delete)");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu (Angka): ");

            try {
                // Membaca input sebagai String lalu diubah ke Integer untuk mencegah bug Scanner melompati baris
                pilihan = Integer.parseInt(scanner.nextLine());

                switch (pilihan) {
                    case 1:
                        System.out.println("\n--- Daftar Koleksi Game ---");
                        controller.tampilkanSemuaGame();
                        break;
                    case 2:
                        inputGamePC();
                        break;
                    case 3:
                        inputGameMobile();
                        break;
                    case 4:
                        updateDataGame();
                        break;
                    case 5:
                        hapusDataGame();
                        break;
                    case 6:
                        System.out.println("Keluar dari program. Terima kasih!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Masukkan angka 1-6.");
                }
            } catch (NumberFormatException e) {
                // Menangkap error jika user memasukkan huruf di menu utama
                System.out.println("Error: Input harus berupa angka!");
            }
        } while (pilihan != 6);
    }

    private void inputGamePC() {
        try {
            System.out.print("Masukkan ID Game: ");
            String id = scanner.nextLine();
            System.out.print("Masukkan Nama Game: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Harga: Rp ");
            double harga = Double.parseDouble(scanner.nextLine());
            System.out.print("Masukkan Minimum RAM GB: ");
            int ram = Integer.parseInt(scanner.nextLine());
            System.out.print("Masukkan Platform Distribusi: ");
            String platform = scanner.nextLine();

            controller.tambahGame(new GamePC(id, nama, harga, ram, platform));
        } catch (NumberFormatException e) {
            System.out.println("Error: Harga dan RAM harus diisi dengan angka! Batal menambahkan data.");
        }
    }

    private void inputGameMobile() {
        try {
            System.out.print("Masukkan ID Game: ");
            String id = scanner.nextLine();
            System.out.print("Masukkan Nama Game: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Harga: Rp ");
            double harga = Double.parseDouble(scanner.nextLine());
            System.out.print("Masukkan Ukuran Storage GB: ");
            double storage = Double.parseDouble(scanner.nextLine());
            System.out.print("Masukkan Dukungan OS (Android/iOS): ");
            String os = scanner.nextLine();

            controller.tambahGame(new GameMobile(id, nama, harga, storage, os));
        } catch (NumberFormatException e) {
            System.out.println("Error: Harga dan Storage harus diisi dengan angka! Batal menambahkan data.");
        }
    }

    private void updateDataGame() {
        System.out.print("\nMasukkan ID Game yang ingin diubah: ");
        String id = scanner.nextLine();
        Game game = controller.cariGame(id);

        if (game != null) {
            try {
                System.out.println("Game Ditemukan: " + game.getNamaGame());
                System.out.print("Masukkan Nama Game Baru: ");
                String namaBaru = scanner.nextLine();
                System.out.print("Masukkan Harga Baru: Rp ");
                double hargaBaru = Double.parseDouble(scanner.nextLine());

                // Menyimpan data baru (Setter / Encapsulation)
                game.setNamaGame(namaBaru);
                game.setHarga(hargaBaru);
                System.out.println("Data game berhasil diperbarui!");
            } catch (NumberFormatException e) {
                System.out.println("Error: Harga harus berupa angka! Batal mengubah data.");
            }
        } else {
            System.out.println("Game dengan ID '" + id + "' tidak ditemukan.");
        }
    }

    private void hapusDataGame() {
        System.out.print("\nMasukkan ID Game yang ingin dihapus: ");
        String id = scanner.nextLine();
        
        boolean berhasil = controller.hapusGame(id);
        if (berhasil) {
            System.out.println("Game dengan ID '" + id + "' berhasil dihapus dari koleksi!");
        } else {
            System.out.println("Gagal menghapus! Game dengan ID '" + id + "' tidak ditemukan.");
        }
    }
}