package staff;

public enum StaffType {

    SECRETARY ("Я работаю на отъебись как и все здесь"), GUARD ("Тыыы неее пройдёёёёёёшь"),
    CLEANER ("Сколько можно, я ведь только помыла"), COOK ("Братишки я вам покушать принёс");

    final String phrase;

    StaffType(String phrase) {
        this.phrase = phrase;
    }

    public void catchPhrase() {
        System.out.println(phrase);
//        switch (this) {
//            case SECRETARY:
//                    System.out.println("Я работаю на отъебись как и все здесь");
//                    break;
//                case GUARD:
//                    System.out.println("Тыыы неее пройдёёёёёёшь");
//                    break;
//                case CLEANER:
//                    System.out.println("Сколько можно, я ведь только помыла");
//                    break;
//                case COOK:
//                    System.out.println("Братишки я вам покушать принёс");
//                    break;
//        }
    }
}
