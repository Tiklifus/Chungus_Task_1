package SchoolApp;

public class Student extends Person implements SchoolAccess {
    private boolean haveAccess;

    public Student(String name, boolean haveAccess) {
        super(name);
        this.haveAccess = haveAccess;
    }

    @Override
    public void goToSchool() {
        System.out.println(name + " пошёл в школу.");
    }

    @Override
    public void leaveSchool() {
        if (haveAccess) {
            System.out.println(name + " покинул школу (доступ есть).");
        } else {
            System.out.println(name + " не может уйти — нет доступа!");
        }
    }
}
