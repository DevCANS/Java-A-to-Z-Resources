/**
 * 
 * DevCans - Java A-to-Z Resources
 * @author - Java: The Complete Reference - Herbert Schildt
 * 
 */

// A generic interface example.
// A Min/Max interface.
interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}