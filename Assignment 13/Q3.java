import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validTime = false;
        int startTimeHrs = 0, startTimeMins = 0, endTimeHrs = 0, endTimeMins = 0;
        while (!validTime) {
            try {
                System.out.print("Enter start time (hh:mm): ");
                String startTime = scanner.nextLine();
                String[] startTimeArr = startTime.split(":");
                startTimeHrs = Integer.parseInt(startTimeArr[0]);
                startTimeMins = Integer.parseInt(startTimeArr[1]);

                System.out.print("Enter end time (hh:mm): ");
                String endTime = scanner.nextLine();
                String[] endTimeArr = endTime.split(":");
                endTimeHrs = Integer.parseInt(endTimeArr[0]);
                endTimeMins = Integer.parseInt(endTimeArr[1]);

                if (endTimeHrs < startTimeHrs || (endTimeHrs == startTimeHrs && endTimeMins < startTimeMins)) {
                    throw new InvalidTime("End time cannot be less than start time.");
                }

                validTime = true;
            } 
            catch (InvalidTime e) 
            {
                System.out.println(e.getMessage());
            } 
            catch (Exception e) {
                System.out.println("Invalid input. Please enter time in the format hh:mm.");
                scanner.nextLine();
            }
        }

        int diffHrs = endTimeHrs - startTimeHrs;
        int diffMins = endTimeMins - startTimeMins;
        int totalMins = diffHrs * 60 + diffMins;
        System.out.println("Time difference between " + startTimeHrs + ":" + startTimeMins + " and " + endTimeHrs + ":" + endTimeMins + " is " + totalMins + " minutes.");
    }
}

class InvalidTime extends Exception {
    public InvalidTime(String message) {
        super(message);
    }
}

