import java.util.Date;
import java.util.Random;

public class SelectionSort {

    private static double selectionSort(double arr[]) {
        StopWach currentTime = new StopWach(System.currentTimeMillis(), System.currentTimeMillis());

        int length = arr.length;
        int count = 0;
        double tg;
        currentTime.startTime();
        for (int i = 1; i < length; i++) {
            if (arr[count] < arr[i]) {
                tg = arr[i];
                arr[i] = arr[count];
                arr[count] = tg;
            }
        }
        currentTime.endTime();
        return currentTime.getElapsedTime();
    }

    private static void setArray(double array[]) {
        Random rd = new Random();
        int length = array.length;
        for (int i = 0; i < length; i++) {
            array[i] = rd.nextInt(99);
        }
    }

    private static void display(double time) {
        System.out.println("Time for Selection sort for 100000 = " + time + " Millis");
    }

    public static void main(String[] args) {
        double myArray[] = new double[100000];
        setArray(myArray);
        double time;
        time = selectionSort(myArray);

        display(time);
    }


}

