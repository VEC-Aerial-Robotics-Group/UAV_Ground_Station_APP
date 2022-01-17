/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE DEVICE_OP_READ PACKING
package io.mavlink.ardupilotmega;
import io.mavlink.MAVLinkPacket;
import io.mavlink.Messages.MAVLinkMessage;
import io.mavlink.Messages.MAVLinkPayload;
        
/**
 * Read registers for a device.
 */
public class msg_device_op_read extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_DEVICE_OP_READ = 11000;
    public static final int MAVLINK_MSG_LENGTH = 52;
    private static final long serialVersionUID = MAVLINK_MSG_ID_DEVICE_OP_READ;

      
    /**
     * Request ID - copied to reply.
     */
    public long request_id;
      
    /**
     * System ID.
     */
    public short target_system;
      
    /**
     * Component ID.
     */
    public short target_component;
      
    /**
     * The bus type.
     */
    public short bustype;
      
    /**
     * Bus number.
     */
    public short bus;
      
    /**
     * Bus address.
     */
    public short address;
      
    /**
     * Name of device on bus (for SPI).
     */
    public byte busname[] = new byte[40];
      
    /**
     * First register to read.
     */
    public short regstart;
      
    /**
     * Count of registers to read.
     */
    public short count;
      
    /**
     * Bank number.
     */
    public short bank;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_DEVICE_OP_READ;
        
        packet.payload.putUnsignedInt(request_id);
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        packet.payload.putUnsignedByte(bustype);
        packet.payload.putUnsignedByte(bus);
        packet.payload.putUnsignedByte(address);
        
        for (int i = 0; i < busname.length; i++) {
            packet.payload.putByte(busname[i]);
        }
                    
        packet.payload.putUnsignedByte(regstart);
        packet.payload.putUnsignedByte(count);
        
        if (isMavlink2) {
             packet.payload.putUnsignedByte(bank);
            
        }
        return packet;
    }

    /**
     * Decode a device_op_read message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.request_id = payload.getUnsignedInt();
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        this.bustype = payload.getUnsignedByte();
        this.bus = payload.getUnsignedByte();
        this.address = payload.getUnsignedByte();
         
        for (int i = 0; i < this.busname.length; i++) {
            this.busname[i] = payload.getByte();
        }
                
        this.regstart = payload.getUnsignedByte();
        this.count = payload.getUnsignedByte();
        
        if (isMavlink2) {
             this.bank = payload.getUnsignedByte();
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_device_op_read() {
        this.msgid = MAVLINK_MSG_ID_DEVICE_OP_READ;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_device_op_read( long request_id, short target_system, short target_component, short bustype, short bus, short address, byte[] busname, short regstart, short count, short bank) {
        this.msgid = MAVLINK_MSG_ID_DEVICE_OP_READ;

        this.request_id = request_id;
        this.target_system = target_system;
        this.target_component = target_component;
        this.bustype = bustype;
        this.bus = bus;
        this.address = address;
        this.busname = busname;
        this.regstart = regstart;
        this.count = count;
        this.bank = bank;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_device_op_read( long request_id, short target_system, short target_component, short bustype, short bus, short address, byte[] busname, short regstart, short count, short bank, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_DEVICE_OP_READ;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.request_id = request_id;
        this.target_system = target_system;
        this.target_component = target_component;
        this.bustype = bustype;
        this.bus = bus;
        this.address = address;
        this.busname = busname;
        this.regstart = regstart;
        this.count = count;
        this.bank = bank;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_device_op_read(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_DEVICE_OP_READ;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

                 
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setBusname(String str) {
        int len = Math.min(str.length(), 40);
        for (int i=0; i<len; i++) {
            busname[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<40; i++) {            // padding for the rest of the buffer
            busname[i] = 0;
        }
    }

    /**
    * Gets the message, formatted as a string
    */
    public String getBusname() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 40; i++) {
            if (busname[i] != 0)
                buf.append((char) busname[i]);
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
        return "MAVLINK_MSG_ID_DEVICE_OP_READ - sysid:"+sysid+" compid:"+compid+" request_id:"+request_id+" target_system:"+target_system+" target_component:"+target_component+" bustype:"+bustype+" bus:"+bus+" address:"+address+" busname:"+busname+" regstart:"+regstart+" count:"+count+" bank:"+bank+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_DEVICE_OP_READ";
    }
}
        