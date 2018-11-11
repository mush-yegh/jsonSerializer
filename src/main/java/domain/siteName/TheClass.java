package domain.siteName;

class TheClass {

    @Transient()
    private boolean isSomething;

    private char ch;

    @Transient()
    private short shortNum;

    private int intNum;

    @Transient()
    private long longNum;

    private double doubNum;
    
    @Transient()
    private float floatNum;

    private String strField;
    
    TheClass(boolean isSomething, char ch, short shortNum, int intNum, long longNum, double doubNum, float floatNum, String strField) {
        this.isSomething = isSomething;
        this.ch = ch;
        this.shortNum = shortNum;
        this.intNum = intNum;
        this.longNum = longNum;
        this.doubNum = doubNum;
        this.floatNum = floatNum;
        this.strField = strField;
    }

    public String getStrField() {
        return this.strField;
    }

    public float getFloatNum() {
        return this.floatNum;
    }

    public double getDoubNum() {
        return this.doubNum;
    }
    //and so on ...
}
