import org.apache.commons.lang.SerializationUtils;

import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.TimeoutException;

/**
 * Created by Dell on 2017/6/20.
 */
public class Producer extends EndPoint {
    public Producer(String name) throws IOException, TimeoutException {
        super(name);
    }

    public void sendMessage(Serializable object) throws IOException {
        channel.basicPublish("", name, null, SerializationUtils.serialize(object));
    }
}
