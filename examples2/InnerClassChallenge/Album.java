package examples2.InnerClassChallenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name,String artist){
        this.name = name;
        this.artist = artist;
        songs = new SongList();
    }

    public boolean addSong(String title, double duration){
        return this.songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
       Song checkedSong = this.songs.findSong(trackNumber);
       if(checkedSong != null){
           playList.add(checkedSong);
           return true;
       }
       return false;
    }
    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song checkedSong = this.songs.findSong(title);
        if(checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        return false;
    }





    private class SongList{
        private ArrayList<Song> songs;

        public SongList(){
            this.songs = new ArrayList<Song>();
        }
        public boolean add(Song song){
            if(this.songs.contains(song)){
                return false;
            }else{
                this.songs.add(song);
                return true;
            }
        }
        public Song findSong(String title){
            for(int i = 0; i < this.songs.size(); i++){
                Song checkedSong = this.songs.get(i);
                if(checkedSong.getTitle().equals(title)){
                    return checkedSong;
                }
            }
            return null;
        }
        public Song findSong(int trackNumber){
            trackNumber--;
            if(trackNumber >= 0 && songs.size() > trackNumber){
                return songs.get(trackNumber);
            }
            return null;
        }
    }



}
