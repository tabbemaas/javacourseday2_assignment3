package A4;

public class Main {
    public static void main(String[] args) {
        printPyramid(10);
    }

    public static void printPyramid(int size) {
        for(int i = 0; i < size; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("x");
            };
            System.out.print("\n");
        }
    }
}
