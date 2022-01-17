/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE UALBERTA_SYS_STATUS PACKING
package io.mavlink.ualberta;
import io.mavlink.MAVLinkPacket;
import io.mavlink.Messages.MAVLinkMessage;
import io.mavlink.Messages.MAVLinkPayload;
        
/**
 * System status specific to ualberta uav
 */
public class msg_ualberta_sys_status extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_UALBERTA_SYS_STATUS = 222;
    public static final int MAVLINK_MSG_LENGTH = 3;
    private static final long serialVersionUID = MAVLINK_MSG_ID_UALBERTA_SYS_STATUS;

      
    /**
     * System mode, see UALBERTA_AUTOPILOT_MODE ENUM
     */
    public short mode;
      
    /**
     * Navigation mode, see UALBERTA_NAV_MODE ENUM
     */
    public short nav_mode;
      
    /**
     * Pilot mode, see UALBERTA_PILOT_MODE
     */
    public short pilot;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_UALBERTA_SYS_STATUS;
        
        packet.payload.putUnsignedByte(mode);
        packet.payload.putUnsignedByte(nav_mode);
        packet.payload.putUnsignedByte(pilot);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a ualberta_sys_status message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.mode = payload.getUnsignedByte();
        this.nav_mode = payload.getUnsignedByte();
        this.pilot = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_ualberta_sys_status() {
        this.msgid = MAVLINK_MSG_ID_UALBERTA_SYS_STATUS;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_ualberta_sys_status( short mode, short nav_mode, short pilot) {
        this.msgid = MAVLINK_MSG_ID_UALBERTA_SYS_STATUS;

        this.mode = mode;
        this.nav_mode = nav_mode;
        this.pilot = pilot;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_ualberta_sys_status( short mode, short nav_mode, short pilot, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_UALBERTA_SYS_STATUS;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.mode = mode;
        this.nav_mode = nav_mode;
        this.pilot = pilot;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_ualberta_sys_status(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_UALBERTA_SYS_STATUS;
        
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
        return "MAVLINK_MSG_ID_UALBERTA_SYS_STATUS - sysid:"+sysid+" compid:"+compid+" mode:"+mode+" nav_mode:"+nav_mode+" pilot:"+pilot+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_UALBERTA_SYS_STATUS";
    }
}
        