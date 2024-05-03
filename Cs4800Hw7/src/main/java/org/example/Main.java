package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SongService service = new ProxySongServer();
        Song song1 = service.searchById(1);
       List<Song> songList1 = service.searchByTitle("(They Long To Be) Close To You");
       List<Song> songList2 = service.searchByAlbum("Discovery");

       List<Song> songList3 = service.searchByAlbum("Discovery"); //testing the speed
       System.out.println(song1.printableSong());
       for(int i=0;i<songList1.size();i++){
           System.out.println(songList1.get(i).printableSong());
        }
       for(int i=0;i<songList2.size();i++){
            System.out.println(songList2.get(i).printableSong());
        }
        for(int i=0;i<songList3.size();i++){
            System.out.println(songList3.get(i).printableSong());
        }


    }
}