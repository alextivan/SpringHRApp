package bihavioral.command;

public class Television implements ElectronicDevice {
    @Override
    public void turnOn() {
        System.out.println("TV is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turning off");
    }
}
