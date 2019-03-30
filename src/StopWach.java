public class StopWach {
    private double startTime;
    private double endTime;

    public StopWach(double startTime, double endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
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
