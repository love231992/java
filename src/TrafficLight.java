// Write a program that simulates a traffic light. The user can input a color (red, yellow, or green),
// and the program should output the action based on the traffic light color (stop, prepare to stop, go).
import java.util.Scanner;
public class TrafficLight {
    public static void lights(String color){
        switch (color.toLowerCase()){
            case "red" -> System.out.println("Stop");
            case "yellow" -> System.out.println("Prepare to stop");
            case "green" -> System.out.println("Go");
            default -> {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Please choose from given color only : ");
                String color1 = scanner.next();
                lights(color1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter any one color from RED, YELLOW, GREEN : ");
        String color = scanner.next();
        TrafficLight.lights(color);
    }
}
