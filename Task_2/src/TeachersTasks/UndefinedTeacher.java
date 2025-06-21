package TeachersTasks;

public class UndefinedTeacher extends Teacher {
    public UndefinedTeacher(String name) {
        super(name, TeacherType.UNDEFINED);
    }

    @Override
    public void describe() {
        System.out.println("Я " + name + ", еще не выбрал предмет.");
        // Показываем список всех учителей
        listAllTeachers();
    }
}
