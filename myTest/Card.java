package org.example;

import java.util.Arrays;

public class Card {
    public static void solution(String[] cards1, String[] cards2, String[] goal) {
        int i = 0;
        int j = 0;

        while (i + j < goal.length) {

            if ( i < cards1.length && goal[i + j].equals(cards1[i]) ) {
                i++;
            }
            else if (j < cards2.length && goal[i + j].equals(cards2[j]) ){
                j++;
            }
            else{
                i = 100;
            }
        }

            if (i + j == goal.length) {
                System.out.println("Yes");
            } else{
                System.out.println("No");
        }
    }

        public static void main (String[]args){
            String[] cards1 = {"i", "drink", "water"};
            String[] cards2 = {"want", "to"};
            String[] goal = {"i", "want", "to", "drink", "water"};

            solution(cards1, cards2, goal);

        }
    }
