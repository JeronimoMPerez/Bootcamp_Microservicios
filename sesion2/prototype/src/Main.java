public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Person person = new Person("Jero", 22);

        System.out.println(person);
        System.out.println(person.getName());
        System.out.println(person.getAge());

        Person person2 = (Person) person.clone();

        System.out.println(person2);
        System.out.println(person2.getName());
        System.out.println(person2.getAge());




    }
}