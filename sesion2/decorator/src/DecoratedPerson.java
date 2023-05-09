public class DecoratedPerson implements IPerson {

    private Person person;

    public DecoratedPerson(Person person) {
        this.person = person;
    }

    @Override
    public void saludar() {
        person.saludar();
        System.out.printf(" y tengo %d años",person.getEdad());
    }
}
