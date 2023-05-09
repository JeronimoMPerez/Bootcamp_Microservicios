public class Main {
    public static void main(String[] args) {

//        Person person1 = new Person();
//
//        System.out.println(person1);
//        System.out.println(person1.getName());
//        System.out.println(person1.getAge());
//
//        Person person2 = Person.buildPerson("Paco", 22);
//
//        System.out.println(person2);
//        System.out.println(person2.getName());
//        System.out.println(person2.getAge());

        Person person1 = Person.Builder()
                .name("Paco")
                .age(22)
                .build();

        System.out.printf("Name: %s, age: %d", person1.getName(),person1.getAge());


    }
}