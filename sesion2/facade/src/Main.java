import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PersonaFacade facade = new PersonaFacade();

        List<Person> result= facade.getPerson20to30();

        System.out.println(result);

    }
}