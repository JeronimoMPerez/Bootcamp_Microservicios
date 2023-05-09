import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonaFacade {

    List<Person> people = Arrays.asList(
            new Person("John", 25),
            new Person("Mary", 30),
            new Person("Peter", 19),
            new Person("Jane", 22),
            new Person("Mike", 28));

    List<Person> getPerson20to30(){

        return people.stream()
                .filter(
                        person -> person.getAge()>=20 && person.getAge()<=30
                )
                .collect(Collectors.toList());
    }
}
