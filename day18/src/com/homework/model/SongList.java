package com.homework.model;

import java.util.*;

public class SongList {

    Scanner scanner=new Scanner(System.in);
    static ArrayList<Song> arrayList=new ArrayList();
    public void addSong(){
        System.out.println("请输入歌曲名（songName）：");
        String s= scanner.nextLine();
        System.out.println("请输入歌手名（singerName）：");
        String a=scanner.nextLine();
        System.out.println("请输入播放时长（playTime）：");
        int p=Integer.parseInt(scanner.nextLine());
        //Song song=new Song(s,a,p);
        arrayList.add(new Song(s,a,p));
    }
    public void showSong(){
        for (Song song:arrayList){
            System.out.println("歌曲名是："+song.getSongName()+"  歌手名是："
                                 +song.getSingerName()+ "  歌曲播放时长："+ song.getPlayTime());
        }

    }
    public void deleteSong(){
        System.out.println("删除歌曲：");
        int index=findIndex();
        arrayList.remove(index);
    }

    public void findSong(){
        System.out.println("查找歌曲：");
        int index=findIndex();
        System.out.println("歌曲名是："+arrayList.get(index).getSongName()+"  歌手名是："
                              +arrayList.get(index).getSingerName()+"  歌曲播放时长："
                              + arrayList.get(index).getPlayTime());
    }
    public int  findIndex(){
        System.out.println("请输入待查找的歌曲名");
        String s=scanner.nextLine();
        for (int i=0;i<arrayList.size();i++) {
            if (s.equals(arrayList.get(i).getSongName())){
                return i;
            }
        }return -1;
    }
    public void maxPlayTime(){
        Optional<Song> max = arrayList.stream()
                .max((o1, o2) -> o1.getPlayTime() - o2.getPlayTime());
        max.ifPresent(System.out::println);

        }
    }

