package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import java.util.List;

class ProxySongServerTest {

    @org.junit.Test
    void searchByIdTest() {
        SongService testServer = new ProxySongServer();
        Song testSong = testServer.searchById(1);
        Song song1 = new Song(1, "One More Time", "Daftpunk", "Discovery", 122);
        Assertions.assertEquals(song1, testSong);
    }

    @org.junit.jupiter.api.Test
    void searchByTitle() {
        SongService testServer = new ProxySongServer();
        List<Song> songList1 = testServer.searchByTitle("(They Long To Be) Close To You");
        List<Song> songListTest = new ArrayList<Song>();
        Song songTest1 = new Song(7, "(They Long To Be) Close To You", "The Cranberries", "No Need To Argue", 127);
        Song songTest2 = new Song(8, "(They Long To Be) Close To You", "Carpenters", "Close To You", 125);
        songListTest.add(songTest1);
        songListTest.add(songTest2);
        for(int i = 0; i< songList1.size(); i++){
            Assertions.assertEquals(songListTest.get(i), songList1.get(i));
        }

    }

    @org.junit.jupiter.api.Test
    void searchByAlbum() {
        SongService testServer = new ProxySongServer();
        List<Song> songList2 = testServer.searchByAlbum("Discovery");
        List<Song> songListTest = new ArrayList<Song>();
        Song songTest1 = new Song(4, "Harder Better Faster Stronger", "Daftpunk", "Discovery", 135);
        Song songTest2 = new Song(1, "One More Time", "Daftpunk", "Discovery", 122);
        songListTest.add(songTest1);
        songListTest.add(songTest2);
        for(int i = 0; i< songList2.size(); i++){
            Assertions.assertEquals(songListTest.get(i), songList2.get(i));
        }
    }
}