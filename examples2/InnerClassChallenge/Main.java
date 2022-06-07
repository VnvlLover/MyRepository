package examples2.InnerClassChallenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();



        Album album = new Album("C30-C39 EP", "PRO8L3M");
        album.addSong("Dwa trzynascie", 2.52);
        album.addSong("Tori Black", 3.58);
        album.addSong("Kickdown", 4.19);
        album.addSong("Tiramisu", 3.39);
        album.addSong("Letnie przesilenie", 4.27);
        album.addSong("200 procent prawdy", 4.03);
        album.addSong("Teoria bezwzglednosci", 3.50);
        album.addSong("Opowiesc o Tobie", 4.37);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Letnie przesilenie", playList);
        albums.get(0).addToPlayList("Tiramisu", playList);
        albums.get(0).addToPlayList("Tori Black", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);

        PlaylistService.navigatePlaylist(playList);


    }
}
