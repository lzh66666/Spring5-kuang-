import nuc.ss.config.MyConfig;
import nuc.ss.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void test1() {
        // 如果完全使用了配置类的方式去做,我们就只能通过AnnotationContext 上下文来获取容器,通过配置类的class对象加载!
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        User getUser = context.getBean("user", User.class);

        System.out.println(getUser.getName());
    }

}
