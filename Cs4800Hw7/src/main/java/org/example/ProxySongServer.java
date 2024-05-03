package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProxySongServer implements SongService{
    private static HashMap<Integer,Song> songCache = new HashMap<>();
    RealSongServer server = new RealSongServer();
    @Override
    public Song searchById(Integer songID) {
        if(!songCache.containsKey(songID)){
            songCache.put(songID,server.searchById(songID));
           // return server.searchById(songID);
        }
        return songCache.get(songID);

    }

    @Override
    public List<Song> searchByTitle(String title) {
        List<Song> songList = new ArrayList<>();
        for (Song song : songCache.values()) {
            if (song.getTitle().equals(title)) {
                songList.add(song);
            }
        }
        if (songList.size() != server.countTitleAppearances(title)) {
            List<Song> serverList = server.searchByTitle(title);
            for (Song song : serverList) {
                if (!songList.contains(song)) {
                    songList.add(song);
                    songCache.put(song.getSongID(), song);
                }
            }
        }
        return songList;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        List<Song> songList = new ArrayList<>();
        for (Song song : songCache.values()) {
            if (song.getAlbum().equals(album)) {
                songList.add(song);
            }
        }
        if (songList.size() != server.countAlbumAppearances(album)) {
            List<Song> serverList = server.searchByAlbum(album);
            for (Song song : serverList) {
                if (!songList.contains(song)) {
                    songList.add(song);
                    songCache.put(song.getSongID(), song);
                }
            }
        }
        return songList;
    }
}
