package learnDH14C4.myHomworkOop.Buoi03;

import java.util.Scanner;

public class SoNguyento {
    static Scanner sc = new Scanner(System.in);
    static int []array = new int[1000009];
    // 1 false 0 true
    static int ktraSont2(int n){
        array[0]  = 1;
        array[1]  = 1;
        for (int i = 2;  i<= Math.sqrt(1000000) ; i++) {
            for (int j = i*i; j*j <1000000 ; j+=i) {
                array[j] = 1;
            }
        }
        if (array[n] == 0){
            return 1;
        }else return 0;

    }
    static boolean ktraSont1(int n){
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i*i <= n ; i+=2) {
                if (n%i == 0) return false;
        }
        return true;

    }

    static void sang(int n ,int a){
        int sum = 0;
        if (n == 1){
            for (int i = a; i <=2*a ; i++) {
                if (ktraSont2(i) == 1) sum +=i ;
            }
            System.out.println("Dap an tong so nguyen to trong khoang: ");
            System.out.println(sum);
            System.out.println("Danh gia thuat toan ");
            System.out.println("Su dung mang danh dau de chuy cap vao chi so cua mang de kiem tra mot day so co phai so nt khong do " +
                    "Phuc tap mat olog(n) nhung uwu diem mang co dinh phu hop voi lu tru khoang 1e9");
        }else {
            for (int i = a; i <=2*a ; i++) {
                if (ktraSont1(i)) sum+=i;
            }
            System.out.println("Dap an tong so nguyen to trong khoang: ");
            System.out.println(sum);
            System.out.println("Danh gia thuat toan ");
            System.out.println("Su dung su dung for de kiem tra trong doan tung phan tu khon phu hop vi khi gap mot so trong doan [a , 2a] no lai phai " +
                    "kiem tra va chay vong for tu 3 -> can(a)");
        }

    }

    static void main() {
        int n = sc.nextInt();
        if (ktraSont2(n) == 1 ) System.out.println("Yes");
        else System.out.println("No");

    }
}
