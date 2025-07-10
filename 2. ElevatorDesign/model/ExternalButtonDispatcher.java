package elevatorDesign.model;

import java.util.List;

public class ExternalButtonDispatcher {

    List<ElevatorController> elevatorControllerList = ElevatorCreator.elevatorControllerList;

    //    method
    public void submitExternalRequest(int floor, Direction dir) {
        //different methods here to sort the request

        //ODD Even used here
        for (ElevatorController elevatorController : elevatorControllerList) {
            int elevatorID = elevatorController.elevatorCar.id;
            if(elevatorID%2==1 && floor%2==1){
                elevatorController.submitExternalReq(floor,dir);
            }else if(elevatorID%2==0 && floor%2==0){
                elevatorController.submitExternalReq(floor,dir);
            }
        }
    }
}
