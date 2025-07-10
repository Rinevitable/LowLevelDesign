package elevatorDesign.model;

public class Display {
    int floor;
    Direction dir;

    public void setDisplay(int floor, Direction dir) {
        this.floor = floor;
        this.dir = dir;
    }

    public void showDisplay() {
        System.out.println(floor);
        System.out.println(dir);
    }
}
