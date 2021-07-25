import java.util.*;

public class Request {

    //At each time, 0-3 planes may arrive at the takeoff queues and
    public static int takeoffQueueGenerator() {
        //determines num of takeoff planes to be generated into queue
        return (int)(Math.random()*4);}

    //and 0-3 planes may arrive at the landing queues.
    public static int arrivalQueueGenerator() {
        //determines num of landing planed to be generated into queue
        return (int)(Math.random()*4);}

    //successive ODD ints for landingQueue
    public static int getlandingID(int landingIDCount){
        int landingID = (landingIDCount*2)-1;
        return landingID;}

    //successive EVEN ints for takeoffQueue
    public static int gettakeOffID(int takeOffIDCount){
        int takeOffID = takeOffIDCount*2;
        return takeOffID;}


    public static void main(String args[]) {
        Queue<Integer>landingQueue = new LinkedList<>();
        Queue<Integer>takeoffQueue = new LinkedList<>();

        int takeoffQueueCount=0;
        int landingQueueCount=0;

        //(& if applicable: Plane #xyz is cleared to takeoff/land)
        for (int i = 1; i <= 120; i++) { //120 time units of activity
            System.out.println("\nAirport information for time unit "+ i + ": \n");
            SimulationTime.setStep(); //increments step by one
            System.out.println("The time is " + SimulationTime.getSimTime()); //gets the current time

            for (int j = 0; j <= takeoffQueueGenerator(); j++) {
                takeoffQueueCount++;
                takeoffQueue.add(gettakeOffID(takeoffQueueCount));


            for (int k = 0; k < arrivalQueueGenerator(); k++) {
                landingQueueCount++;
                landingQueue.add(getlandingID(landingQueueCount));}

            System.out.println("There are " +landingQueue.size()+ " planes waiting to land."); //num planes in landingQueue
            System.out.println("There are " + takeoffQueue.size()+" planes waiting to take off."); //num planes in takeoffQueue
            System.out.println("Planes waiting to take off: "+ takeoffQueue);
            System.out.println("Planes waiting for landing: "+ landingQueue);

            for (int k = 0; k < 2; k++) {
            if (takeoffQueue.isEmpty() & landingQueue.isEmpty()){
                return;}
            else if (landingQueue.size()>=takeoffQueue.size()){// give landing priority by > OR equal to
                System.out.println("Plane #" + landingQueue.peek()+ " has arrived.");
                        landingQueue.remove();}
            else if (landingQueue.size()<takeoffQueue.size()){
                System.out.println("Plane #" + takeoffQueue.peek()+ " is cleared for takeoff.");
                        takeoffQueue.remove(); }
            }
            }}}}
