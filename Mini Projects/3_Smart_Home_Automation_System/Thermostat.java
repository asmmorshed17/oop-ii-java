import java.time.Duration;

class Thermostat implements Device {
   
   @Override
    public void turnOn() {
        System.out.println("Thermostat is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Thermostat is OFF");
    }

    @Override
    public void setTimer(Duration duration) {
        System.out.println("Temperature control active for " + duration.toMinutes() + " minutes");
    }
}