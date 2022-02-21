package kumar.saroj;

public class TrackCoach implements Coach{

    @Override
    public void sayHello() {
        System.out.println("Hello by TrackCoach");
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }
}
