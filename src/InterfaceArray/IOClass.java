package InterfaceArray;

import java.util.Random;

public class IOClass implements IInOut {
    private static IOClass instance;
    private IOClass(){}
    public static IOClass getInstance() throws Exception{
        try {
            if (instance==null){
                synchronized (IOClass.class){
                    instance=new IOClass();
                }
            }
            return instance;

        }
        catch (Exception ex){
            throw ex;
        }
    }
    @Override
    public void inputArray(double array[]) throws Exception {
       try {
           Random rd = new Random();
           int length = array.length;
           for (int i = 0; i < length; i++) {
               array[i] = rd.nextInt(99);
           }
       }
       catch (Exception ex){
           throw ex;
       }

    }
    @Override
    public void displayArray(double time) {
        System.out.println("Time for Selection sort for 100000 = " + time + " Millis");
    }
}
