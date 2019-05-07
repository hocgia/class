import java.util.ArrayList;
import java.util.Collections;

public class PhoneBook extends Phone {

    private ArrayList<PhoneNumber> PhoneList = new ArrayList<>();

    public ArrayList<PhoneNumber> getPhoneList() {
        return PhoneList;
    }

    public void setPhoneList(ArrayList<PhoneNumber> phoneList) {
        PhoneList = phoneList;
    }

    @Override
    void insertPhone(String name, String phone) {
        int result = getPhoneBookByName(name);
        if (result < 0 | result > this.PhoneList.size()) {
            this.PhoneList.add(new PhoneNumber(name, phone));
            System.out.println("Insert success");
        } else {
            PhoneNumber phoneNumber = PhoneList.get(result);
            if (phoneNumber.getPhone().equals(phone)) {
                System.out.println("Insert success");
                this.PhoneList.set(result, (new PhoneNumber(name, (phoneNumber.getPhone() + " : " + phone))));
            }
        }
    }

    @Override
    void removePhone(String name) {
        int result = getPhoneBookByName(name);
        if (result < 0 | result > this.PhoneList.size()) {
            System.err.println("Remove error!");
        } else {
            System.out.println("Remove Success");
            this.PhoneList.remove(result);
        }
    }

    @Override
    void updatePhone(String name, String newphone) {
        int result = getPhoneBookByName(name);
        if (result < 0 | result > this.PhoneList.size()) {
            System.err.println("Update error!");
        } else {
            System.out.println("Update success");
            this.PhoneList.set(result, new PhoneNumber(name, newphone));
        }
    }

    @Override
    void searchPhone(String name) {
        for (PhoneNumber phoneNumber : PhoneList) {
            if (phoneNumber.getName().equals(name)) System.out.println("Result: " + phoneNumber.getPhone());
        }
        System.out.println("Not found" + name);
    }

    @Override
    void sort() {
        Collections.sort(this.PhoneList, new NameComparator());
    }

    private int getPhoneBookByName(String name) {
        for (int i = 0; i < PhoneList.size(); i++) {
            PhoneNumber phoneNumber = PhoneList.get(i);
            if (phoneNumber.getName().equals(name)) return i;
        }
        return -1;
    }
}
