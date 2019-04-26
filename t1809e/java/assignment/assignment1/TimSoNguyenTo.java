package assignment1;

import java.util.Scanner;

public class TimSoNguyenTo {
    public static void main(String[] args) {
        TimSoNguyenTo timSoNguyenTo = new TimSoNguyenTo();
        while (true){
            timSoNguyenTo.timSoNguyenTo();
        }
    }

    public void timSoNguyenTo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bất kỳ:");
        int n = scanner.nextInt();
        if(n<=2){
            System.out.println("Không có số nguyên tố nào.");
        } else {
            System.out.println("Các số nguyên tố là:");
            for (int i = 2; i < n; i++) {
                if(kiemTraSoNguyenTo(i)){
                    System.out.println(i);
                }
            }
        }
        
    }

    public boolean kiemTraSoNguyenTo(int n){
        int id = n/2;
        int dem = 0;
        for (int i = 0; i < id; i++) {
            if (n%2==0)
                dem++;
            if(dem > 1)return false;
        }
        return true;
    }

}
