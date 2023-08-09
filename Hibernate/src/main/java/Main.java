import entity.Person;
import util.ApplicationContext;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Person p = new Person("k", "k", "ki", "w", LocalDate.of(2010, 5, 5));

        ApplicationContext.getPersonService().save(p);

    }
}