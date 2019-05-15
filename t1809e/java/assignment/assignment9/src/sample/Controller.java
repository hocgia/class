package sample;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Controller {
    public TextField day;
    public TextField month;
    public TextField year;
    public Text message;
    public TextArea result;

    public void submit() {
        message.setText("");
        try {
            int dayInt = Integer.parseInt(day.getText());
            int monthInt = Integer.parseInt(month.getText());
            int yearInt = Integer.parseInt(year.getText());
            String check = check(dayInt, monthInt);
            message.setText(check);
            if (check == null) {
                Calendar calendar = new GregorianCalendar(yearInt, (monthInt - 1), dayInt);
                String s = "";
                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
                s += (dayOfWeek == 1) ? "Ngày trong tuần: CN\n" : "Ngày trong tuần: T" + dayOfWeek + "\n";
                s += "Ngày trong tháng:" + dayInt + "\n";
                s += "Ngày trong năm: " + calendar.get(Calendar.DAY_OF_YEAR);
                result.setText(s);
            } else {
                message.setText(check);
            }
        } catch (Exception e) {
            message.setText("Lỗi: Sai định dạng nhập!");
        }
    }

    private String check(int day, int month) {
        if (day < 1 || day > 31) return "Lỗi: Ngày phải là số từ 1 - 31!";
        if (month < 1 || month > 12) return "Lỗi: Tháng phải là số từ 1 - 12!";
        return null;
    }
}
