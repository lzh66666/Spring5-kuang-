import nuc.ss.pojo.User;
import nuc.ss.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        //Spring容器，类似于婚介网站
        //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //User user = (User)context.getBean("user");
        //别名
        //User user = (User)context.getBean("userNew");

        //创建同一个对象
        /*User user2 = (User)context.getBean("user");
        System.out.println(user == user2);*/

        //user.show();


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserT userT = (UserT) applicationContext.getBean("t2");
        userT.show();
    }

}
