
package controller;

import model.Game;
import model.GamePC;
import model.GameMobile;
import java.util.ArrayList;

public class GameController {
    private ArrayList<Game> daftarGame;

    public GameController() {
        daftarGame = new ArrayList<>();
         // data awal
        daftarGame.add(new GamePC("PC01", "The Witcher 3: Wild Hunt", 350000, 8, "Steam"));
        daftarGame.add(new GamePC("PC02", "Cyberpunk 2077", 699000, 16, "Epic Games"));
        daftarGame.add(new GamePC("PC03", "Roblox", 0, 4, "Roblox Player"));
        daftarGame.add(new GameMobile("MB01", "Genshin Impact", 0, 15.5, "Cross-Platform"));
        daftarGame.add(new GameMobile("MB02", "Mobile Legends: Bang Bang", 0, 5.2, "Android/iOS"));
        daftarGame.add(new GameMobile("MB03", "Minecraft", 109000, 1.5, "Android/iOS"));
     }
    
    // CREATE
    public void tambahGame(Game game) {
        daftarGame.add(game);
        System.out.println("Game berhasil ditambahkan ke koleksi!");
    }
    
    // READ
        public void tampilkanSemuaGame() {
            if (daftarGame.isEmpty()) {
                System.out.println("Koleksi game masih kosong.");
            } else {
                // Membuat Header Tabel
                System.out.println("-------------------------------------------------------------------------------------------------------");
                System.out.printf("| %-5s | %-28s | %-12s | %-12s | %-28s |%n", "ID", "NAMA GAME", "PLATFORM", "HARGA", "SPESIFIKASI KHUSUS");
                System.out.println("-------------------------------------------------------------------------------------------------------");

                for (Game game : daftarGame) {
                    game.tampilkanDetail(); 
                }
                System.out.println("-------------------------------------------------------------------------------------------------------");
            }
        }

    // METHOD BANTUAN UNTUK PENCARIAN
    public Game cariGame(String id) {
        for (Game game : daftarGame) {
            if (game.getIdGame().equalsIgnoreCase(id)) {
                return game;
            }
        }
        return null;
    }

    // DELETE
    public boolean hapusGame(String id) {
        Game gameDitemukan = cariGame(id);
        if (gameDitemukan != null) {
            daftarGame.remove(gameDitemukan);
            return true;
        }
        return false;
    }
}
