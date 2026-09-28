/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mismu
 */

public class Game {
    private String idGame;
    private String namaGame;
    private double harga;

    // Constructor 1 (Lengkap)
    public Game(String idGame, String namaGame, double harga) {
        this.idGame = idGame;
        this.namaGame = namaGame;
        this.harga = harga;
    }

    // Constructor 2 (Polymorphism: Overloading - Jika game gratis)
    public Game(String idGame, String namaGame) {
        this.idGame = idGame;
        this.namaGame = namaGame;
        this.harga = 0.0; 
    }

    public String getIdGame() { return idGame; }
    public void setIdGame(String idGame) { this.idGame = idGame; }
    public String getNamaGame() { return namaGame; }
    public void setNamaGame(String namaGame) { this.namaGame = namaGame; }
    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }

    // Method 1 (Akan di-override oleh subclass)
    public void tampilkanDetail() {
        System.out.println("ID: " + idGame + " | Nama: " + namaGame);
    }
    
    // Method 2 (Polymorphism: Overloading - Menampilkan detail dengan format khusus)
    public void tampilkanDetail(boolean formatSingkat) {
        if (formatSingkat) { // Penerapan Condition (If)
            System.out.println(idGame + " - " + namaGame);
        } else {
            tampilkanDetail();
        }
    }
}
