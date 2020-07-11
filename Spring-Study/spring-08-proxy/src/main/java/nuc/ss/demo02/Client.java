package nuc.ss.demo02;

public class Client {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);

        proxy.add();
    }
}
