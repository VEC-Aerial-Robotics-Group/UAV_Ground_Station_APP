/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE RPM PACKING
package io.mavlink.ardupilotmega;
import io.mavlink.MAVLinkPacket;
import io.mavlink.Messages.MAVLinkMessage;
import io.mavlink.Messages.MAVLinkPayload;
        
/**
 * RPM sensor output.
 */
public class msg_rpm extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_RPM = 226;
    public static final int MAVLINK_MSG_LENGTH = 8;
    private static final long serialVersionUID = MAVLINK_MSG_ID_RPM;

      
    /**
     * RPM Sensor1.
     */
    public float rpm1;
      
    /**
     * RPM Sensor2.
     */
    public float rpm2;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_RPM;
        
        packet.payload.putFloat(rpm1);
        packet.payload.putFloat(rpm2);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a rpm message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.rpm1 = payload.getFloat();
        this.rpm2 = payload.getFloat();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_rpm() {
        this.msgid = MAVLINK_MSG_ID_RPM;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_rpm( float rpm1, float rpm2) {
        this.msgid = MAVLINK_MSG_ID_RPM;

        this.rpm1 = rpm1;
        this.rpm2 = rpm2;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_rpm( float rpm1, float rpm2, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_RPM;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.rpm1 = rpm1;
        this.rpm2 = rpm2;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_rpm(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_RPM;
        
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
        return "MAVLINK_MSG_ID_RPM - sysid:"+sysid+" compid:"+compid+" rpm1:"+rpm1+" rpm2:"+rpm2+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_RPM";
    }
}
        