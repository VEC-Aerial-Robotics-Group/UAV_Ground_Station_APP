/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE RC_CHANNELS_RAW PACKING
package io.mavlink.common;
import io.mavlink.MAVLinkPacket;
import io.mavlink.Messages.MAVLinkMessage;
import io.mavlink.Messages.MAVLinkPayload;
        
/**
 * The RAW values of the RC channels received. The standard PPM modulation is as follows: 1000 microseconds: 0%, 2000 microseconds: 100%. A value of UINT16_MAX implies the channel is unused. Individual receivers/transmitters might violate this specification.
 */
public class msg_rc_channels_raw extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_RC_CHANNELS_RAW = 35;
    public static final int MAVLINK_MSG_LENGTH = 22;
    private static final long serialVersionUID = MAVLINK_MSG_ID_RC_CHANNELS_RAW;

      
    /**
     * Timestamp (time since system boot).
     */
    public long time_boot_ms;
      
    /**
     * RC channel 1 value.
     */
    public int chan1_raw;
      
    /**
     * RC channel 2 value.
     */
    public int chan2_raw;
      
    /**
     * RC channel 3 value.
     */
    public int chan3_raw;
      
    /**
     * RC channel 4 value.
     */
    public int chan4_raw;
      
    /**
     * RC channel 5 value.
     */
    public int chan5_raw;
      
    /**
     * RC channel 6 value.
     */
    public int chan6_raw;
      
    /**
     * RC channel 7 value.
     */
    public int chan7_raw;
      
    /**
     * RC channel 8 value.
     */
    public int chan8_raw;
      
    /**
     * Servo output port (set of 8 outputs = 1 port). Flight stacks running on Pixhawk should use: 0 = MAIN, 1 = AUX.
     */
    public short port;
      
    /**
     * Receive signal strength indicator in device-dependent units/scale. Values: [0-254], UINT8_MAX: invalid/unknown.
     */
    public short rssi;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_RC_CHANNELS_RAW;
        
        packet.payload.putUnsignedInt(time_boot_ms);
        packet.payload.putUnsignedShort(chan1_raw);
        packet.payload.putUnsignedShort(chan2_raw);
        packet.payload.putUnsignedShort(chan3_raw);
        packet.payload.putUnsignedShort(chan4_raw);
        packet.payload.putUnsignedShort(chan5_raw);
        packet.payload.putUnsignedShort(chan6_raw);
        packet.payload.putUnsignedShort(chan7_raw);
        packet.payload.putUnsignedShort(chan8_raw);
        packet.payload.putUnsignedByte(port);
        packet.payload.putUnsignedByte(rssi);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a rc_channels_raw message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_boot_ms = payload.getUnsignedInt();
        this.chan1_raw = payload.getUnsignedShort();
        this.chan2_raw = payload.getUnsignedShort();
        this.chan3_raw = payload.getUnsignedShort();
        this.chan4_raw = payload.getUnsignedShort();
        this.chan5_raw = payload.getUnsignedShort();
        this.chan6_raw = payload.getUnsignedShort();
        this.chan7_raw = payload.getUnsignedShort();
        this.chan8_raw = payload.getUnsignedShort();
        this.port = payload.getUnsignedByte();
        this.rssi = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_rc_channels_raw() {
        this.msgid = MAVLINK_MSG_ID_RC_CHANNELS_RAW;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_rc_channels_raw( long time_boot_ms, int chan1_raw, int chan2_raw, int chan3_raw, int chan4_raw, int chan5_raw, int chan6_raw, int chan7_raw, int chan8_raw, short port, short rssi) {
        this.msgid = MAVLINK_MSG_ID_RC_CHANNELS_RAW;

        this.time_boot_ms = time_boot_ms;
        this.chan1_raw = chan1_raw;
        this.chan2_raw = chan2_raw;
        this.chan3_raw = chan3_raw;
        this.chan4_raw = chan4_raw;
        this.chan5_raw = chan5_raw;
        this.chan6_raw = chan6_raw;
        this.chan7_raw = chan7_raw;
        this.chan8_raw = chan8_raw;
        this.port = port;
        this.rssi = rssi;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_rc_channels_raw( long time_boot_ms, int chan1_raw, int chan2_raw, int chan3_raw, int chan4_raw, int chan5_raw, int chan6_raw, int chan7_raw, int chan8_raw, short port, short rssi, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_RC_CHANNELS_RAW;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_boot_ms = time_boot_ms;
        this.chan1_raw = chan1_raw;
        this.chan2_raw = chan2_raw;
        this.chan3_raw = chan3_raw;
        this.chan4_raw = chan4_raw;
        this.chan5_raw = chan5_raw;
        this.chan6_raw = chan6_raw;
        this.chan7_raw = chan7_raw;
        this.chan8_raw = chan8_raw;
        this.port = port;
        this.rssi = rssi;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_rc_channels_raw(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_RC_CHANNELS_RAW;
        
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
        return "MAVLINK_MSG_ID_RC_CHANNELS_RAW - sysid:"+sysid+" compid:"+compid+" time_boot_ms:"+time_boot_ms+" chan1_raw:"+chan1_raw+" chan2_raw:"+chan2_raw+" chan3_raw:"+chan3_raw+" chan4_raw:"+chan4_raw+" chan5_raw:"+chan5_raw+" chan6_raw:"+chan6_raw+" chan7_raw:"+chan7_raw+" chan8_raw:"+chan8_raw+" port:"+port+" rssi:"+rssi+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_RC_CHANNELS_RAW";
    }
}
        