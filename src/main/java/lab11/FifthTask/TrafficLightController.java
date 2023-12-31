package lab11.FifthTask;

public class TrafficLightController {
    public static void main(String[] args) {

        TrafficLightContext context = new TrafficLightContext();


        context.transitionToGreen();
        context.transitionToYellow();
        context.transitionToRed();
        context.transitionToGreen();
    }
}
