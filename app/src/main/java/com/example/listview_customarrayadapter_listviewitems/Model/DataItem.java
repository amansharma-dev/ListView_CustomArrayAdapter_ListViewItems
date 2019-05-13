package com.example.listview_customarrayadapter_listviewitems.Model;

public class DataItem {

    private String id;
    private String songName;
    private String artistName;
    private int likes;
    private long views;
    private String image;

    @Override
    public String toString() {
        return "DataItem{" +
                "id='" + id + '\'' +
                ", songName='" + songName + '\'' +
                ", artistName='" + artistName + '\'' +
                ", likes=" + likes +
                ", views=" + views +
                ", image='" + image + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public long getViews() {
        return views;
    }

    public void setViews(long views) {
        this.views = views;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public DataItem(String id, String songName, String artistName, int likes, long views, String image) {
        this.id = id;
        this.songName = songName;
        this.artistName = artistName;
        this.likes = likes;
        this.views = views;
        this.image = image;
    }
}
