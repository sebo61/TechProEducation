package day3.mocking.sample1;

public class UserManager {
    public String getUser (int userId){
        if (userId==1){
            return "Jack Sparrow";
        } else if (userId==2){
            return "Sharlock Holmes";
        }else {
            return "Resource not found";
        }

    }

}
