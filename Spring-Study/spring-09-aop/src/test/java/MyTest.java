import nuc.ss.service.UserService;
import nuc.ss.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 动态代理代理的是接口! 注意点
        UserService userService = (UserService)context.getBean("userService");

        userService.add();
    }

}
