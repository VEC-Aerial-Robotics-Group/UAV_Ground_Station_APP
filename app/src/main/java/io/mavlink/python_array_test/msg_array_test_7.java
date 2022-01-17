/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE ARRAY_TEST_7 PACKING
package io.mavlink.python_array_test;
import io.mavlink.MAVLinkPacket;
import io.mavlink.Messages.MAVLinkMessage;
import io.mavlink.Messages.MAVLinkPayload;
        
/**
 * Array test #7.
 */
public class msg_array_test_7 extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_ARRAY_TEST_7 = 17157;
    public static final int MAVLINK_MSG_LENGTH = 84;
    private static final long serialVersionUID = MAVLINK_MSG_ID_ARRAY_TEST_7;

      
    /**
     * Value array
     */
    public double ar_d[] = new double[2];
      
    /**
     * Value array
     */
    public float ar_f[] = new float[2];
      
    /**
     * Value array
     */
    public long ar_u32[] = new long[2];
      
    /**
     * Value array
     */
    public int ar_i32[] = new int[2];
      
    /**
     * Value array
     */
    public int ar_u16[] = new int[2];
      
    /**
     * Value array
     */
    public short ar_i16[] = new short[2];
      
    /**
     * Value array
     */
    public short ar_u8[] = new short[2];
      
    /**
     * Value array
     */
    public byte ar_i8[] = new byte[2];
      
    /**
     * Value array
     */
    public byte ar_c[] = new byte[32];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_ARRAY_TEST_7;
        
        
        for (int i = 0; i < ar_d.length; i++) {
            packet.payload.putDouble(ar_d[i]);
        }
                    
        
        for (int i = 0; i < ar_f.length; i++) {
            packet.payload.putFloat(ar_f[i]);
        }
                    
        
        for (int i = 0; i < ar_u32.length; i++) {
            packet.payload.putUnsignedInt(ar_u32[i]);
        }
                    
        
        for (int i = 0; i < ar_i32.length; i++) {
            packet.payload.putInt(ar_i32[i]);
        }
                    
        
        for (int i = 0; i < ar_u16.length; i++) {
            packet.payload.putUnsignedShort(ar_u16[i]);
        }
                    
        
        for (int i = 0; i < ar_i16.length; i++) {
            packet.payload.putShort(ar_i16[i]);
        }
                    
        
        for (int i = 0; i < ar_u8.length; i++) {
            packet.payload.putUnsignedByte(ar_u8[i]);
        }
                    
        
        for (int i = 0; i < ar_i8.length; i++) {
            packet.payload.putByte(ar_i8[i]);
        }
                    
        
        for (int i = 0; i < ar_c.length; i++) {
            packet.payload.putByte(ar_c[i]);
        }
                    
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a array_test_7 message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
         
        for (int i = 0; i < this.ar_d.length; i++) {
            this.ar_d[i] = payload.getDouble();
        }
                
         
        for (int i = 0; i < this.ar_f.length; i++) {
            this.ar_f[i] = payload.getFloat();
        }
                
         
        for (int i = 0; i < this.ar_u32.length; i++) {
            this.ar_u32[i] = payload.getUnsignedInt();
        }
                
         
        for (int i = 0; i < this.ar_i32.length; i++) {
            this.ar_i32[i] = payload.getInt();
        }
                
         
        for (int i = 0; i < this.ar_u16.length; i++) {
            this.ar_u16[i] = payload.getUnsignedShort();
        }
                
         
        for (int i = 0; i < this.ar_i16.length; i++) {
            this.ar_i16[i] = payload.getShort();
        }
                
         
        for (int i = 0; i < this.ar_u8.length; i++) {
            this.ar_u8[i] = payload.getUnsignedByte();
        }
                
         
        for (int i = 0; i < this.ar_i8.length; i++) {
            this.ar_i8[i] = payload.getByte();
        }
                
         
        for (int i = 0; i < this.ar_c.length; i++) {
            this.ar_c[i] = payload.getByte();
        }
                
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_array_test_7() {
        this.msgid = MAVLINK_MSG_ID_ARRAY_TEST_7;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_array_test_7( double[] ar_d, float[] ar_f, long[] ar_u32, int[] ar_i32, int[] ar_u16, short[] ar_i16, short[] ar_u8, byte[] ar_i8, byte[] ar_c) {
        this.msgid = MAVLINK_MSG_ID_ARRAY_TEST_7;

        this.ar_d = ar_d;
        this.ar_f = ar_f;
        this.ar_u32 = ar_u32;
        this.ar_i32 = ar_i32;
        this.ar_u16 = ar_u16;
        this.ar_i16 = ar_i16;
        this.ar_u8 = ar_u8;
        this.ar_i8 = ar_i8;
        this.ar_c = ar_c;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_array_test_7( double[] ar_d, float[] ar_f, long[] ar_u32, int[] ar_i32, int[] ar_u16, short[] ar_i16, short[] ar_u8, byte[] ar_i8, byte[] ar_c, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_ARRAY_TEST_7;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.ar_d = ar_d;
        this.ar_f = ar_f;
        this.ar_u32 = ar_u32;
        this.ar_i32 = ar_i32;
        this.ar_u16 = ar_u16;
        this.ar_i16 = ar_i16;
        this.ar_u8 = ar_u8;
        this.ar_i8 = ar_i8;
        this.ar_c = ar_c;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_array_test_7(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_ARRAY_TEST_7;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

                     
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setAr_C(String str) {
        int len = Math.min(str.length(), 32);
        for (int i=0; i<len; i++) {
            ar_c[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<32; i++) {            // padding for the rest of the buffer
            ar_c[i] = 0;
        }
    }

    /**
    * Gets the message, formatted as a string
    */
    public String getAr_C() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 32; i++) {
            if (ar_c[i] != 0)
                buf.append((char) ar_c[i]);
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
        return "MAVLINK_MSG_ID_ARRAY_TEST_7 - sysid:"+sysid+" compid:"+compid+" ar_d:"+ar_d+" ar_f:"+ar_f+" ar_u32:"+ar_u32+" ar_i32:"+ar_i32+" ar_u16:"+ar_u16+" ar_i16:"+ar_i16+" ar_u8:"+ar_u8+" ar_i8:"+ar_i8+" ar_c:"+ar_c+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_ARRAY_TEST_7";
    }
}
        