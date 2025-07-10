package elevatorDesign.model;

import java.util.ArrayList;
import java.util.List;

public class ElevatorCreator {
    //static need to called from anywhere as per object need
    static List<ElevatorController> elevatorControllerList = new ArrayList<>();

    static {
        //elevator Car objects
        Elevator elevatorCar1 = new Elevator();
        elevatorCar1.id = 1;
        ElevatorController controller1 = new ElevatorController(elevatorCar1);

        Elevator elevatorCar2 = new Elevator();
        elevatorCar2.id = 2;
        ElevatorController controller2 = new ElevatorController(elevatorCar2);

        //        adding controller
        elevatorControllerList.add(controller1);
        elevatorControllerList.add(controller2);
    }
}
