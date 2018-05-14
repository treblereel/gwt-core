package org.gwtproject.core.client;

import elemental2.core.JsArray;
import elemental2.core.JsString;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * A simple wrapper around a homogeneous native array of string values.
 *
 * This class may not be directly instantiated, and can only be returned from a
 * native method. For example,
 *
 * <code>
 * native JsArrayString getNativeArray() /*-{
 *   return ['foo', 'bar', 'baz'];
 * }-* /;
 * </code>
 */
@JsType(isNative = true, name = "Array", namespace = JsPackage.GLOBAL)
public class JsArrayString extends JavaScriptObject {

    protected JsArrayString() {
    }

    /**
     * Gets the value at a given index.
     *
     * @param index the index to be retrieved
     * @return the value at the given index, or <code>null</code> if none exists
     */
    public final String get(int index) {
      return this.<JsArray<JsString>>cast().getAt(index).toString();
    }

    /**
     * Convert each element of the array to a String and join them with a comma
     * separator. The value returned from this method may vary between browsers
     * based on how JavaScript values are converted into strings.
     */
    public final String join() {
        return this.<JsArray<JsString>>cast().join();
    }

    /**
     * Convert each element of the array to a String and join them with a comma
     * separator. The value returned from this method may vary between browsers
     * based on how JavaScript values are converted into strings.
     */
    public final String join(String separator) {
      return this.<JsArray<JsString>>cast().join(separator);
    }

    /**
     * Gets the length of the array.
     *
     * @return the array length
     */
    public final int length() {
      return this.<JsArray<JsString>>cast().length;
    }

    /**
     * Pushes the given value onto the end of the array.
     */
    public final void push(String value) {
        this.<JsArray<JsString>>cast().push(Js.uncheckedCast(value));
    }

    /**
     * Sets the value value at a given index.
     *
     * If the index is out of bounds, the value will still be set. The array's
     * length will be updated to encompass the bounds implied by the added value.
     *
     * @param index the index to be set
     * @param value the value to be stored
     */
    public final void set(int index, String value) {
        this.<JsArray<JsString>>cast().setAt(index, Js.uncheckedCast(value));
    }

    /**
     * Reset the length of the array.
     *
     * @param newLength the new length of the array
     */
    public final void setLength(int newLength) {
        this.<JsArray<JsString>>cast().length = newLength;
    }

    /**
     * Shifts the first value off the array.
     *
     * @return the shifted value
     */
    public final String shift() {
      return this.<JsArray<JsString>>cast().shift().toString();
    }

    /**
     * Shifts a value onto the beginning of the array.
     *
     * @param value the value to the stored
     */
    public final void unshift(String value) {
        this.<JsArray<JsString>>cast().unshift(Js.uncheckedCast(value));
    }
}
