/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE PLAY_TUNE PACKING
package io.mavlink.common;
import io.mavlink.MAVLinkPacket;
import io.mavlink.Messages.MAVLinkMessage;
import io.mavlink.Messages.MAVLinkPayload;
        
/**
 * Control vehicle tone generation (buzzer).
 */
public class msg_play_tune extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_PLAY_TUNE = 258;
    public static final int MAVLINK_MSG_LENGTH = 232;
    private static final long serialVersionUID = MAVLINK_MSG_ID_PLAY_TUNE;

      
    /**
     * System ID
     */
    public short target_system;
      
    /**
     * Component ID
     */
    public short target_component;
      
    /**
     * tune in board specific format
     */
    public byte tune[] = new byte[30];
      
    /**
     * tune extension (appended to tune)
     */
    public byte tune2[] = new byte[200];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_PLAY_TUNE;
        
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        
        for (int i = 0; i < tune.length; i++) {
            packet.payload.putByte(tune[i]);
        }
                    
        
        if (isMavlink2) {
             
        for (int i = 0; i < tune2.length; i++) {
            packet.payload.putByte(tune2[i]);
        }
                    
            
        }
        return packet;
    }

    /**
     * Decode a play_tune message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
         
        for (int i = 0; i < this.tune.length; i++) {
            this.tune[i] = payload.getByte();
        }
                
        
        if (isMavlink2) {
              
        for (int i = 0; i < this.tune2.length; i++) {
            this.tune2[i] = payload.getByte();
        }
                
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_play_tune() {
        this.msgid = MAVLINK_MSG_ID_PLAY_TUNE;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_play_tune( short target_system, short target_component, byte[] tune, byte[] tune2) {
        this.msgid = MAVLINK_MSG_ID_PLAY_TUNE;

        this.target_system = target_system;
        this.target_component = target_component;
        this.tune = tune;
        this.tune2 = tune2;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_play_tune( short target_system, short target_component, byte[] tune, byte[] tune2, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_PLAY_TUNE;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.target_system = target_system;
        this.target_component = target_component;
        this.tune = tune;
        this.tune2 = tune2;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_play_tune(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_PLAY_TUNE;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

         
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setTune(String str) {
        int len = Math.min(str.length(), 30);
        for (int i=0; i<len; i++) {
            tune[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<30; i++) {            // padding for the rest of the buffer
            tune[i] = 0;
        }
    }

    /**
    * Gets the message, formatted as a string
    */
    public String getTune() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 30; i++) {
            if (tune[i] != 0)
                buf.append((char) tune[i]);
            else
                break;
        }
        return buf.toString();

    }
                          
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setTune2(String str) {
        int len = Math.min(str.length(), 200);
        for (int i=0; i<len; i++) {
            tune2[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<200; i++) {            // padding for the rest of the buffer
            tune2[i] = 0;
        }
    }

    /**
    * Gets the message, formatted as a string
    */
    public String getTune2() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 200; i++) {
            if (tune2[i] != 0)
                buf.append((char) tune2[i]);
            else
                break;
        }
        return buf.toString();

    }
                         
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_PLAY_TUNE - sysid:"+sysid+" compid:"+compid+" target_system:"+target_system+" target_component:"+target_component+" tune:"+tune+" tune2:"+tune2+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_PLAY_TUNE";
    }
}
        