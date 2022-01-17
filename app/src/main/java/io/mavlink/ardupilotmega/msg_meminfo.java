/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE MEMINFO PACKING
package io.mavlink.ardupilotmega;
import io.mavlink.MAVLinkPacket;
import io.mavlink.Messages.MAVLinkMessage;
import io.mavlink.Messages.MAVLinkPayload;
        
/**
 * State of APM memory.
 */
public class msg_meminfo extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_MEMINFO = 152;
    public static final int MAVLINK_MSG_LENGTH = 8;
    private static final long serialVersionUID = MAVLINK_MSG_ID_MEMINFO;

      
    /**
     * Heap top.
     */
    public int brkval;
      
    /**
     * Free memory.
     */
    public int freemem;
      
    /**
     * Free memory (32 bit).
     */
    public long freemem32;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_MEMINFO;
        
        packet.payload.putUnsignedShort(brkval);
        packet.payload.putUnsignedShort(freemem);
        
        if (isMavlink2) {
             packet.payload.putUnsignedInt(freemem32);
            
        }
        return packet;
    }

    /**
     * Decode a meminfo message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.brkval = payload.getUnsignedShort();
        this.freemem = payload.getUnsignedShort();
        
        if (isMavlink2) {
             this.freemem32 = payload.getUnsignedInt();
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_meminfo() {
        this.msgid = MAVLINK_MSG_ID_MEMINFO;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_meminfo( int brkval, int freemem, long freemem32) {
        this.msgid = MAVLINK_MSG_ID_MEMINFO;

        this.brkval = brkval;
        this.freemem = freemem;
        this.freemem32 = freemem32;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_meminfo( int brkval, int freemem, long freemem32, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_MEMINFO;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.brkval = brkval;
        this.freemem = freemem;
        this.freemem32 = freemem32;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_meminfo(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_MEMINFO;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

          
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_MEMINFO - sysid:"+sysid+" compid:"+compid+" brkval:"+brkval+" freemem:"+freemem+" freemem32:"+freemem32+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_MEMINFO";
    }
}
        