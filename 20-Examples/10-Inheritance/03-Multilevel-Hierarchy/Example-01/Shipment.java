/**
 * 
 * DevCans - Java A-to-Z Resources
 * @author - Java: The Complete Reference - Herbert Schildt
 * 
 */

// Add shipping costs.
class Shipment extends BoxWeight {
    double cost;
    // construct clone of an object
    Shipment(Shipment ob) { // pass object to constructor
        super(ob);
        cost = ob.cost;
    }
    // constructor when all parameters are specified
    Shipment(double w, double h, double d,
    double m, double c) {
        super(w, h, d, m); // call superclass constructor
        cost = c;
    }
    // default constructor
    Shipment() {
        super();
        cost = -1;
    }
    // constructor used when cube is created
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}