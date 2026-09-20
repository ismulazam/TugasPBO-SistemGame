/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mismu
 */
public class GameMobile extends Game {
    private double ukuranStorageGb;
    private String dukunganOs;

    public GameMobile(String idGame, String namaGame, double harga, double ukuranStorageGb, String dukunganOs) {
        super(idGame, namaGame, harga);
        this.ukuranStorageGb = ukuranStorageGb;
        this.dukunganOs = dukunganOs;
    }

    public double getUkuranStorageGb() { return ukuranStorageGb; }
    public void setUkuranStorageGb(double ukuranStorageGb) { this.ukuranStorageGb = ukuranStorageGb; }

    public String getDukunganOs() { return dukunganOs; }
    public void setDukunganOs(String dukunganOs) { this.dukunganOs = dukunganOs; }

    @Override
    public void tampilkanDetail() {
        System.out.println("[GAME MOBILE] ID: " + getIdGame() + " | Nama: " + getNamaGame() + 
                           " | Harga: Rp " + getHarga() + " | Storage: " + ukuranStorageGb + 
                           " GB | OS: " + dukunganOs);
    }
}