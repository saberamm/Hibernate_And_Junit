import entity.Person;
import entity.Student;
import entity.Teacher;
import entity.enums.TeacherRate;
import util.ApplicationContext;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Person person = new Person("kasds", "ksddf", "kijre", "w", LocalDate.of(2010, 5, 5));

        ApplicationContext.getPersonService().save(person);

        Student student = new Student("kasds", "ksddf", "kijre", "w",
                LocalDate.of(2010, 5, 5), 4, "tt",
                LocalDate.of(2010, 5, 5) );

        ApplicationContext.getStudentService().save(student);

        Teacher teacher = new Teacher("kasds", "ksddf", "kijre", "w",
                LocalDate.of(2010, 5, 5),6,"er",
                555L, TeacherRate.JUNIOR);

        ApplicationContext.getTeacherService().save(teacher);


    }
}