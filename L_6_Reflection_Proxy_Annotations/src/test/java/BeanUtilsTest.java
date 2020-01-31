import static org.junit.Assert.*;

public class BeanUtilsTest {

    @org.junit.Test
    public void assign() {
        class From {
            private int integerValue;
            private String stringValue;
            private double notEqualTypeDoubleValue=0;
            private float floatValueWithNonPublicGetter;
            private float floatValueWithNonPublicSetter;

            From(int intVal, String strVal, float floatVal, double doubleVal){
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

        class To {
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

            To(){}
            To(int intVal, String strVal, float floatVal, int doubleVal){
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


        To to = new To(0,"",0,0);
        BeanUtils.assign(to,new From(5,"wow",6f,7d));
        assertEquals(to.toString(),(new To(5,"wow",0,0)).toString());
    }
}