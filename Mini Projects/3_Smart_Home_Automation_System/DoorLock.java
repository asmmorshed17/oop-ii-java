import java.time.Duration;

class DoorLock implements Device {
   
    @Override
    public void turnOn() {
        System.out.println("Door is LOCKED");
    }

    @Override
    public void turnOff() {
        System.out.println("Door is UNLOCKED");
    }

    @Override
    public void setTimer(Duration duration) {
        System.out.println("Door will auto-lock after " + duration.toMinutes() + " minutes");
    }
}