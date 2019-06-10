import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Controller {
    private Scanner scanner = new Scanner(System.in);
    public HashMap<String, String> contactHashMap = new HashMap<>();

    public void add() {
        System.out.println("Input Contact Name:");
        String name = scanner.nextLine();
        System.out.println("Input Phone number");
        String phone = scanner.nextLine();
        System.out.println(contactHashMap.put(name, phone) == null ? "Save success!": "Save error.");
    }

    public void find() {
        System.out.println("Input Contact Name:");
        String name = scanner.nextLine();
        if (contactHashMap.containsKey(name)) {
            String phone = contactHashMap.get(name);
            System.out.println("Result: ");
            System.out.println("Name: " + name);
            System.out.println("Phone: " + phone);
        } else {
            System.out.println("Not found.");
        }
    }

    public void display() {
        System.out.printf("%10s Address Book\n"," ");
        System.out.printf("%-15s | %-15s\n", "Contact Name", "Phone number");
        for (Map.Entry entry : contactHashMap.entrySet()) {
            String name = (String) entry.getKey();
            String phone = (String) entry.getValue();
            System.out.printf("%-15s | %-15s\n", name, phone);
        }
    }
}
