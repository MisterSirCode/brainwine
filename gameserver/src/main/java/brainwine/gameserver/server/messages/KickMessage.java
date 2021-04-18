package brainwine.gameserver.server.messages;

import brainwine.gameserver.server.Message;

public class KickMessage extends Message {
    
    public String reason;
    public boolean shouldReconnect;
    
    public KickMessage(String reason, boolean shouldReconnect) {
        this.reason = reason;
        this.shouldReconnect = shouldReconnect;
    }
}
