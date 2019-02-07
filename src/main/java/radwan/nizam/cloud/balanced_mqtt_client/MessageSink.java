package radwan.nizam.cloud.balanced_mqtt_client;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.SubscribableChannel;

@EnableBinding(MessageSink.InputChannel.class)
public class MessageSink {

    @StreamListener(InputChannel.SINK)
    public void handle(String message) {
        System.out.println("new message:" + message + ", from worker :" + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public interface InputChannel {
        String SINK = "message-sink";

        @Input(SINK)
        SubscribableChannel sink();
    }
}
