package ru.kfu;

import java.util.Scanner;

public class Main {


<<<<<<< HEAD
    public static void createChessDesk (FieldChessDesk desk[][]){
        for (char i = '1'; i <= 8; i++){;
            for (char j = 'a'; j <= 'h' ; j++){
=======
    public static boolean[][] createChessDesk (){
        boolean[][] desk = new boolean[8][8];
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8 ; j++){
>>>>>>> 13aa41480caf082a6db46948cc9eea07e58d9a10
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
        return desk;
    }

    public static void printChessDesk (boolean desk[][]){
        for (int i = 7; i >= 0; i--){
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
<<<<<<< HEAD
        FieldChessDesk[][] desk = new FieldChessDesk[8][8];
        createChessDesk(desk);
        //printChessDesk(desk);
=======
>>>>>>> 13aa41480caf082a6db46948cc9eea07e58d9a10

        boolean desk[][] = createChessDesk();
        char[] field = new char[2];
        Scanner scanner = new Scanner(System.in);
        field = scanner.next().toCharArray();
        int x = field[0] - 97;
        int y = field[1] - 49;
        if (desk[y][x] == true) {
            System.out.println("BLACK");
        }else{
            System.out.println("WHITE");

        }
    }
}
