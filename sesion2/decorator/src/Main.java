public class Main {
    public static void main(String[] args) {

        Person p = new Person("Paco", 45);

        p.saludar();

        DecoratedPerson p2 = new DecoratedPerson(p);

        p2.saludar();



    }
}