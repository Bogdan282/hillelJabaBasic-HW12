public class Car {
    public static void Start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    //Трішки доповнив внутрішні методи, щоб перевіряти роботу.

    private static void startElectricity(){
        System.out.println("Вмикається електроніка.");
    }
    private static void startCommand(){
        System.out.println("Очикується команда.");
    }
    private static void startFuelSystem(){
        System.out.println("Вмикається система контролю палива.");
    }
}
