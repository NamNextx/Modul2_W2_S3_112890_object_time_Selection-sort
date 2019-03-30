public class MainManagement {
    public static void main(String[] args) {
        double myArray[] = new double[100000];
        setArray(myArray);
        double time;
        time = selectionSort(myArray);

        display(time);
    }
}
