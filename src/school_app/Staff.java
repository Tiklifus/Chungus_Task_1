package school_app;

import staff.StaffType;

public class Staff extends Person implements AccessableToSchool {
    StaffType profession;

    public Staff(String name, StaffType profession) {
        super(name);
        this.profession = profession;
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
