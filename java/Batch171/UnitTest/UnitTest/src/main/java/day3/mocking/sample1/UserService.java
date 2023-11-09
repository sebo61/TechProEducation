package day3.mocking.sample1;

public class UserService {
    private UserManager userManager;

    public UserService(UserManager userManager) {
        this.userManager = userManager;
    }

    public String getUserById(int userId){
       String user="User "  +userManager.getUser(userId);
        return user;

    }
}
