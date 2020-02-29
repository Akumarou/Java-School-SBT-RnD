public class Cookie implements Cloneable {
    int weight;

    @Override
    protected Cookie clone() throws CloneNotSupportedException {
        return (Cookie)super.clone();
    }
    public Cookie(){
        weight=1;
    }
}
