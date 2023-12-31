package lab11.FifthTask;

public interface TrafficLightState {
    void transitionToRed(TrafficLightContext context);
    void transitionToYellow(TrafficLightContext context);
    void transitionToGreen(TrafficLightContext context);
}
