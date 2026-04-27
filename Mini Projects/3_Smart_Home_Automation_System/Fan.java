import java.time.Duration;

class Fan implements Device {
    
    @Override
    public void turnOn() {
        System.out.println("Fan is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is OFF");
    }

    @Override
    public void setTimer(Duration duration) {
        System.out.println("Fan will run for " + duration.toMinutes() + " minutes");
    }
}