package elevatorDesign.model;

public class Floor {
    int floorId;
    ExternalButtonDispatcher extDispatcher;

    //constructor
    public Floor(int id) {
        floorId = id;
        //create dispatcher
        extDispatcher = new ExternalButtonDispatcher();
    }

    public void pressButton(Direction dir) {
//        System.out.println("External Button pressed on "+floorId+" direction : "+dir);
        extDispatcher.submitExternalRequest(floorId,dir);
    }
}
