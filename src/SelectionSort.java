import java.util.Date;
import java.util.Random;

public class SelectionSort {
    private double startTime;
    private double endTime;

    private SelectionSort(double startTime,double endTime){
        this.startTime=startTime;
        this.endTime=endTime;
    }
    private double getStartTime(){
        return startTime;
    }
    private double getEndTime(){
        return endTime;
    }
    private void startTime(){
        this.startTime= System.currentTimeMillis();
    }
    private void endTime(){
        this.endTime=System.currentTimeMillis();
    }
    private double getElapsedTime(){
        return getEndTime()-getStartTime();
    }
    private static double selectionSort(double arr[]){
        SelectionSort currentTime=new SelectionSort(System.currentTimeMillis(),System.currentTimeMillis());
        currentTime.startTime();
        int length=arr.length;
        int count=0;
        double tg;
        for (int i=1;i<length;i++){
            if (arr[count]<arr[i]){
                tg=arr[i];
                arr[i]=arr[count];
                arr[count]=tg;
            }
        }
        currentTime.endTime();
        return currentTime.getElapsedTime();
    }

    private static void setArray(double array[]){
        Random rd=new Random();
        int length=array.length;
        for (int i=0;i<length;i++){
            array[i]=rd.nextInt(99);
        }
    }
    private static void display(double time){
        System.out.println("Time for Selection sort for 100000 = "+time+" Millis");
    }

    public static void main(String[] args) {
        double myArray[]=new double[100000];
        setArray(myArray);
        double time;
        time=selectionSort(myArray);

        display(time);





    }


}
