package ManuSorts;

import java.util.Date;
import java.util.Random;

public class SelectionSort{

    public static void selectionSort(double arr[]) {

        int length = arr.length;
        int count = 0;
        double tg;
        //currentTime.startTime();
        for (int i = 1; i < length; i++) {
            if (arr[count] < arr[i]) {
                tg = arr[i];
                arr[i] = arr[count];
                arr[count] = tg;
            }
        }
       // currentTime.endTime();
       // return currentTime.getElapsedTime();
    }



}

