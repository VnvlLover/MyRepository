package examples2.playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name,String artist){
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        Song song = findSong(title);
        if(song == null){
            song = new Song(title, duration);
            songs.add(song);
            return true;
        }
        return false;
    }

    private Song findSong(String title){
        for(int i = 0; i < songs.size(); i++){
            Song checkedSong = songs.get(i);
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        int size = songs.size();
        if(trackNumber <= size + 1) {
            Song song = findSong(songs.get(trackNumber - 1).getTitle());
            if (song != null) {
                playList.add(song);
                return true;
            }
        }
        return false;
    }
    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song song = findSong(title);
        if(song != null){
            playList.add(song);
            return true;
        }
        return false;
    }

    public void printMenu(){
        System.out.println("Choose options:" + "\n" +
                            "\t" + "1. Print menu." + "\n" +
                            "\t" + "2. Next song." + "\n" +
                            "\t" + "3. Previous song." + "\n" +
                            "\t" + "4. Replay song." + "\n" +
                            "\t" + "5. Print song list." + "\n" +
                            "\t" + "6. Quit." + "\n");
    }

}
