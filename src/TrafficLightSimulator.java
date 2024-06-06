public class TrafficLightSimulator {
    private TrafficLight currentLight;

    public TrafficLightSimulator() {
        this.currentLight = TrafficLight.RED;
    }

    public void changeColor() {
        switch (currentLight) {
            case RED:
                currentLight = TrafficLight.GREEN;
                break;
            case GREEN:
                currentLight = TrafficLight.YELLOW;
                break;
            case YELLOW:
                currentLight = TrafficLight.RED;
                break;
        }
    }

    @Override
    public String toString() {
        return "The current light is " + currentLight;
    }
}