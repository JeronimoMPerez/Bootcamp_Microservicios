public class Proxy implements ISubject{

    RealSubject realSubject = new RealSubject();

    @Override
    public void getWelcome() {
        System.out.println("BEFORE: OBTAINING WELCOME MESSAGE");
        realSubject.getWelcome();
    }
}
