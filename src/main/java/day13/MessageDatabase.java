package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    public static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message message : messages) {
            if ((u1.getUsername().equals(message.getSender().getUsername())
                    && u2.getUsername().equals(message.getReceiver().getUsername())
                    || u2.getUsername().equals(message.getSender().getUsername())
                    && u1.getUsername().equals(message.getReceiver().getUsername()))&&!u1.getSubscriptions().equals(u2.getSubscriptions())) {
                System.out.println(message.getSender().getUsername() + ": " + message.getText());
            }
        }
    }


}
