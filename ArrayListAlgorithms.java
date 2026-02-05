import java.util.*;

public class ArrayListAlgorithms {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();


        for (int i = 0; i < 50; i++) {
            numbers.add(rand.nextInt(101)); 
        }


        System.out.println("Sum: " + getSum(numbers));
        System.out.println("Average: " + getAverage(numbers));
        System.out.println("Maximum value: " + getMax(numbers));
        System.out.println("Minimum valu: " + getMin(numbers));
    }


    public static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    public static double getAverage(ArrayList<Integer> list) {
        return (double) getSum(list) / list.size();
    }


    public static int getMax(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }


    public static int getMin(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int num : list) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}