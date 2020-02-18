package review;

public class IntClass {
    public static void main(String[] args) {
        IntClass go = new IntClass(1);

    }

    int value;
//    int valOne;
//    int valTwo;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int calcSum(int valOne, int valTwo) {
        return valOne + valTwo;
    }

    public static int calcSum() {

    }


    public IntClass(int value) {
        this.value = value;
    }


}
