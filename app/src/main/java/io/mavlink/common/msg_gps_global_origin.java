/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE GPS_GLOBAL_ORIGIN PACKING
package io.mavlink.common;
import io.mavlink.MAVLinkPacket;
import io.mavlink.Messages.MAVLinkMessage;
import io.mavlink.Messages.MAVLinkPayload;
        
/**
 * Publishes the GPS co-ordinates of the vehicle local origin (0,0,0) position. Emitted whenever a new GPS-Local position mapping is requested or set - e.g. following SET_GPS_GLOBAL_ORIGIN message.
 */
public class msg_gps_global_origin extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_GPS_GLOBAL_ORIGIN = 49;
    public static final int MAVLINK_MSG_LENGTH = 20;
    private static final long serialVersionUID = MAVLINK_MSG_ID_GPS_GLOBAL_ORIGIN;

      
    /**
     * Latitude (WGS84)
     */
    public int latitude;
      
    /**
     * Longitude (WGS84)
     */
    public int longitude;
      
    /**
     * Altitude (MSL). Positive for up.
     */
    public int altitude;
      
    /**
     * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude of the number.
     */
    public long time_usec;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_GPS_GLOBAL_ORIGIN;
        
        packet.payload.putInt(latitude);
        packet.payload.putInt(longitude);
        packet.payload.putInt(altitude);
        
        if (isMavlink2) {
             packet.payload.putUnsignedLong(time_usec);
            
        }
        return packet;
    }

    /**
     * Decode a gps_global_origin message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.latitude = payload.getInt();
        this.longitude = payload.getInt();
        this.altitude = payload.getInt();
        
        if (isMavlink2) {
             this.time_usec = payload.getUnsignedLong();
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_gps_global_origin() {
        this.msgid = MAVLINK_MSG_ID_GPS_GLOBAL_ORIGIN;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_gps_global_origin( int latitude, int longitude, int altitude, long time_usec) {
        this.msgid = MAVLINK_MSG_ID_GPS_GLOBAL_ORIGIN;

        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.time_usec = time_usec;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_gps_global_origin( int latitude, int longitude, int altitude, long time_usec, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_GPS_GLOBAL_ORIGIN;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.time_usec = time_usec;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_gps_global_origin(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_GPS_GLOBAL_ORIGIN;
        
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
        return "MAVLINK_MSG_ID_GPS_GLOBAL_ORIGIN - sysid:"+sysid+" compid:"+compid+" latitude:"+latitude+" longitude:"+longitude+" altitude:"+altitude+" time_usec:"+time_usec+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_GPS_GLOBAL_ORIGIN";
    }
}
        