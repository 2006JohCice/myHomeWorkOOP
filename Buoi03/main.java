package learnDH14C4.myHomworkOop.Buoi03;

import java.util.Scanner;

public class main {
    static void menu(int n){
            switch (n){
                case 16:
                   logic.bai16(); break;
                case 17:
                    logic.bai17();break;
                case 18:
                    logic.bai18();break;
                case 19:
                    logic.bai19();break;
                case 20:
                    logic.bai20();break;
                case 21:
                    logic.bai21();break;
                case 22:
                    logic.bai22To26();break;
                case 23:
                    logic.bai22To26();break;
                case 24:
                    logic.bai22To26();break;
                case 25:
                    logic.bai22To26();break;
                case 26:
                    logic.bai22To26();break;
                case 27: logic.bai27();break;
                case 28: break;
                case 29: logic.bai29(); break;
                case 30:logic.bai30(); break;
            }
    }
    static void main() {

        Scanner sc = new Scanner(System.in);
        int n ;
        do {
            System.out.println("Tron Bai Tap Can Kiem Tra Tu bai 16 -> 30: ");
             n = sc.nextInt();
             menu(n);
             if (n<16 || n>30){
                 System.out.println("Nhap Lai");
             }
        }while(true);
    }
}
