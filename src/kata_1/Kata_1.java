package kata_1;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata_1 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(2002, 8, 25);
        
        
        Person person = new Person ("Marcos", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años ");
        
    }
    
}
