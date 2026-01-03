package strings_arrays;
// Basics of arrays
import java.util.Arrays;

public class ArraysBasics {
    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 2};
        // int[] arr2 = new int[5];  default values 0

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Length: " + nums.length);

        // Sum of array
        int sum = 0;
        for(int n : nums){
            sum += n;
        }
        System.out.println("Sum = " + sum);

        // Sorting
        Arrays.sort(nums);
        System.out.println("Sorted: " + Arrays.toString(nums));

        //n - dimensional array
        int[][] array_2D = new int[2][2];
        array_2D[0][0] = 1; //assigning values
        array_2D[0][1] = 2;
        array_2D[1][0] = 3;
        array_2D[1][1] = 4;
        for(int i = 0; i < array_2D.length; i++){
            for(int j = 0; j < array_2D[i].length; j++){
                System.out.print(array_2D[i][j] + " ");
            }
            System.out.println();
        }

    }
}
