/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package io.mavlink.enums;

/** 
 * Actions that may be specified in MAV_CMD_OVERRIDE_GOTO to override mission execution.
 */
public class MAV_GOTO {
   public static final int MAV_GOTO_DO_HOLD = 0; /* Hold at the current position. | */
   public static final int MAV_GOTO_DO_CONTINUE = 1; /* Continue with the next item in mission execution. | */
   public static final int MAV_GOTO_HOLD_AT_CURRENT_POSITION = 2; /* Hold at the current position of the system | */
   public static final int MAV_GOTO_HOLD_AT_SPECIFIED_POSITION = 3; /* Hold at the position specified in the parameters of the DO_HOLD action | */
   public static final int MAV_GOTO_ENUM_END = 4; /*  | */
}
            