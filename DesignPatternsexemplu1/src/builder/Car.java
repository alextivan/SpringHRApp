package builder;

public class Car {

    private String color;
    private String motor;

    private boolean airbag;
    private String acUnit;
    private String player;
    private boolean servo;
    private int sensors;

    private Car(CarBuilder carBuilder) {
        this.color = carBuilder.color;
        this.motor = carBuilder.motor;
        this.airbag = carBuilder.airbag;
        this.acUnit = carBuilder.acUnit;
        this.player = carBuilder.player;
        this.servo = carBuilder.servo;
        this.sensors = carBuilder.sensors;
    }

    public static class CarBuilder{
        private String color;
        private String motor;
        private boolean airbag;
        private String acUnit;
        private String player;
        private boolean servo;
        private int sensors;

        public CarBuilder(String color, String motor) {
            this.color = color;
            this.motor = motor;
        }

        public CarBuilder hasAirbag(boolean airbag){
            this.airbag = airbag;
            return this;
        }

        public CarBuilder withACUnit (String acUnit){
            this.acUnit = acUnit;
            return this;
        }

        public CarBuilder withPlayer (String player){
            this.player = player;
            return this;
        }

        public CarBuilder hasServo (boolean servo){
            this.servo = servo;
            return this;
        }

        public CarBuilder withSensors (int sensors){
            this.sensors = sensors;
            return this;
        }

        public Car build(){
            return new Car(this);

        }


    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", motor='" + motor + '\'' +
                ", airbag=" + airbag +
                ", acUnit='" + acUnit + '\'' +
                ", player='" + player + '\'' +
                ", servo=" + servo +
                ", sensors=" + sensors +
                '}';
    }
}
