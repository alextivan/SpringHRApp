package bihavioral.command;

public class DeviceButton {

    private Command command;

    public DeviceButton (Command command){
        this.command = command;
    }

    public void press(){
        command.execute();
    }

}
