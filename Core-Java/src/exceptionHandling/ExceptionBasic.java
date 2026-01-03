package exceptionHandling;

import java.util.Scanner;

public class ExceptionBasic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            int[] arr = new int[2];
            arr[0] = 0;
            arr[1] = 1;
            int index = sc.nextInt();
            System.out.println(arr[index]);

            int result = arr[1]/arr[0];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("The chosen index is not available");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Program executed");
        }
    }
}
