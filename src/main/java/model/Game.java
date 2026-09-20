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
    
public Game(String idGame, String namaGame, double harga) {
    this.idGame = idGame;
    this.namaGame = namaGame;
    this.harga = harga;
    }

public String getIdGame() { return idGame; }
public void setIdGame(String idGame) { this.idGame = idGame; }

public String getNamaGame() { return namaGame; }
public void setNamaGame(String namaGame) { this.namaGame = namaGame; }

public double getHarga() { return harga; }
public void setHarga(double harga) { this.harga = harga; }

public void tampilkanDetail() {
    System.out.println("ID: " + idGame + " | Nama: " + namaGame + " | Harga: Rp " + harga);
    }
}
