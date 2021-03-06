package glitch.chat.events.channel;

import com.google.common.collect.ImmutableMap;
import glitch.socket.utils.EventImmutable;
import org.immutables.value.Value;

@EventImmutable
@Value.Immutable
public interface UserNoticeEvent extends ChannelEvent {
    ImmutableMap<String, String> getTags();

    String getMessage();
}
