package collection;

import java.util.ArrayList;
import java.util.List;

public class TestCollection {
    public static void main(String[] args) {
        User user1 = new User("thanh", "vanthanh@gmail.com", 1);
        User user2 = new User("thanh333", "vanthanh8888@gmail.com", 1);
        User user3 = new User("thanh", "vanthanh111111@gmail.com", 1);
        ResponseStatus res = new ResponseStatus("400", "success");
        List<User> listUser = new ArrayList();
        listUser.add(user1);
        listUser.add(user2);
        listUser.add(user3);
        System.out.println(listUser);
        for(User u : listUser){
            System.out.println(u.getUsername());
        }

        GeneralResponse<List<User>> generalResponse = new GeneralResponse(res, listUser);
        System.out.println(generalResponse);
        System.out.println("finish");
    }
}
