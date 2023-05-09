public class Main {

    public static void main (String []args){




        System.out.println(Person.getInstance().getName());
        System.out.println(Person.getInstance().getAge());
        System.out.println(Person.getInstance());

        Person.getInstance().setAge(33);

        System.out.println(Person.getInstance().getName());
        System.out.println(Person.getInstance().getAge());
        System.out.println(Person.getInstance());




    }
}
