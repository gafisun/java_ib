public class Fitbyte {
    private int Age;
    private int RestingHeartRate;
    private double MaximumHeartRate;

    public Fitbyte(int age, int restingHeartRate){
        this.Age = age;
        this.RestingHeartRate = restingHeartRate;
        this.MaximumHeartRate = 206.3 - (0.711 * age);
    }
    public double targetHeartRate(double percentageOfMaximum){
        return (((MaximumHeartRate - RestingHeartRate)* percentageOfMaximum) + RestingHeartRate);
    }
}
