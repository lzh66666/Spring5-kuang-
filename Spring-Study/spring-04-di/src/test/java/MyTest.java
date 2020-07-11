import nuc.ss.pojo.Student;
import nuc.ss.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student)context.getBean("student");
        System.out.println(student);
    }

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        //User user = (User)context.getBean("user");
        User user = context.getBean("user", User.class);
        User user2 = context.getBean("user", User.class);
        System.out.println(user == user2);
    }
 }
