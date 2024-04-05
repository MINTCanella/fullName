import java.util.Calendar;

class fullName {

    public static void main(String[] args) {

        String[] fullName = new String[0];
        while (fullName.length == 0) {
            try {
                fullName = parsing.nameParsing();
            } catch (IllegalArgumentException ignored){}
        }
        String lastName = fullName[0];
        String firstName = fullName[1];
        String surname = fullName[2];

        Calendar dateCalendar = null;
        while (dateCalendar == null) {
            try {
                dateCalendar = parsing.dateParsing();
            } catch (IllegalArgumentException ignored){}
        }

        String initials = firstName.charAt(0) + "." + surname.charAt(0) + ".";

        String gender;
        if (surname.endsWith("ч")) gender = "м";
        else if (surname.endsWith("а")) gender = "ж";
        else gender = "н/о";

        Calendar current = Calendar.getInstance();
        int age = current.get(Calendar.YEAR) - dateCalendar.get(Calendar.YEAR);
        if (current.get(Calendar.DAY_OF_YEAR) < dateCalendar.get(Calendar.DAY_OF_YEAR)) age--;
        System.out.println("Фамилия И.О.: " + lastName + " " + initials);
        System.out.println("Пол: " + gender);
        System.out.println("Возраст: " + age + " лет");

    }
}