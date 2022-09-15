package kata_1;

import java.util.Date;

public class Kata_1 {

    public static void main(String[] args) {
        Person person = new Person ("Marcos", new Date(102, 8, 24));
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
    
}
