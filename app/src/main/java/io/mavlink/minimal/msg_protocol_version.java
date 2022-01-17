/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE PROTOCOL_VERSION PACKING
package io.mavlink.minimal;
import io.mavlink.MAVLinkPacket;
import io.mavlink.Messages.MAVLinkMessage;
import io.mavlink.Messages.MAVLinkPayload;
        
/**
 * Version and capability of protocol version. This message can be requested with MAV_CMD_REQUEST_MESSAGE and is used as part of the handshaking to establish which MAVLink version should be used on the network. Every node should respond to a request for PROTOCOL_VERSION to enable the handshaking. Library implementers should consider adding this into the default decoding state machine to allow the protocol core to respond directly.
 */
public class msg_protocol_version extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_PROTOCOL_VERSION = 300;
    public static final int MAVLINK_MSG_LENGTH = 22;
    private static final long serialVersionUID = MAVLINK_MSG_ID_PROTOCOL_VERSION;

      
    /**
     * Currently active MAVLink version number * 100: v1.0 is 100, v2.0 is 200, etc.
     */
    public int version;
      
    /**
     * Minimum MAVLink version supported
     */
    public int min_version;
      
    /**
     * Maximum MAVLink version supported (set to the same value as version by default)
     */
    public int max_version;
      
    /**
     * The first 8 bytes (not characters printed in hex!) of the git hash.
     */
    public short spec_version_hash[] = new short[8];
      
    /**
     * The first 8 bytes (not characters printed in hex!) of the git hash.
     */
    public short library_version_hash[] = new short[8];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_PROTOCOL_VERSION;
        
        packet.payload.putUnsignedShort(version);
        packet.payload.putUnsignedShort(min_version);
        packet.payload.putUnsignedShort(max_version);
        
        for (int i = 0; i < spec_version_hash.length; i++) {
            packet.payload.putUnsignedByte(spec_version_hash[i]);
        }
                    
        
        for (int i = 0; i < library_version_hash.length; i++) {
            packet.payload.putUnsignedByte(library_version_hash[i]);
        }
                    
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a protocol_version message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.version = payload.getUnsignedShort();
        this.min_version = payload.getUnsignedShort();
        this.max_version = payload.getUnsignedShort();
         
        for (int i = 0; i < this.spec_version_hash.length; i++) {
            this.spec_version_hash[i] = payload.getUnsignedByte();
        }
                
         
        for (int i = 0; i < this.library_version_hash.length; i++) {
            this.library_version_hash[i] = payload.getUnsignedByte();
        }
                
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_protocol_version() {
        this.msgid = MAVLINK_MSG_ID_PROTOCOL_VERSION;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_protocol_version( int version, int min_version, int max_version, short[] spec_version_hash, short[] library_version_hash) {
        this.msgid = MAVLINK_MSG_ID_PROTOCOL_VERSION;

        this.version = version;
        this.min_version = min_version;
        this.max_version = max_version;
        this.spec_version_hash = spec_version_hash;
        this.library_version_hash = library_version_hash;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_protocol_version( int version, int min_version, int max_version, short[] spec_version_hash, short[] library_version_hash, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_PROTOCOL_VERSION;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.version = version;
        this.min_version = min_version;
        this.max_version = max_version;
        this.spec_version_hash = spec_version_hash;
        this.library_version_hash = library_version_hash;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_protocol_version(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_PROTOCOL_VERSION;
        
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
        return "MAVLINK_MSG_ID_PROTOCOL_VERSION - sysid:"+sysid+" compid:"+compid+" version:"+version+" min_version:"+min_version+" max_version:"+max_version+" spec_version_hash:"+spec_version_hash+" library_version_hash:"+library_version_hash+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_PROTOCOL_VERSION";
    }
}
        