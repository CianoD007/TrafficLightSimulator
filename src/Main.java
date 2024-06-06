public class Main {
    public static void main(String[] args) {
        TrafficLightSimulator simulator = new TrafficLightSimulator();
        int cycles = 10;

        for (int i = 0; i < cycles; i++) {
            System.out.println(simulator);
            simulator.changeColor();

            try {
                Thread.sleep(500); // 0.5 second delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
