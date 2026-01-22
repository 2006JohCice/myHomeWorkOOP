package learnDH14C4.myHomworkOop.Buoi03;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class logic {
    static Scanner sc = new Scanner(System.in);
    static void menuGt(){
        System.out.println("1.De Quy");
        System.out.println("2.For");
        System.out.println("3.Do while");
        System.out.println("4.While");
        System.out.println("Nhap Vao Phan Muon Tinh");
        int n = sc.nextInt();
        switch (n){
            case 1:
                GiaiThua.dequy(); break;
            case 2:
                GiaiThua.deQuyFor();break;
            case 3:
                GiaiThua.dequyDowhile();break;
            case 4:
                GiaiThua.dequywhile();break;
            default:
                System.out.println("Undifine");
        }

    }

    static void bai16(){
        System.out.println("Bai 16: Ctr tra lai tien cho khach");
        System.out.println("Nhap Vao So Tien");
        double st = sc.nextDouble();
        System.out.println("So Tien Can Tra");
        if (st<=0) System.out.println("So Tien Khong Hop Le");
        else if (st>=200&& st<300) System.out.println(st*0.2);
        else if (st>= 300)System.out.println(st*0.3);
        else System.out.println(st);
    }
    static void bai17(){
        System.out.println("Bai 17: Ctr Diem Tong Ket ");
        System.out.println("Nhap diem tong ket");
        int dt = sc.nextInt();
        System.out.println("Hoc sinh xep loai: ");
        if (dt >= 8) System.out.println("Gioi");
        else if(dt>= 7 && dt <8) System.out.println("Kha");
        else if (dt > 5 && dt<7) System.out.println("Tb");
        else System.out.println("Yeu");
    }
    static void bai18(){
        System.out.println("Bai 18: Nhap vao 1 thang in so ngay");
        int m= sc.nextInt();
//        switch (month)
        System.out.println("Thang Co : ");
        if ( m == 1 || m ==  3 || m == 5 || m ==  7 || m ==  8 || m ==  10 || m ==  12){
            System.out.print(m);
            System.out.println("31 ngay");
        }
        else if ( m ==  4 || m == 6 || m ==  9 || m ==11){
            System.out.print(m);
            System.out.println("30 ngay");
        }
        else {
            System.out.print(m);
            System.out.println("28 or 29 ngay");
        }
    }
    static void bai19(){
        System.out.println("Bai 19 : Tinh Gia Thua Theo Nhieu Cach");
        menuGt();

    }
    static void bai20(){
        System.out.println("Bai 20 : Tinh Tong So Nguyen To [a,2a] Va Danh Gia Kq ");
        System.out.println("1. Su sang so nt");
        System.out.println("2. Su dung ktr so nt");
        System.out.println("Lua chon 1 or 2");
        int n = sc.nextInt();
        System.out.println("Nhap a");
        int a = sc.nextInt();
        switch (n){
            case 1: SoNguyento.sang(n,a);break;
            case 2: SoNguyento.sang(n,a);break;
            default:
                System.out.println("Undifile");
        }
    }
    static void bai21(){
        System.out.println("Bai 21 : Sum 1+1/2+1/3+...+1/n");
        System.out.println("Nhap n");
        int n = sc.nextInt();
        float sum =0;
        for (int i = 1; i <=n ; i++) {
            sum+=(float) 1/i;
        }
        System.out.print("Ket Qua: ");
        System.out.println(sum);
    }
    static void bai22To26(){
        System.out.println("Khong co bai tap lam");
    }
    static void bai27(){
        System.out.println("Nhap vao n de tinh tong so nguyen to [1 -> n]");
        int n = sc.nextInt() , sum = 0 , count =0;
        for (int i = 0; i <=n ; i++) {
            if (SoNguyento.ktraSont2(i) == 1){
                count +=1;
                sum+=i;
            }
        }
        System.out.println("Tong so nguyen to ");
        System.out.println(sum);
        System.out.printf("Co %d so nt tu 1 -> %d",count,n);
        System.out.println();

    }
    static void bai28() {
        System.out.println("Bai 28 : Luy Thua be nhat > 1000 la:");
        System.out.println("1. Dung while");
        System.out.println("2. Dung do while");
        System.out.println("Nhap Vao Lua Tron Cua Ban");
        int a = sc.nextInt();
        int x = 1;
        int n = 0;
        switch (a){
            case 1:
                while (x <= 1000) {
                    x *= 2;
                    n++;
                }

                System.out.println("Cach 1 - while:");
                System.out.println("2^" + n + " = " + x);
                break;
            case 2:
                do {
                    x *= 2;
                    n++;
                } while (x <= 1000);

                System.out.println("Cach 2 - do while:");
                System.out.println("2^" + n + " = " + x);
                break;
        }
        }
    static void bai29(){
        System.out.println("Bai 29: Viet ctr dao nguoc mang ");
        System.out.println("Nhap vao so luong mang");
        int n = sc.nextInt();
        int []a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Phan tu a[%d] : ",i);
            a[i] = sc.nextInt();
        }
        int i = 0 , j = n -1;
        while (i<=j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;

        }


        for (int x : a) {
            System.out.print(x + " ");
        }

        System.out.println("Danh gia thuat toan: giam vong lap di khi dung two point");
    }
    static void bai30(){
        // 1+2+3+4 .... = n(n+1)/2 > 1000 => x^2+x-1000 > 0
        System.out.println("Bai 30: Tim so n min dk 1+2+3+4 ....+n > 1000 (x^2+x-1000 > 0)");
        System.out.println("Nhap so n de ktr");
        int n = sc.nextInt();
        if (n == 45){
            System.out.println("So can tim la 45 vi n(n+1)/2 = 1035");
        }else{
            System.out.printf("So %d khong phai la so can tim",n);
            System.out.println();
        }
    }

}
