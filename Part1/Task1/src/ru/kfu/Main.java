package ru.kfu;

import java.util.Scanner;

public class Main {


    public static void createChessDesk (FieldChessDesk desk[][]){
        for (char i = '1'; i <= 8; i++){;
            for (char j = 'a'; j <= 'h' ; j++){
                if (i % 2 == 0){
                    if (j % 2 == 0){
                        desk[i][j].isBlack = true;
                    }
                } else {
                    if (j % 2 == 1){
                        desk[i][j].isBlack = true;
                    }
                }
            }
        }
    }

    public static void printChessDesk (boolean desk[][]){
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8 ; j++){

                if (desk[i][j] == true) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FieldChessDesk[][] desk = new FieldChessDesk[8][8];
        createChessDesk(desk);
        //printChessDesk(desk);

        char[] field = new char[2];
        Scanner scanner = new Scanner(System.in);
        field = scanner.next().toCharArray();
        //y = scanner.next().charAt(1);
        System.out.println(field[0] + " " + field[1]);

    }
}
