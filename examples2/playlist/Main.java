package examples2.playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        album = new Album("C30-C39 EP", "PRO8L3M");
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
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);  // There is no track 24
        albums.get(2).addToPlayList(4, playList);
        albums.get(2).addToPlayList(3, playList);
        albums.get(2).addToPlayList(2, playList);

        PlaylistService.navigatePlaylist(playList);


    }
}
