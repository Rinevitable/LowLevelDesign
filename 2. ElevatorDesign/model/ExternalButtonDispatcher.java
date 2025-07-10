package elevatorDesign.model;

import java.util.List;

public class ExternalButtonDispatcher {

    List<ElevatorController> elevatorControllerList = ElevatorCreator.elevatorControllerList;

    //    method
    public void submitExternalRequest(int floor, int dir) {
        //different methods here to sort the request

        //ODD Even used here
        for (ElevatorController elevatorController : elevatorControllerList) {
            int elevatorID = elevatorController.elevatorCar.id;
        }
    }
}
