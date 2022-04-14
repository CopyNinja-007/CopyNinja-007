package com.homework.test;


import com.homework.model.SongList;

public class TestSong {
    public static void main(String[] args) {
        SongList songList=new SongList();
        songList.addSong();
        songList.showSong();
        songList.findSong();
        songList.deleteSong();
        songList.showSong();
        songList.maxPlayTime();
    }
}
