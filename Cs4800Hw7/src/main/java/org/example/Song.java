package org.example;

public class Song {
    Integer songID;
    String title;
    String artist;
    String album;
    int duration;

    public Song (Integer songID, String title, String artist, String album, int duration){
        this.songID = songID;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public Integer getSongID() {
        return songID;
    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public String getAlbum(){
        return album;
    }
    public int getDuration(){
        return duration;
    }
    public String printableSong(){
        return this.getTitle() +" ~ "+ this.getAlbum() + " by. " + this.getArtist() + " Duration: " + this.getDuration();
    }
}
