package human.stream.Lambda.message;

public class MessengerTests {
    public static void main(String[] args) {


        Messenger messenger = new Messenger();

        messenger.addListener(message ->
                System.out.println( "Message received in listener A: " + message));

        messenger.addListener(new MessengerListener() {
            @Override
            public void onMessengerReceived(String message) {
                System.out.println("Message in listener b received: " + message);
            }
        });

        messenger.onMessage("Test");
        messenger.onMessage("hello");
    }
}
