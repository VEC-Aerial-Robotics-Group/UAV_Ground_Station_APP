/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE PARAM_ACK_TRANSACTION PACKING
package io.mavlink.development;
import io.mavlink.MAVLinkPacket;
import io.mavlink.Messages.MAVLinkMessage;
import io.mavlink.Messages.MAVLinkPayload;
        
/**
 * Response from a PARAM_SET message when it is used in a transaction.
 */
public class msg_param_ack_transaction extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_PARAM_ACK_TRANSACTION = 19;
    public static final int MAVLINK_MSG_LENGTH = 24;
    private static final long serialVersionUID = MAVLINK_MSG_ID_PARAM_ACK_TRANSACTION;

      
    /**
     * Parameter value (new value if PARAM_ACCEPTED, current value otherwise)
     */
    public float param_value;
      
    /**
     * Id of system that sent PARAM_SET message.
     */
    public short target_system;
      
    /**
     * Id of system that sent PARAM_SET message.
     */
    public short target_component;
      
    /**
     * Parameter id, terminated by NULL if the length is less than 16 human-readable chars and WITHOUT null termination (NULL) byte if the length is exactly 16 chars - applications have to provide 16+1 bytes storage if the ID is stored as string
     */
    public byte param_id[] = new byte[16];
      
    /**
     * Parameter type.
     */
    public short param_type;
      
    /**
     * Result code.
     */
    public short param_result;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_PARAM_ACK_TRANSACTION;
        
        packet.payload.putFloat(param_value);
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        
        for (int i = 0; i < param_id.length; i++) {
            packet.payload.putByte(param_id[i]);
        }
                    
        packet.payload.putUnsignedByte(param_type);
        packet.payload.putUnsignedByte(param_result);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a param_ack_transaction message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.param_value = payload.getFloat();
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
         
        for (int i = 0; i < this.param_id.length; i++) {
            this.param_id[i] = payload.getByte();
        }
                
        this.param_type = payload.getUnsignedByte();
        this.param_result = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_param_ack_transaction() {
        this.msgid = MAVLINK_MSG_ID_PARAM_ACK_TRANSACTION;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_param_ack_transaction( float param_value, short target_system, short target_component, byte[] param_id, short param_type, short param_result) {
        this.msgid = MAVLINK_MSG_ID_PARAM_ACK_TRANSACTION;

        this.param_value = param_value;
        this.target_system = target_system;
        this.target_component = target_component;
        this.param_id = param_id;
        this.param_type = param_type;
        this.param_result = param_result;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_param_ack_transaction( float param_value, short target_system, short target_component, byte[] param_id, short param_type, short param_result, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_PARAM_ACK_TRANSACTION;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.param_value = param_value;
        this.target_system = target_system;
        this.target_component = target_component;
        this.param_id = param_id;
        this.param_type = param_type;
        this.param_result = param_result;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_param_ack_transaction(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_PARAM_ACK_TRANSACTION;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

           
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setParam_Id(String str) {
        int len = Math.min(str.length(), 16);
        for (int i=0; i<len; i++) {
            param_id[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<16; i++) {            // padding for the rest of the buffer
            param_id[i] = 0;
        }
    }

    /**
    * Gets the message, formatted as a string
    */
    public String getParam_Id() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 16; i++) {
            if (param_id[i] != 0)
                buf.append((char) param_id[i]);
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
        return "MAVLINK_MSG_ID_PARAM_ACK_TRANSACTION - sysid:"+sysid+" compid:"+compid+" param_value:"+param_value+" target_system:"+target_system+" target_component:"+target_component+" param_id:"+param_id+" param_type:"+param_type+" param_result:"+param_result+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_PARAM_ACK_TRANSACTION";
    }
}
        