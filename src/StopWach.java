public class StopWach {
    private double startTime;
    private double endTime;

    private static StopWach instanceStopwach;

    private StopWach(){

    }
    private StopWach(double startTime, double endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public static StopWach getInstance(double startTime, double endTime) {
        if (instanceStopwach==null){
            synchronized (StopWach.class){
                instanceStopwach=new StopWach(startTime,endTime);
            }
        }
        return instanceStopwach;
    }

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void startTime() {
        this.startTime = System.currentTimeMillis();
    }

    public void endTime() {
        this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return getEndTime() - getStartTime();
    }
}
