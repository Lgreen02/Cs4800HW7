package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.HashMap;
public class RealSongServer implements SongService{
    HashMap<Integer, Song> songCatalog = new HashMap<>();
    public RealSongServer(){
        //add 15 songs to hashmap
        Song song1 = new Song(1, "One More Time", "Daftpunk", "Discovery", 122);
        Song song2 = new Song(2, "Like a Rollin' Stone", "Bob Dylan", "Highway 61 Revisted", 349);
        Song song3 = new Song(3, "Fool on the Hill", "The Beatles", "Magical Mystery Tour", 156);
        Song song4 = new Song(4, "Harder Better Faster Stronger", "Daftpunk", "Discovery", 135);
        Song song5 = new Song(5, "Come Together", "The Beatles", "Abbey Road", 175);
        Song song6 = new Song(6, "Because", "The Beatles", "Abbey Road", 164);
        Song song7 = new Song(7, "(They Long To Be) Close To You", "The Cranberries", "No Need To Argue", 127);
        Song song8 = new Song(8, "(They Long To Be) Close To You", "Carpenters", "Close To You", 125);
        Song song9 = new Song(9, "Sunday", "The Cranberries", "Everybody Else Is Doing It, So Why Can't We", 130);
        Song song10 = new Song(10, "Won't Back Down", "Sam Elliot", "Barnyard Soundtrack", 122);
        songCatalog.put(song1.getSongID(), song1);
        songCatalog.put(song2.getSongID(), song2);
        songCatalog.put(song3.getSongID(), song3);
        songCatalog.put(song4.getSongID(), song4);
        songCatalog.put(song5.getSongID(), song5);
        songCatalog.put(song6.getSongID(), song6);
        songCatalog.put(song7.getSongID(), song7);
        songCatalog.put(song8.getSongID(), song8);
        songCatalog.put(song9.getSongID(), song9);
        songCatalog.put(song10.getSongID(), song10);
    }
    @Override
    public Song searchById(Integer songID) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}

        return songCatalog.get(songID);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        List<Song> songList = new ArrayList<>();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
        for (Song song : songCatalog.values()) {
            if (song.getTitle().equals(title)) {
                songList.add(song);
            }
        }

        return songList;
    }

    public int countTitleAppearances(String title){
        List<Song> songList = searchByTitle(title);
        return songList.size();
    }
    public int countAlbumAppearances(String album){
        List<Song> songList = searchByAlbum(album);
        return songList.size();
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        List<Song> songList = new ArrayList<>();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
        for (Song song : songCatalog.values()) {
            if (song.getAlbum().equals(album)) {
                songList.add(song);
            }
        }
        return songList;
    }
}
