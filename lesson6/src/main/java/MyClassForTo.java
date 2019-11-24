public class MyClassForTo {
    private int integerValue=0;
    private String stringValue="";
    private int notEqualTypeDoubleValue=0;
    private float floatValueWithNonPublicGetter=0;
    private float floatValueWithNonPublicSetter=0;

    @Override
    public String toString() {
        return ("int val - " + integerValue
                + "; stringVal - " + stringValue
                + "; doubleVal - " + notEqualTypeDoubleValue
                + "; floatVal - "+floatValueWithNonPublicGetter
                + "; floatVal2 - " + floatValueWithNonPublicSetter);
    }

    MyClassForTo(){}
    MyClassForTo(int intVal, String strVal, float floatVal, int doubleVal){
        this.integerValue = intVal;
        this.stringValue = strVal;
        this.floatValueWithNonPublicGetter = floatVal;
        this.notEqualTypeDoubleValue = doubleVal;
        this.floatValueWithNonPublicSetter = floatVal;
    }
    public void setIntegerValue(int integerValue) {
        this.integerValue = integerValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public void setNotEqualTypeDoubleValue(int notEqualTypeDoubleValue) {
        this.notEqualTypeDoubleValue = notEqualTypeDoubleValue;
    }

    public void setFloatValueWithNonPublicGetter(float floatValueWithNonPublicGetter) {
        this.floatValueWithNonPublicGetter = floatValueWithNonPublicGetter;
    }

    protected void setFloatValueWithNonPublicSetter(float floatValueWithNonPublicSetter) {
        this.floatValueWithNonPublicSetter = floatValueWithNonPublicSetter;
    }
}
