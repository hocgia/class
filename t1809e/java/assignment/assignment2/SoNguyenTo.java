package assignment2;

public class SoNguyenTo {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if(isSoNguyenTo(a)){
            this.a = a;
        }else {
            System.out.println("Không set.");
        }
    }

    public boolean isSoNguyenTo(int x){
        int id = x/2;
//        int count = 0;
        for (int i = 2; i < id; i++) {
            if (x%2==0)return ;
//                count++;
//            if(count > 1)return false;
        }
        return true;
    }

    public int timSoNguyenToTiepTheo(){
        for (int i = (this.a + 1) ; ; i++) {
            if(isSoNguyenTo(i)){
                return i;
            }
        }
    }
}
