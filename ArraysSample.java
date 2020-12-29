import java.util.Arrays;
public class ArraysSample {
    public static void main(String[] args) {
        double[] numbers = {6.0,4.4,1.9,2.9,5.6,6.2};
        Arrays.sort(numbers);
        for (double item:numbers) {
            System.out.println(item + "  ");
        }
        System.out.println();
        double[] numbers1 = {6.0,4.4,1.9,2.9,5.6,6.2};
        Arrays.sort(numbers1,1,3);
        for (double item:numbers1) {
            System.out.println(item + "  ");
        }
        System.out.println();
        int list[] = {2,4,7,10,11,65,66,89,77,25,32};
        System.out.println("Index"+Arrays.binarySearch(list,6));




    }
}
