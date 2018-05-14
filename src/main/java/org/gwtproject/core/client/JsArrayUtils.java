package org.gwtproject.core.client;

import jsinterop.base.Js;

/**
 * Utility class for manipulating JS arrays.  These methods are not on other
 * JavaScriptObject subclasses, such as JsArray, because adding new methods might
 * break existing subtypes.
 */
public class JsArrayUtils {

    /**
     * Take a Java array, and produce a JS array that is only used for reading.  As
     * this is actually a reference to the original array in prod mode, the source
     * must not be modified while this copy is in use or you will get different
     * behavior between DevMode and prod mode.
     *
     * @param array source array
     * @return JS array, which may be a copy or an alias of the input array
     */
    public static JsArrayInteger readOnlyJsArray(byte[] array) {
        return Js.uncheckedCast(array);
    }

    /**
     * Take a Java array, and produce a JS array that is only used for reading.  As
     * this is actually a reference to the original array in prod mode, the source
     * must not be modified while this copy is in use or you will get different
     * behavior between DevMode and prod mode.
     *
     * @param array source array
     * @return JS array, which may be a copy or an alias of the input array
     */
    public static JsArrayNumber readOnlyJsArray(double[] array) {
        return Js.uncheckedCast(array);
    }

    /**
     * Take a Java array, and produce a JS array that is only used for reading.  As
     * this is actually a reference to the original array in prod mode, the source
     * must not be modified while this copy is in use or you will get different
     * behavior between DevMode and prod mode.
     *
     * @param array source array
     * @return JS array, which may be a copy or an alias of the input array
     */
    public static JsArrayNumber readOnlyJsArray(float[] array) {
        return Js.uncheckedCast(array);
    }

    /**
     * Take a Java array, and produce a JS array that is only used for reading.  As
     * this is actually a reference to the original array in prod mode, the source
     * must not be modified while this copy is in use or you will get different
     * behavior between DevMode and prod mode.
     *
     * @param array source array
     * @return JS array, which may be a copy or an alias of the input array
     */
    public static JsArrayInteger readOnlyJsArray(int[] array) {
        return Js.uncheckedCast(array);
    }

    /**
     * Take a Java array, and produce a JS array that is only used for reading.  As
     * this is actually a reference to the original array in prod mode, the source
     * must not be modified while this copy is in use or you will get different
     * behavior between DevMode and prod mode.
     * <p>
     * <b>NOTE: long values are not supported in JS, so long emulation is slow
     * and this method assumes that all the values can be safely stored in a
     * double.</b>
     *
     * @param array source array - its values are assumed to be in the valid range
     *     for doubles -- if the values exceed 2^53, low-order bits will be lost
     * @return JS array, which may be a copy or an alias of the input array
     */
    public static JsArrayNumber readOnlyJsArray(long[] array) {
        return Js.uncheckedCast(array);
    }

    /**
     * Take a Java array, and produce a JS array that is only used for reading.  As
     * this is actually a reference to the original array in prod mode, the source
     * must not be modified while this copy is in use or you will get different
     * behavior between DevMode and prod mode.
     *
     * @param array source array
     * @return JS array, which may be a copy or an alias of the input array
     */
    public static JsArrayInteger readOnlyJsArray(short[] array) {
        return Js.uncheckedCast(array);
    }

    /**
     * Take a Java array, and produce a JS array that is only used for reading.  As
     * this is actually a reference to the original array in prod mode, the source
     * must not be modified while this copy is in use or you will get different
     * behavior between DevMode and prod mode.
     *
     * @param array source array
     * @return JS array, which may be a copy or an alias of the input array
     */
    public static <T extends JavaScriptObject> JsArray<T> readOnlyJsArray(T[] array) {
        return Js.uncheckedCast(array);
    }

    private JsArrayUtils() {
    }

}
