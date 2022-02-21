package kumar.saroj;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("CricketCoach() called");
    }

    public CricketCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public void sayHello() {
        System.out.println("CricketCoach saying hello: "+ fortuneService);
    }

    @Override
    public String getDailyWorkout() {
        return null;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("CricketCoach:setFortuneService() called!!!!!");
    }
}
