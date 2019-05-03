import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student extends Person {
    public boolean isCheckAge() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date dob = format.parse(getDateOfBirth());
        Date dateNow = new Date();
        if (dateNow.getYear() - dob.getYear() == 18){
            if (dateNow.getMonth() == dob.getMonth()){
                return dateNow.getDay() >= dob.getDay();
            } else return dateNow.getMonth()>dob.getMonth();
        } else return dateNow.getYear() - dob.getYear() > 18;
    }
}
