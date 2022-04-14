package com.homework.test;

import com.homework.model.Card;

import java.util.*;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/1 11:32
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class Test {

    public static void main(String[] args) {
        List<Card> hashList = xiPai();
        List<Card> play1 = new ArrayList<>();
        List<Card> play2 = new ArrayList<>();
        List<Card> diZhu = new ArrayList<>();
        List<Card> diPai = new ArrayList<>();
        faPai(hashList,play1,play2,diZhu,diPai);
        show(play1,play2,diZhu,diPai);
    }
    private static void show(List play1,List play2,List diZhu,List diPai) {
        System.out.print("农民1:");
        play1.forEach(card -> System.out.print("  " + card + "  "));
        System.out.println();
        System.out.print("农民2:");
        play2.forEach(card -> System.out.print("  " + card + "  "));
        System.out.println();
        System.out.print("地主:");
        diZhu.forEach(card -> System.out.print("  " + card + "  "));
        System.out.println();
        System.out.print("底牌:");
        diPai.forEach(card -> System.out.print("  " + card + "  "));
    }

    private static void faPai(List<? extends Card> hashList,List play1,List play2,List diZhu,List diPai) {
        int i = 0;
        for (Card card : hashList) {
            if (i < 3) {
                diPai.add(card);
            }else if (i < 20) {
                play1.add(card);
            }else if (i < 37) {
                play2.add(card);
            }else diZhu.add(card);
            i++;
        }
    }

    private static List<Card> xiPai() {
        List<Card> hashList = new ArrayList<>();
        Card card = new Card();
        for (int i = 1; i <= 13; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 1) {
                    card.setNum("A");
                }else if (i == 11) {
                    card.setNum("J");
                }else if (i == 12) {
                    card.setNum("Q");
                }else if (i == 13) {
                    card.setNum("K");
                }else card.setNum(i+"");
                switch (j) {
                    case 0:
                        card.setHuaSe("♠");
                        break;
                    case 1:
                        card.setHuaSe("♥");
                        break;
                    case 2:
                        card.setHuaSe("♦");
                        break;
                    case 3:
                        card.setHuaSe("♣");
                        break;
                }

                hashList.add(new Card(card.getHuaSe(),card.getNum()));
            }
        }
        hashList.add(new Card("大","王"));
        hashList.add(new Card("小","王"));
        Collections.shuffle(hashList);
        return hashList;
    }
}
