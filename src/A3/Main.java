package A3;

public class Main {
    public static void main(String[] args) {
        ArrayBuilder array = new ArrayBuilder(new int[] {1,2,3,4,5});
        for (int number : array.getNumbers()) {
            System.out.println(number);
        }
        for (int i = 0; i < array.getNumbers().length; i++) {
            System.out.println(array.getNumbers()[i]);
        }
        looper();
    }

    public static void looper() {
        int[] testArray = new int[5];

        for (int i = 0; i < testArray.length; i++) {
            testArray[i]=i+1;
        }
        for (int j : testArray) {
            System.out.println(j);
        }
    }

}