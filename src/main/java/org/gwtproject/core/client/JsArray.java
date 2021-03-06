package org.gwtproject.core.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * A simple wrapper around a homogeneous native array of
 * {@link JavaScriptObject} values.
 *
 * This class may not be directly instantiated, and can only be returned from a
 * native method. For example,
 *
 * <code>
 * native JsArray<JavaScriptObject> getNativeArray() /*-{
 *   return [
 *     { x: 0, y: 1},
 *     { x: 2, y: 3},
 *     { x: 4, y: 5},
 *   ];
 * }-* /;
 * </code>
 *
 * @param <T> the concrete type of object contained in this array
 */
@Deprecated
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class JsArray<T extends JavaScriptObject> extends JavaScriptObject {

    protected JsArray() {
    }

    /**
     * Gets the object at a given index.
     *
     * @param index the index to be retrieved
     * @return the object at the given index, or <code>null</code> if none exists
     */
    @JsOverlay
    public final T get(int index) {
      return this.<elemental2.core.JsArray<T>>cast().getAt(index);
    }

    /**
     * Convert each element of the array to a String and join them with a comma
     * separator. The value returned from this method may vary between browsers
     * based on how JavaScript values are converted into strings.
     */
    @JsOverlay
    public final String join() {
        return this.<elemental2.core.JsArray<T>>cast().join();
    }

    /**
     * Convert each element of the array to a String and join them with a comma
     * separator. The value returned from this method may vary between browsers
     * based on how JavaScript values are converted into strings.
     */
    @JsOverlay
    public final String join(String separator) {
      return this.<elemental2.core.JsArray<T>>cast().join(separator);
    }

    /**
     * Gets the length of the array.
     *
     * @return the array length
     */
    @JsOverlay
    public final int length() {
      return this.<elemental2.core.JsArray<T>>cast().length;
    }

    /**
     * Pushes the given value onto the end of the array.
     */
    public native final void push(T value);

    /**
     * Sets the object value at a given index.
     *
     * If the index is out of bounds, the value will still be set. The array's
     * length will be updated to encompass the bounds implied by the added object.
     *
     * @param index the index to be set
     * @param value the object to be stored
     */
    @JsOverlay
    public final void set(int index, T value) {
        this.<elemental2.core.JsArray<T>>cast().setAt(index, value);
    }

    /**
     * Reset the length of the array.
     *
     * @param newLength the new length of the array
     */
    @JsOverlay
    public final void setLength(int newLength) {
      this.<elemental2.core.JsArray<T>>cast().length = newLength;
    }

    /**
     * Shifts the first value off the array.
     *
     * @return the shifted value
     */
    @JsOverlay
    public final T shift() {
      return this.<elemental2.core.JsArray<T>>cast().shift();
    }

    /**
     * Shifts a value onto the beginning of the array.
     *
     * @param value the value to the stored
     */
    public native final void unshift(T value);
}
