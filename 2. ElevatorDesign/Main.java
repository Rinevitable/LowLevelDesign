package elevatorDesign;

import elevatorDesign.model.Building;
import elevatorDesign.model.Floor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Floor> floorList = new ArrayList<>();
        Floor f1 = new Floor(1);
        Floor f2 = new Floor(2);
        Floor f3 = new Floor(3);
        Floor f4 = new Floor(4);
        Floor f5 = new Floor(5);

        floorList.add(f1);
        floorList.add(f2);
        floorList.add(f3);
        floorList.add(f4);
        floorList.add(f5);


        Building building = new Building(floorList);
    }

}
