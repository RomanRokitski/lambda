package human.stream.Lambda.message;

import java.util.ArrayList;
import java.util.List;

public class Messenger {
    private List<MessengerListener> listeners = new ArrayList<>();

    public void addListener(MessengerListener listener){
        listeners.add(listener);
    }
    public void onMessage(String message) {
        //todo some business logic

        for (MessengerListener listener : listeners) {
            listener.onMessengerReceived(message);

        }
    }
}
