import java.time.Duration;

public class Main3 {
    public static void main(String[] args) {

        SmartHub hub = new SmartHub();


        Device light = new Light();
        Device fan = new Fan();
        Device thermo = new Thermostat();
        Device door = new DoorLock();

        hub.addDevice(light);
        hub.addDevice(fan);
        hub.addDevice(thermo);
        hub.addDevice(door);

        hub.turnOnAll();

        hub.setTimerForAll(Duration.ofMinutes(10));

        hub.turnOffAll();
    }
}