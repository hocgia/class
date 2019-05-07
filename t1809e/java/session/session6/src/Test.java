public class Test {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.insertPhone("nam1", "019283");
        phoneBook.insertPhone("hung", "019283");
        phoneBook.insertPhone("woo", "019283");
        phoneBook.insertPhone("dung", "019283");
        phoneBook.insertPhone("cuong", "019283");
        phoneBook.updatePhone("woo", "00000");
        phoneBook.updatePhone("wo", "00000");
        phoneBook.removePhone("nam1");
        phoneBook.removePhone("name2");
        for (int i = 0; i < phoneBook.getPhoneList().size(); i++) {
            System.out.println(phoneBook.getPhoneList().get(i).getName());
        }
        phoneBook.sort();
        System.out.println("===============");
        for (int i = 0; i < phoneBook.getPhoneList().size(); i++) {
            System.out.println(phoneBook.getPhoneList().get(i).getName());
        }
    }
}
