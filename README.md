# airportSimulation
This program is designed to simulate a busy airport with two runways to handle all takeoffs and landings. 
Each landing and takeoff takes 15 minutes to complete, and there can only be one landing or takeoff at a time on runway one and on runway two.

The class SimulationTime sets the clock in the simulation.  Each time step in simulation time will equal five minutes in real time.  
The class Request is where planes make runway requests and join a waiting queue to takeoff or landing on one of the two runways.
At each time step, or at every five minute interval in the simulation, the methods takeoffQueueGenerator and arrivalQueueGenerator are called.  
When each of these methods is called, a random number from 0-3 is generated to determine the number of new planes to spawn into a landing or takeoff queue at that time step in the simulation.

This program manages the lengths of idle time the passengers spend waiting, and also gives priority to planes that request a landing in situations where there is the same number of planes in the takeoff and landing queues and the simulation has to decide which subsequent takeoff or ladnding to put on the runway.
