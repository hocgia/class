package assignment2;

import assignmen.SoNguyenTo;

public class Main {
    public static void main(String[] args) {
        SoNguyenTo soNguyenTo = new SoNguyenTo();
//        soNguyenTo.setA(10);
        soNguyenTo.setA(17);
        System.out.println("Số nguyên tố tiếp theo là: " + soNguyenTo.timSoNguyenToTiepTheo());
    }
}
