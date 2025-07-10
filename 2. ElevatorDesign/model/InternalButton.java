package elevatorDesign.model;

public class InternalButton {
    //    Fields
    InternalButtonDispatcher dispatcher = new InternalButtonDispatcher();

    int[] availableButtons = {1, 2, 3, 4, 5, 6, 7};
    int buttonSelected;

    public void pressButton(int desFloor, Elevator elevatorCar) {
        dispatcher.submitRequest(desFloor, elevatorCar);
    }
}
