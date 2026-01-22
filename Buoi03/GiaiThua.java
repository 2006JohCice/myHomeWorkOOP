package learnDH14C4.myHomworkOop.Buoi03;

import java.util.Scanner;

public class GiaiThua {
    static Scanner sc = new Scanner(System.in);
    static int gt1(int n){
        if (n == 0) return 1;
        else return n*gt1(n-1);
    }
    static void dequy(){
        System.out.println("Nhap Vao So muon tinh gt: ");
        int n = sc.nextInt();
        System.out.println("Dap An Gt De Quy: ");
        System.out.println(gt1(n));

    }
    static void deQuyFor(){
        System.out.println("Nhap Vao So muon tinh gt: ");
        int n = sc.nextInt();
        System.out.println("Dap An Gt Voiws For: ");
        int i = 1;
        for (int j = 1; j <=n ; j++) {
            i*=j;
        }
        System.out.println(i);
    }
    static void dequyDowhile(){
        System.out.println("Nhap Vao So muon tinh gt: ");
        int n = sc.nextInt();
        System.out.println("Dap An Gt Do wwhile: ");
        int i = 1 ; long gt =1;
        do {
            gt *= i;
            i++;
        }while (i<=n);
        System.out.println(gt);
    }
    static void dequywhile(){
        System.out.println("Nhap Vao So muon tinh gt: ");
        int n = sc.nextInt();
        System.out.println("Dap An Gt While: ");
        int i = 1; long gt = 1;
        while (i<=n){
            gt *=i;
            i++;
        }
        System.out.println(gt);
    }
}
