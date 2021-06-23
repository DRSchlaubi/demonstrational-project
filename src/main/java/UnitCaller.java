import dev.kord.core.entity.channel.GuildChannel;
import dev.kord.core.entity.channel.TextChannel;

public class UnitCaller {
    TextChannel x(GuildChannel channel) {
        if (channel instanceof TextChannel) {
            return ((TextChannel) channel);
        }
        return null;
    }

    TextChannel y(GuildChannel channel) {
        try {
            return ((TextChannel) channel);
        } catch (ClassCastException e) {

            return null;
        }
    }
}
