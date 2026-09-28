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
        System.out.printf("| %-5s | %-28s | %-12s | Rp %-9.0f | Size: %-4.1f GB, OS: %-8s |%n", 
             getIdGame(), getNamaGame(), "Mobile Game", getHarga(), ukuranStorageGb, dukunganOs);
        }
}