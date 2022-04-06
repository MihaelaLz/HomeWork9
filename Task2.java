// Enum  е специален Class, който представя група от константи.
//Този пример е създаване на Enum  вътре в класа.
public class Task2 {
    enum Mood {
        SAD,
        ROUGHLY,
        HAPPY
    }enum Size {
        SMALL,
        MEDIUM,
        LARGE,
        EXTRALARGE
    }enum Speed {
        SLOW, MEDIUM, FAST}

    Speed s = Speed.MEDIUM;

    public static void main(String[] args) {
        Mood myVar = Mood.HAPPY;
        System.out.println(myVar);
        System.out.println(Size.SMALL);
        System.out.println(Size.MEDIUM);
        System.out.println(Speed.FAST);

        // Можем да използваме и оператора if-else

        Speed s = Speed.MEDIUM;
        if (s == Speed.SLOW)
            System.out.println("Vehicle speed is slow");
        else if (s == Speed.MEDIUM)
            System.out.println("Vehicle speed is medium");
        else
            System.out.println("Vehicle speed is fast");

        // Можем да използваме и превключване
        Speed speed = Speed.MEDIUM;

        switch (speed) {
            case SLOW:
                System.out.println("Speed is Slow");
                break;
            case MEDIUM:
                System.out.println("Speed is Medium");
                break;
            case FAST:
                System.out.println("Speed is Fast");
                break;
        }
    }
}

