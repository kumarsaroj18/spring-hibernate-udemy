package kumar.saroj;

public class BaseballCoach implements Coach{
    private FortuneService fortuneService;

    public BaseballCoach() {}

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public void sayHello() {
        System.out.println("Baseball Coach hello message: "+ this.fortuneService.getFortune());
    }

    @Override
    public String getDailyWorkout() {
        return "Baseball needs 4 hours of daily practice";
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }
}
