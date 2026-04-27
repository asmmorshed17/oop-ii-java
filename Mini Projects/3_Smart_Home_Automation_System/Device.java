import java.time.Duration;

interface Device {
    void turnOn();
    void turnOff();
    void setTimer(Duration duration);
}