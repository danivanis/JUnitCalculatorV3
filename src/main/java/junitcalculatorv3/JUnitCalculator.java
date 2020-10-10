package junitcalculatorv3;

public class JUnitCalculator implements Operations {

    int mmValue;
    int cmValue;
    int dmValue;
    int mValue;
    int kmValue;

    public JUnitCalculator(int mmValue, int cmValue, int dmValue, int mValue, int kmValue){
        this.mmValue = mmValue;
        this.cmValue = cmValue;
        this.dmValue = dmValue;
        this.mValue = mValue;
        this.kmValue = kmValue;
    }

    public int getMmValue(int mmValue) {
        return this.mmValue;
    }

    public int getCmValue() {
        return cmValue;
    }

    public int getDmValue() {
        return dmValue;
    }

    public int getmValue() {
        return mValue;
    }

    public int getKmValue() {
        return kmValue;
    }

    public void setMmValue(int mmValue) {
        this.mmValue = mmValue;
    }

    public void setCmValue(int cmValue) {
        this.cmValue = cmValue;
    }

    public void setDmValue(int dmValue) {
        this.dmValue = dmValue;
    }

    public void setmValue(int mValue) {
        this.mValue = mValue;
    }

    public void setKmValue(int kmValue) {
        this.kmValue = kmValue;
    }

    @Override
    public double additionMM(int mmValue, int cmValue, int dmValue, int mValue, int kmValue) {
        int sum = kmValue * 1000000 + mValue * 1000 + dmValue * 100 + cmValue * 10 + mmValue;
//        System.out.println("Sum converted in mm is: \n" + mmValue + " mm + " + cmValue + " cm + " + dmValue + " dm + " + mValue + " m + " + kmValue + " km = " + sum + " mm!");
        return sum;
    }

    @Override
    public void additionCM(int mmValue, int cmValue, int dmValue, int mValue, int kmValue) {
        int sum = kmValue * 100000 + mValue * 100 + dmValue * 10 + cmValue + mmValue/10;
        System.out.println("Sum converted in cm is: \n" + mmValue + " mm + " + cmValue + " cm + " + dmValue + " dm + " + mValue + " m + " + kmValue + " km = " + sum + " cm!");
    }

    @Override
    public void additionDM(int mmValue, int cmValue, int dmValue, int mValue, int kmValue) {
        int sum  = kmValue * 10000 + mValue * 10 + dmValue + cmValue/10 + mmValue/100;
        System.out.println("Sum converted in dm is: \n" + mmValue + " mm + " + cmValue + " cm + " + dmValue + " dm + " + mValue + " m + " + kmValue + " km = " + sum + " dm!");
    }

    @Override
    public void additionM(int mmValue, int cmValue, int dmValue, int mValue, int kmValue) {
        int sum  = kmValue * 1000 + mValue + dmValue/10 + cmValue/100 + mmValue/1000;
        System.out.println("Sum converted in m is: \n" + mmValue + " mm + " + cmValue + " cm + " + dmValue + " dm + " + mValue + " m + " + kmValue + " km = " + sum + " m!");
    }

    @Override
    public void additionKM(int mmValue, int cmValue, int dmValue, int mValue, int kmValue) {
        int sum  = kmValue + mValue/1000 + dmValue/10000 + cmValue/100000 + mmValue/1000000;
        System.out.println("Sum converted in km is: \n" + mmValue + " mm + " + cmValue + " cm + " + dmValue + " dm + " + mValue + " m + " + kmValue + " km = " + sum + " m!");
    }

    @Override
    public void subtractionMM(int mmValue, int cmValue, int dmValue, int mValue, int kmValue) {

    }

    @Override
    public void subtractionCM(int mmValue, int cmValue, int dmValue, int mValue, int kmValue) {

    }

    @Override
    public void subtractionDM(int mmValue, int cmValue, int dmValue, int mValue, int kmValue){

    }

    @Override
    public void subtractionM(int mmValue, int cmValue, int dmValue, int mValue, int kmValue){

    }

    @Override
    public void subtractionKM(int mmValue, int cmValue, int dmValue, int mValue, int kmValue){

    }

    public int getMmValue() {
        return mmValue;
    }
}