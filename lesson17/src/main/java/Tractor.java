public class Tractor {
    private static final int FIELD_SIZE = 5;
    private Position position = new Position(0, 0);
    private Orientation orientation = Orientation.NORTH;

    public void move(String command) {
        if (command == "F") {
            moveForwards();
            return;
        }
        if (command == "T") {
            turnClockwise();
        }
    }

    public void moveForwards() {
        switch (orientation) {
            case NORTH: position.chgPos(Position.change.increment,Position.param.y); break;
            case EAST: position.chgPos(Position.change.increment,Position.param.x); break;
            case SOUTH: position.chgPos(Position.change.decrement,Position.param.y); break;
            case WEST: position.chgPos(Position.change.decrement,Position.param.x); break;
        }

        if (!position.isValid(FIELD_SIZE)) {
            throw new TractorInDitchException();
        }
    }

    public void turnClockwise() {
        switch (orientation) {
            case NORTH: orientation = Orientation.EAST; break;
            case EAST: orientation = Orientation.SOUTH; break;
            case SOUTH: orientation = Orientation.WEST; break;
            case WEST: orientation = Orientation.NORTH; break;
        }
    }

    public int getPositionX() {
        return position.x;
    }

    public int getPositionY() {
        return position.y;
    }

    public Orientation getOrientation() {
        return orientation;
    }

}