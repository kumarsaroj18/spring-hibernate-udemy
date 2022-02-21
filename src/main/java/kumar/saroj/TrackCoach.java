package kumar.saroj;

public class TrackCoach implements Coach{
    private FortuneService fortuneService;

    @Override
    public void sayHello() {
        System.out.println("Hello by TrackCoach");
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

}
