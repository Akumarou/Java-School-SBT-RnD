public class MyClassForFrom {
    private int integerValue;
    private String stringValue;
    private double notEqualTypeDoubleValue=0;
    private float floatValueWithNonPublicGetter;
    private float floatValueWithNonPublicSetter;

    MyClassForFrom(int intVal, String strVal, float floatVal, double doubleVal){
        this.integerValue = intVal;
        this.stringValue = strVal;
        this.floatValueWithNonPublicGetter = floatVal;
        this.notEqualTypeDoubleValue = doubleVal;
        this.floatValueWithNonPublicSetter = floatVal;
    }

    public int getIntegerValue() {
        return integerValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public float getFloatValueWithNonPublicSetter() {
        return floatValueWithNonPublicSetter;
    }

    public double getNotEqualTypeDoubleValue() {
        return notEqualTypeDoubleValue;
    }

    protected float getFloatValueWithNonPublicGetter() {
        return floatValueWithNonPublicGetter;
    }

    @Override
    public String toString() {
        return ("int val - " + integerValue
                + "; stringVal - " + stringValue
                + "; doubleVal - " + notEqualTypeDoubleValue
                + "; floatVal - "+floatValueWithNonPublicGetter
                + "; floatVal2 - " + floatValueWithNonPublicSetter);
    }
}
