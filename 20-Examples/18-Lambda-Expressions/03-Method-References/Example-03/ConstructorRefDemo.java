/**
 * 
 * DevCans - Java A-to-Z Resources
 * @author - Java: The Complete Reference - Herbert Schildt
 * 
 */

class ConstructorRefDemo{
    public static void main(String args[]){
        // Create a reference to the MyClass constructor.
        // Because func() in MyFunc takes an argument, new
        // refers to the parameterized constructor in MyClass,
        // not the default constructor.
        MyFunc myClassCons = MyClass::new;
        // Create an instance of MyClass via that constructor reference.
        MyClass mc = myClassCons.func(100);
        // Use the instance of MyClass just created.
        System.out.println("val in mc is " + mc.getVal());
    }
}