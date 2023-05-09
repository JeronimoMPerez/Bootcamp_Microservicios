public class Person {

    private String name;
    private int age;

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private static Person instance = new Person("Jero", 23);

    public static Person getInstance() {
        if (instance == null) {
            instance = new Person("Jero",29);
        }
        return instance;
    }

}
