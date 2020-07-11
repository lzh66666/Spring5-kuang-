package nuc.ss.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 等价于 <bean id="user" class="nuc.ss.pojo.User"/>
@Component
@Scope("singleton")
public class User {
    public String name;

    //相当于<property name="name" value="狂神"/>
    @Value("狂神")
    public void setName(String name) {
        this.name = name;
    }
}
