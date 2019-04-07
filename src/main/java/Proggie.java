import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Proggie {

    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        System.out.println("Bean names: " + Arrays.toString(context.getBeanNamesForType(Borkable.class)));

        Borkable borkable = (Borkable) context.getBean("doggo2");
        borkable.bork();
        borkable = (Borkable) context.getBean("pupper2");
        borkable.bork();
//        context.getBean(Borkable.class);
//        context.getBean(Borkable.class);
//        context.getBean(Borkable.class);
    }
}
