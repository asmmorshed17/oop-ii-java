import java.util.*;
import java.time.Duration;

class SmartHub {
    private List<Device> devices = new ArrayList<>();


    public void addDevice(Device d) {
        devices.add(d);
    }


    public void turnOnAll() {
        for (Device d : devices) {
            d.turnOn();
        }
    }


    public void turnOffAll() {
        for (Device d : devices) {
            d.turnOff();
        }
    }


    public void setTimerForAll(Duration duration) {
        for (Device d : devices) {
            d.setTimer(duration);
        }
    }
}