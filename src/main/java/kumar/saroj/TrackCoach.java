package kumar.saroj;

public class TrackCoach implements Coach{
    private FortuneService fortuneService;

    public TrackCoach() {
        System.out.println("TrackCoach()");
    }

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

    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside init method");
    }

    public void changeClothes() {
        System.out.println("TrackCoach: inside destroy method");
    }

}
