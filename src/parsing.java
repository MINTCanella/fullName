import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class parsing {
    public static String[] nameParsing() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите фамилию, имя и отчество в строгом порядке через пробел: ");
        String[] fullName = (input.nextLine()).split(" ", 3);
        if (fullName.length != 3) {
            System.out.println("Не хватает части ФИО.");
            throw new IllegalArgumentException();
        }
        return fullName;
    }
    
    public static Calendar dateParsing() {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        System.out.print("Введите дату рождения в формате гггг-мм-дд: ");
        String dateOfBirth = input.nextLine();
        Calendar dateCalendar = Calendar.getInstance();
        try {
            dateCalendar.setTime(formatter.parse(dateOfBirth));
        } catch (ParseException e) {
            System.out.println("Невозможно распознать дату. " + e.getMessage());
            throw new IllegalArgumentException();
        }
        return dateCalendar;
    }
}
