package kumar.saroj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        Coach myCoach = context.getBean("myTrackCoach", Coach.class);
        System.out.println(myCoach.getDailyWorkout());

        Coach myBaseBallCoach = context.getBean("myBaseBallCoach", BaseballCoach.class);
        myBaseBallCoach.sayHello();

        Coach myCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
        myCricketCoach.sayHello();

        Player bangaloreTeam = context.getBean("bangaloreTeam", Player.class);
        System.out.println("Email: "+bangaloreTeam.getEmail() +", Team: "+ bangaloreTeam.getTeam());
        context.close();
    }
}
