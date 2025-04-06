package jpmorgan;

public class bus_fare {
    static int[] path = {800, 600, 750, 900, 1400, 1200, 1100, 1500};

    public static int CalculateFare(int distance) {
        double fare = (distance / 1000.0) * 5;
        return (int) Math.ceil(fare);
    }

    public static int getFare(String Source, String Destination) {
        int sourceStop = Integer.parseInt(Source.split(" ")[1]) - 1;
        int destinationStop = Integer.parseInt(Destination.split(" ")[1]) - 1;
        // Calculate the distance between source and destination
        int totalDistance = 0; // Initialize totalDistance

        // If the destination stop is after the source stop in the circular route
        if (destinationStop >= sourceStop) {
            for (int i = sourceStop; i < destinationStop; i++) {
                totalDistance += path[i];
            }
        } else { // If the destination stop is before the source stop (we wrap around)
            for (int i = sourceStop; i < path.length; i++) {
                totalDistance += path[i];
            }
            for (int i = 0; i < destinationStop; i++) {
                totalDistance += path[i];
            }
        }
        
        System.out.println("Distance = " + totalDistance);
        // Return the calculated fare for the given distance
        return CalculateFare(totalDistance);
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter Source (e.g., 'S 1'):");
        String si1 = scanner.nextLine();
        System.out.println("Enter Destination (e.g., 'D 5'):");
        String si2 = scanner.nextLine();
        int fare = getFare(si1, si2);
        System.out.println("Fare = " + fare);
        scanner.close(); // Close the scanner
    }
}