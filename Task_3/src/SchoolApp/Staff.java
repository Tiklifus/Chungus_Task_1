package SchoolApp;

public class Staff extends Person implements SchoolAccess {
    public Staff(String name) {
        super(name);
    }

    @Override
    public void goToSchool() {
        System.out.println(name + " (персонал) пришёл в школу.");
    }

    @Override
    public void leaveSchool() {
        System.out.println(name + " (персонал) покинул школу.");
    }
}
