package assignment1;

import java.util.Scanner;

public class TinhTongFibonacci {
    public static void main(String[] args) {
        TinhTongFibonacci tinhTongFibonacci = new TinhTongFibonacci();
        while (true){
            tinhTongFibonacci.fibonacci();
        }
    }

    public void fibonacci (){
        Scanner scanner = new Scanner(System.in);
        int sum = 1;
        int fn = 0;
        int fn1 = 1;
        int fn2;
        System.out.println("Nhập số n:");
        int n = scanner.nextInt();
        System.out.println("Tổng " + n + " số đầu tiên trong dãy fibonacci là:");
        if(n==1){
            System.out.println(0);
            System.out.println("----------------");
            return;
        }
        if (n==2){
            System.out.println(1);
            System.out.println("----------------");
            return;
        }
        for (int i = 3; i <= n; i++) {
            fn2 = fn + fn1;
            sum += fn2;
            fn = fn1;
            fn1 = fn2;
        }
        System.out.println(sum);
        System.out.println("----------------");
    }
}
