import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperatures{
    public static void main(String[] args) {
        // create arraylists for days and temps
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temps = new ArrayList<>();

        // populate data
        days.add("Monday");
        temps.add(61.5);
        days.add("Tuesday");
        temps.add(65.0);
        days.add("Wednesday");
        temps.add(64.5);
        days.add("Thursdays");
        temps.add(68.0);
        days.add("Friday");
        temps.add(70.5);
        days.add("Saturday");
        temps.add(69.5);
        days.add("Sunday");
        temps.add(70.0);

        // init scanner to read user input
        Scanner scanner = new Scanner(System.in);
        // init boolean for while loop flag
        boolean keepRunning = true;
        System.out.println("Enter a day of the week to get the temp");
        System.out.println("Or enter \"week\" to see all daily temps");
        System.out.println("Enter enter \"exit\" to exit the program");

        // infinite while loop to run to capture user input
        while(keepRunning){
            System.out.println("Please enter your selection:");
            String userInput = scanner.nextLine().trim();

            if(userInput.equalsIgnoreCase("exit")){
                keepRunning = false;
            } else if(userInput.equalsIgnoreCase("week")){
                // init double to get sum for average temp
                double sum = 0.0;
                // output all days and their temps
                for(int i = 0; i < days.size(); i ++){
                    System.out.println("Day: " + days.get(i) + "\nTemperature: " + temps.get(i));
                    sum += temps.get(i);
                }
                double avg = sum / temps.size();
                System.out.println("Average temp: " + avg);

            }else {
                boolean valid = false;
                for(int i = 0; i < days.size(); i++){
                    if(days.get(i).equalsIgnoreCase(userInput)){
                        System.out.println("Found! \nDay: " + days.get(i) + "Temp: " + temps.get(i));
                        valid = true;
                        break;
                    }
                }
                if(!valid){
                    System.out.println("Invalid input");
                }
            }
        }
        scanner.close();
        System.out.println("Program ended");
    }
}