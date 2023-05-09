public class Person {

    private String name = "Nombre Generico";
    private int age = 20;

    private Person(Builder builder) {
        this.name=builder.name;
        this.age=builder.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static Builder Builder(){
        return new Builder();
    }

    public static class Builder {

       private String name;
       private int age;

       public Builder name(String name){
           this.name = name ;
           return this;
       }

       public Builder age(int age){
           this.age=age;
           return this;
       }

       public Person build(){
           return new Person(this);
       }
    }
}
