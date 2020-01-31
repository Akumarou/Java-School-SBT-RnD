import java.awt.*;

public class Position extends Point {
    public enum change{ increment,decrement; }
    public enum param{ x,y; }

    public Position(int x, int y) {
        super(x, y);
    }

    public void chgPos(change ch,param p){
        if(p==param.x){ if(ch==change.increment) this.x++; else this.x--; }
        else{ if(ch==change.increment) this.y++; else this.y--; }
    }

    public boolean isValid(int fieldSize) {
        return (getX() <= fieldSize && getY() <= fieldSize);
    }
}
