import java.time.LocalTime;
// 1 step = 5 minutes
//1 takeoff or landing = 3 steps (equal to 15 mins)

public class SimulationTime {
    public static LocalTime startTime = LocalTime.MIDNIGHT; // time at which simulation begins, set to midnight
    public static LocalTime simTime; //the current time in the simulation
    public static int step = 0; // 1 step in simulation time = 5 mins
    //public LocalTime elapsedSimTime; //the total amount of time that has gone by in the simulation

    //returns time in simulation
    public static LocalTime getSimTime() {
       simTime = startTime.plusMinutes(step*5);
        return simTime; }

    //increments step by 1 upon method call
    public static void setStep(){
    step++; }}
