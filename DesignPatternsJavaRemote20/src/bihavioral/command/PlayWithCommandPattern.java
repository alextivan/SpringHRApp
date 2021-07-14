package bihavioral.command;

public class PlayWithCommandPattern {

    public static void main(String[] args) {
        ElectronicDevice television = new Television();

        TurnOnCommand onCommand = new TurnOnCommand(television);
        TurnOffCommand offCommand = new TurnOffCommand(television);

        DeviceButton on = new DeviceButton(onCommand);
        DeviceButton off = new DeviceButton(offCommand);

        on.press();
        off.press();

    }
}
