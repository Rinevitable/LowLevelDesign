package elevatorDesign.model;

public class Elevator {
    int id;
    Display dis;
    int currentFloor;
    Status elevatorStatus;
    InternalButton internalButton;
    Door door;
    Direction direction;

    public Elevator() {
        dis = new Display();
        currentFloor = 0;
        elevatorStatus = Status.IDLE;
        internalButton = new InternalButton();
        door = new Door();
        direction = Direction.UP;
    }

    public void showDisplay() {
        dis.showDisplay();
    }

    public void pressButton(int destination) {
        internalButton.pressButton(destination, this);
    }

    public void setDisplay() {
        this.dis.setDisplay(currentFloor, direction);
    }

    boolean moveElevator(Direction dir, int destinationFloor) {
        int startFloor = currentFloor;
        if (dir == Direction.UP) {
            for (int i = startFloor; i <= destinationFloor; i++) {

                this.currentFloor = startFloor;
                setDisplay();
                showDisplay();
                if (i == destinationFloor) {
                    return true;
                }
            }
        }

        if (dir == Direction.DOWN) {
            for (int i = startFloor; i >= destinationFloor; i--) {

                this.currentFloor = startFloor;
                setDisplay();
                showDisplay();
                if (i == destinationFloor) {
                    return true;
                }
            }
        }
        return false;
    }

}
