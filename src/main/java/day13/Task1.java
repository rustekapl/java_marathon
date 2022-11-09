package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.sendMessage(user2,"Hi!");
        user1.sendMessage(user2,"How are you?");

        user2.sendMessage(user1,"Hi!");
        user2.sendMessage(user1,"I'm fine!");
        user2.sendMessage(user1,"And you?");

        user3.sendMessage(user1,"Hello!");
        user3.sendMessage(user1,"What are you doing?");
        user3.sendMessage(user1,"Let's go to the park");

        user1.sendMessage(user3,"Hi!");
        user1.sendMessage(user3,"I'm busy today");
        user1.sendMessage(user3,"Maybe nex weekend?");

        user3.sendMessage(user1,"Ok. See you!");

        MessageDatabase.showDialog(user1,user3);

    }
}
