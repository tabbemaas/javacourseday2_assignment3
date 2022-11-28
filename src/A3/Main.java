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
    }
}