package elevatorDesign.model;

import java.util.List;

public class Building {
    List<Floor> floorList;

    //it itself is scalable
    public Building(List<Floor> floors) {
        this.floorList = floors;
    }

    public void addFloors(Floor newFloor) {
        floorList.add(newFloor);
    }

    public void removeFloors(Floor floor) {
        floorList.remove(floor);
    }

    public List<Floor> getFloorList() {
        return floorList;
    }
}
