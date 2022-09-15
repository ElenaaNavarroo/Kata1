package kata_1;

import java.time.LocalDate;
public class Kata_1 {
    
    public static void main(String[] args){
        Person person;
        person = new Person("Marcos", LocalDate.of(2002, 1, 1));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años ");
    }
    
}
