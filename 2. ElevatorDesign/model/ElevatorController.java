package elevatorDesign.model;

import java.util.PriorityQueue;

public class ElevatorController {

    //different queue
    PriorityQueue<Integer> upMinPQ;
    PriorityQueue<Integer> downMaxPQ;
    //has object of elevator car
    Elevator elevatorCar;

    ElevatorController(Elevator elevatorCar) {
        this.elevatorCar = elevatorCar;
        upMinPQ = new PriorityQueue<>();//default min heap
        downMaxPQ = new PriorityQueue<>((a, b) -> (b - a));
//        downMaxPQ = new PriorityQueue<>(Comparator.reverseOrder()); same as above
    }

    //methods

    public void submitExternalReq(int floor, Direction dir) {
        if (dir == Direction.Down) {
            downMaxPQ.offer(floor);
        } else {
            //up
            upMinPQ.offer(floor);
        }

    }

    public void submitInternalReq(int floor) {
        //todo
    }

    public void controlElevatorCar() {
        while (true) {
            if (elevatorCar.direction == Direction.UP) {
//                todo
            }
        }
    }
}
