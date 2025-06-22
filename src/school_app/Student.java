package school_app;

public class Student extends Person implements AccessableToSchool {
    private boolean access;

    public Student(String name, boolean haveAccess) {
        super(name);
        this.access = haveAccess;
    }

    public boolean haveAccess() {
        return access;
    }

    public void setAccess(boolean access) {
        this.access = access;
    }

    @Override
    public void goToSchool() {
        System.out.println(name + " пошёл в школу.");
    }

    @Override
    public void leaveSchool() {
        if (access) {
            System.out.println(name + " покинул школу (доступ есть).");
        } else {
            System.out.println(name + " не может уйти — нет доступа!");
        }
    }
}
