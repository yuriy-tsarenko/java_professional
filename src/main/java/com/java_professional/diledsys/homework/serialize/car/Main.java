package diledsys.homework.serialize.car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Volvo", 180, "red", "logo");
        //сеарелизуем
        Serialize.serializable(car);
        // десерализуем
        Car carLoad = (Car) Serialize.deserializable();
        System.out.println(carLoad.toString());
    }
}
