public class Person implements IPerson {

    private String name;
    private int edad;

    public Person(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public int getEdad() {
        return edad;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void saludar() {
        System.out.printf("Hola me llamo %s\n",name);
    }
}
