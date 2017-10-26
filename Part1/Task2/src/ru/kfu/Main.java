package ru.kfu;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	int x1, x2, y1, y2;
	    Scanner scanner = new Scanner(System.in);
        char coordinateOne[] = new char[2];
	    char coordinateTwo[] = new char[2];
	    System.out.print("Введите первую координату: ");
	    coordinateOne = scanner.next().toCharArray();
	    x1 = coordinateOne[0] - 97;
	    y1 = coordinateOne[1] - 49;
		System.out.print("Введите первую координату: ");
		coordinateTwo = scanner.next().toCharArray();
		x2 = coordinateTwo[0] - 97;
		y2 = coordinateTwo[1] - 49;
		System.out.println(x1 +""+ y1 + x2 + y2);
    }
}