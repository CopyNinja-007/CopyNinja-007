package com.homework.model;

public class Song {
    private String songName;
    private String singerName;
    private int playTime;

    public Song() {
    }

    public Song(String songName, String singerName, int playTime) {
        this.songName = songName;
        this.singerName = singerName;
        this.playTime = playTime;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getPlayTime() {
        return playTime;
    }

    public void setPlayTime(int playTime) {
        this.playTime = playTime;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                ", singerName='" + singerName + '\'' +
                ", playTime=" + playTime +
                '}';
    }
}
