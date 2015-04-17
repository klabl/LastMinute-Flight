package at.afv.createlib;/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class Create {
  public static int create_connect() {
    return createJNI.create_connect();
  }

  public static void create_disconnect() {
    createJNI.create_disconnect();
  }

  public static void set_create_mode(char mode) {
    createJNI.set_create_mode(mode);
  }

  public static void create_drive_direct(long left_speed, long right_speed) {
    createJNI.create_drive_direct(left_speed, right_speed);
  }

  public static void create_drive(long speed, long radius) {
    createJNI.create_drive(speed, radius);
  }

  public static void create_turn(long speed, long angle) {
    createJNI.create_turn(speed, angle);
  }

  public static void create_wait_angle(long angle) {
    createJNI.create_wait_angle(angle);
  }

  public static SWIGTYPE_p_uint8_t get_create_left_bump() {
    return new SWIGTYPE_p_uint8_t(createJNI.get_create_left_bump(), true);
  }

  public static SWIGTYPE_p_uint8_t get_create_right_bump() {
    return new SWIGTYPE_p_uint8_t(createJNI.get_create_right_bump(), true);
  }

  public static SWIGTYPE_p_uint8_t get_create_left_wheel_drop() {
    return new SWIGTYPE_p_uint8_t(createJNI.get_create_left_wheel_drop(), true);
  }

  public static SWIGTYPE_p_uint8_t get_create_right_wheel_drop() {
    return new SWIGTYPE_p_uint8_t(createJNI.get_create_right_wheel_drop(), true);
  }

  public static SWIGTYPE_p_uint8_t get_create_caster_wheel_drop() {
    return new SWIGTYPE_p_uint8_t(createJNI.get_create_caster_wheel_drop(), true);
  }

  public static SWIGTYPE_p_uint8_t get_create_wall() {
    return new SWIGTYPE_p_uint8_t(createJNI.get_create_wall(), true);
  }

  public static SWIGTYPE_p_uint8_t get_create_left_cliff() {
    return new SWIGTYPE_p_uint8_t(createJNI.get_create_left_cliff(), true);
  }

  public static SWIGTYPE_p_uint8_t get_create_right_cliff() {
    return new SWIGTYPE_p_uint8_t(createJNI.get_create_right_cliff(), true);
  }

  public static SWIGTYPE_p_uint8_t get_create_left_front_cliff() {
    return new SWIGTYPE_p_uint8_t(createJNI.get_create_left_front_cliff(), true);
  }

  public static SWIGTYPE_p_uint8_t get_create_right_front_cliff() {
    return new SWIGTYPE_p_uint8_t(createJNI.get_create_right_front_cliff(), true);
  }

  public static SWIGTYPE_p_uint16_t get_create_left_cliff_analog() {
    return new SWIGTYPE_p_uint16_t(createJNI.get_create_left_cliff_analog(), true);
  }

  public static SWIGTYPE_p_uint16_t get_create_right_cliff_analog() {
    return new SWIGTYPE_p_uint16_t(createJNI.get_create_right_cliff_analog(), true);
  }

  public static SWIGTYPE_p_uint16_t get_create_left_front_cliff_analog() {
    return new SWIGTYPE_p_uint16_t(createJNI.get_create_left_front_cliff_analog(), true);
  }

  public static SWIGTYPE_p_uint16_t get_create_right_front_cliff_analog() {
    return new SWIGTYPE_p_uint16_t(createJNI.get_create_right_front_cliff_analog(), true);
  }

  public static SWIGTYPE_p_int16_t get_create_angle() {
    return new SWIGTYPE_p_int16_t(createJNI.get_create_angle(), true);
  }

}
