package hedaox.ninjinentities.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;

public class MessageSendEntityToSpark implements IMessage {

    private int toSend;

    public MessageSendEntityToSpark() { }

    public MessageSendEntityToSpark(int text) {
        this.toSend = text;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        toSend = buf.readInt(); // this class is very useful in general for writing more complex objects
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(toSend);
    }

    public static class Handler implements IMessageHandler<MessageSendEntityToSpark, IMessage> {
        @Override
        public IMessage onMessage(MessageSendEntityToSpark message, MessageContext ctx) {
            for (Entity entityObject : ctx.getServerHandler().playerEntity.worldObj.loadedEntityList) {
                if(entityObject.getEntityId() == message.toSend) {
                    entityObject.worldObj.playSoundAtEntity(entityObject, "jinryuudragonbc:1610.spark", 0.0375F, 0.85F);
                }
            }
            return null; // no response in this case
        }
    }
}
