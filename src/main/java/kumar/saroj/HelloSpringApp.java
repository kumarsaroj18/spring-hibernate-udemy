package kumar.saroj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach myCoach = context.getBean("myCoach", Coach.class);
        System.out.println(myCoach.getDailyWorkout());

        context.close();
    }
}
