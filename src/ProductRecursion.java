import java.util.Scanner;

public class ProductRecursion {
    static int numArraySize = 5;
    static double[] numArray = new double[numArraySize];
    static double product = 1;

    public static void getProduct(int numArraySize)
    {
        if (numArraySize <= 0)
        {
            return;
        }
        product = product * numArray[numArraySize - 1];
        getProduct(numArraySize - 1);
    }

    public static void main(String[] args) {
        // Get Input
        Scanner scnr = new Scanner(System.in);
        for (int i = 0; i < numArray.length; i++)
        {
            numArray[i] = scnr.nextDouble();
        }
        // Get product
        getProduct(numArraySize);

        // Print product to console
        System.out.println(product);
    }
}
