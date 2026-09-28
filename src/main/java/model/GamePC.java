/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mismu
 */
public class GamePC extends Game {
    private int minimumRamGb;
    private String platformDistribusi;

    public GamePC(String idGame, String namaGame, double harga, int minimumRamGb, String platformDistribusi) {
        super(idGame, namaGame, harga);
        this.minimumRamGb = minimumRamGb;
        this.platformDistribusi = platformDistribusi;
    }

    public int getMinimumRamGb() { return minimumRamGb; }
    public void setMinimumRamGb(int minimumRamGb) { this.minimumRamGb = minimumRamGb; }

    public String getPlatformDistribusi() { return platformDistribusi; }
    public void setPlatformDistribusi(String platformDistribusi) { this.platformDistribusi = platformDistribusi; }

    @Override
    public void tampilkanDetail() {
        System.out.printf("| %-5s | %-28s | %-12s | Rp %-9.0f | RAM: %-2d GB, Dist: %-9s |%n", 
                getIdGame(), getNamaGame(), "PC Game", getHarga(), minimumRamGb, platformDistribusi);
    }
}