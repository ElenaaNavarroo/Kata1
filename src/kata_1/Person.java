package kata_1;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthdate;
    
   public Person(String name, LocalDate birthdate){
       this.name = name;
       this.birthdate = birthdate;

   }

    public int getAge() {
        LocalDate now = LocalDate.now();
        return Period.between(birthdate, now).getYears();
        
    }
   
   
   
   public String getName(){
       return name;
   }
}