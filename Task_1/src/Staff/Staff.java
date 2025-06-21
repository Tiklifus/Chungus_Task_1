package Staff;

public enum Staff {

    SECRETARY, GUARD, CLEANER, COOK;

    public void catchPhrase() {
        switch (this) {
            case SECRETARY:
                    System.out.println("Я работаю на отъебись как и все здесь");
                    break;
                case GUARD:
                    System.out.println("Тыыы неее пройдёёёёёёшь");
                    break;
                case CLEANER:
                    System.out.println("Сколько можно, я ведь только помыла");
                    break;
                case COOK:
                    System.out.println("Братишки я вам покушать принёс");
                    break;
        }
    }
}
