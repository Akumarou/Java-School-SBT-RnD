public interface ITractor {
    public void move(String command);

    public void moveForwards();

    public void turnClockwise();

    public int getPositionX();

    public int getPositionY();

    public Orientation getOrientation();
}
