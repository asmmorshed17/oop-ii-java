import java.time.Duration;

class Light implements Device {
   
   @Override
    public void turnOn() {
        System.out.println("Light is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is OFF");
    }

    @Override
    public void setTimer(Duration duration) {
        System.out.println("Light will turn off after " + duration.toMinutes() + " minutes");
    }
}