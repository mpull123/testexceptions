/**************************************
 * Mallory Pulliam
 * Lab #3
 *************************************/

public class TestExceptions {
    public static void main(String[] args) {
        // Part I
        int myArr[] = new int[10];
        int x, y, z;
        x = 0;
        y = 10;

        // PART I
        try {
            z = y / x; // This line will cause an exception to be thrown
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        // PART II
        // Remove the z=y/z; line, and the PART II line will now cause a different
        // exception
        try {
            myArr[10] = 0; // This line will cause ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
