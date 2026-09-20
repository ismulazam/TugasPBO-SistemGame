
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
        daftarGame.add(new GamePC("PC01", "The Witcher 3", 350000, 8, "Steam"));
        daftarGame.add(new GameMobile("MB01", "Genshin Impact", 0, 15.5, "Cross-Platform"));
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
            for (Game game : daftarGame) {
                game.tampilkanDetail(); 
            }
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
