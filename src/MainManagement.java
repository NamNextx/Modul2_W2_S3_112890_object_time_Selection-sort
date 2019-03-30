import InterfaceArray.IOClass;
import GroupSorts.SelectionSort;

import java.lang.Exception;


public class MainManagement {
    public static void main(String[] args) throws Exception{
        try {

            double myArray[] = new double[100000];
            double time=coutTime(myArray);
            IOClass show=IOClass.getInstance();
            System.out.println(show);
            show.displayArray(time);

        }catch (Exception ex)
        {
            throw ex;
        }
    }
    public static double coutTime( double myArray[])throws Exception{
        try {
            StopWach currentTime = StopWach.getInstance(System.currentTimeMillis(), System.currentTimeMillis());
            IOClass robot=IOClass.getInstance();
            System.out.println(robot);


            robot.inputArray(myArray);
            currentTime.startTime();
            SelectionSort.selectionSort(myArray);
            currentTime.endTime();


            return currentTime.getElapsedTime();
        }catch (Exception ex){
            throw ex;
        }


    }


}
