/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE TRAJECTORY_REPRESENTATION_BEZIER PACKING
package io.mavlink.common;
import io.mavlink.MAVLinkPacket;
import io.mavlink.Messages.MAVLinkMessage;
import io.mavlink.Messages.MAVLinkPayload;
        
/**
 * Describe a trajectory using an array of up-to 5 bezier control points in the local frame (MAV_FRAME_LOCAL_NED).
 */
public class msg_trajectory_representation_bezier extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_TRAJECTORY_REPRESENTATION_BEZIER = 333;
    public static final int MAVLINK_MSG_LENGTH = 109;
    private static final long serialVersionUID = MAVLINK_MSG_ID_TRAJECTORY_REPRESENTATION_BEZIER;

      
    /**
     * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude of the number.
     */
    public long time_usec;
      
    /**
     * X-coordinate of bezier control points. Set to NaN if not being used
     */
    public float pos_x[] = new float[5];
      
    /**
     * Y-coordinate of bezier control points. Set to NaN if not being used
     */
    public float pos_y[] = new float[5];
      
    /**
     * Z-coordinate of bezier control points. Set to NaN if not being used
     */
    public float pos_z[] = new float[5];
      
    /**
     * Bezier time horizon. Set to NaN if velocity/acceleration should not be incorporated
     */
    public float delta[] = new float[5];
      
    /**
     * Yaw. Set to NaN for unchanged
     */
    public float pos_yaw[] = new float[5];
      
    /**
     * Number of valid control points (up-to 5 points are possible)
     */
    public short valid_points;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_TRAJECTORY_REPRESENTATION_BEZIER;
        
        packet.payload.putUnsignedLong(time_usec);
        
        for (int i = 0; i < pos_x.length; i++) {
            packet.payload.putFloat(pos_x[i]);
        }
                    
        
        for (int i = 0; i < pos_y.length; i++) {
            packet.payload.putFloat(pos_y[i]);
        }
                    
        
        for (int i = 0; i < pos_z.length; i++) {
            packet.payload.putFloat(pos_z[i]);
        }
                    
        
        for (int i = 0; i < delta.length; i++) {
            packet.payload.putFloat(delta[i]);
        }
                    
        
        for (int i = 0; i < pos_yaw.length; i++) {
            packet.payload.putFloat(pos_yaw[i]);
        }
                    
        packet.payload.putUnsignedByte(valid_points);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a trajectory_representation_bezier message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_usec = payload.getUnsignedLong();
         
        for (int i = 0; i < this.pos_x.length; i++) {
            this.pos_x[i] = payload.getFloat();
        }
                
         
        for (int i = 0; i < this.pos_y.length; i++) {
            this.pos_y[i] = payload.getFloat();
        }
                
         
        for (int i = 0; i < this.pos_z.length; i++) {
            this.pos_z[i] = payload.getFloat();
        }
                
         
        for (int i = 0; i < this.delta.length; i++) {
            this.delta[i] = payload.getFloat();
        }
                
         
        for (int i = 0; i < this.pos_yaw.length; i++) {
            this.pos_yaw[i] = payload.getFloat();
        }
                
        this.valid_points = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_trajectory_representation_bezier() {
        this.msgid = MAVLINK_MSG_ID_TRAJECTORY_REPRESENTATION_BEZIER;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_trajectory_representation_bezier( long time_usec, float[] pos_x, float[] pos_y, float[] pos_z, float[] delta, float[] pos_yaw, short valid_points) {
        this.msgid = MAVLINK_MSG_ID_TRAJECTORY_REPRESENTATION_BEZIER;

        this.time_usec = time_usec;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.pos_z = pos_z;
        this.delta = delta;
        this.pos_yaw = pos_yaw;
        this.valid_points = valid_points;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_trajectory_representation_bezier( long time_usec, float[] pos_x, float[] pos_y, float[] pos_z, float[] delta, float[] pos_yaw, short valid_points, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_TRAJECTORY_REPRESENTATION_BEZIER;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_usec = time_usec;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.pos_z = pos_z;
        this.delta = delta;
        this.pos_yaw = pos_yaw;
        this.valid_points = valid_points;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_trajectory_representation_bezier(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_TRAJECTORY_REPRESENTATION_BEZIER;
        
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
        return "MAVLINK_MSG_ID_TRAJECTORY_REPRESENTATION_BEZIER - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" pos_x:"+pos_x+" pos_y:"+pos_y+" pos_z:"+pos_z+" delta:"+delta+" pos_yaw:"+pos_yaw+" valid_points:"+valid_points+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_TRAJECTORY_REPRESENTATION_BEZIER";
    }
}
        