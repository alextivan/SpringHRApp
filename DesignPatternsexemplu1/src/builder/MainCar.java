package builder;

public class MainCar {

    public static void main (String[] args){
        Car sportCar = new Car.CarBuilder("Red", "Benzina")
                .hasServo(true)
                .withPlayer("cdPlayer")
                .build();

        System.out.println(sportCar);
    }
}
