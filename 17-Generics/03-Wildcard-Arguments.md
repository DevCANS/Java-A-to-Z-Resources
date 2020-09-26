># Wildcard Arguments

The wildcard argument is specified by the `?`, and it represents an unknown type. A wildcard parameterized type is an instantiation of a generic type where at least one type argument is a wildcard.

##### [Example 01](../20-Examples/17-Generics/03-Wildcard-Arguments/Example-01/)

```java
// Use a wildcard.
class Stats<T extends Number> {
    T[] nums; // array of Number or subclass
    // Pass the constructor a reference to
    // an array of type Number or subclass.
    Stats(T[] o) {
        nums = o;
    }
    // Return type double in all cases.
    double average() {
    double sum = 0.0;
    for(int i=0; i < nums.length; i++)
        sum += nums[i].doubleValue();
        return sum / nums.length;
    }
    // Determine if two averages are the same.
    // Notice the use of the wildcard.
    boolean sameAvg(Stats<?> ob) {
        if(average() == ob.average())
        return true;
        return false;
    }
}
```

```java
// Demonstrate wildcard.
class WildcardDemo {
    public static void main(String args[]) {
        Integer inums[] = { 1, 2, 3, 4, 5 };
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("iob average is " + v);
        
        Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("dob average is " + w);
        
        Float fnums[] = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
        Stats<Float> fob = new Stats<Float>(fnums);
        double x = fob.average();
        System.out.println("fob average is " + x);
        
        // See which arrays have same average.
        System.out.print("Averages of iob and dob ");
        if(iob.sameAvg(dob))
            System.out.println("are the same.");
        else
            System.out.println("differ.");
        System.out.print("Averages of iob and fob ");
        if(iob.sameAvg(fob))
            System.out.println("are the same.");
        else
            System.out.println("differ.");
    }
}
```

##### Output

    iob average is 3.0
    dob average is 3.3
    fob average is 3.0
    Averages of iob and dob differ.
    Averages of iob and fob are the same.


## Bounded Wildcards

A bounded wildcard is especially important when you are creating a generic type that will operate on a class hierarchy.

### Upper Bounded Wildcards

If you want the generic expression to accept all subclasses of a particular type, you will use upper bound wildcard using `extends` keyword.

##### [Example 02](../20-Examples/17-Generics/03-Wildcard-Arguments/Example-02/)

```java
import java.util.*;
public class GenericsExample<T>{
   public static void main(String[] args){
      //List of Integers
      List<Integer> ints = Arrays.asList(1,2,3,4,5);
      System.out.println(sum(ints));
       
      //List of Doubles
      List<Double> doubles = Arrays.asList(1.5d,2d,3d);
      System.out.println(sum(doubles));
       
      List<String> strings = Arrays.asList("1","2");
      //This will give compilation error as :: The method sum(List<? extends Number>) in the 
      //type GenericsExample<T> is not applicable for the arguments (List<String>)
      System.out.println(sum(strings));
       
   }
    
   //Method will accept only subclasses of Number
   private static Number sum (List<? extends Number> numbers){
      double s = 0.0;
      for (Number n : numbers)
         s += n.doubleValue();
      return s;
   }
}
```

##### Output

    15.0
    6.5

### Lower Bounded Wildcards

If you want a generic expression to accept all types which are “super” type of a particular type OR parent class of a particular class then you will use a lower bound wildcard for this purpose, using `super` keyword.

##### [Example 03](../20-Examples/17-Generics/03-Wildcard-Arguments/Example-03/)

```java
import java.util.Arrays;  
import java.util.List;  
  
public class LowerBoundWildcard {  
  
    public static void addNumbers(List<? super Integer> list) {
        for(Object n:list){  
              System.out.println(n);  
        }
    }

    public static void main(String[] args) {  
        
        List<Integer> l1=Arrays.asList(1,2,3);  
        System.out.println("displaying the Integer values");  
        addNumbers(l1);  
        
        List<Number> l2=Arrays.asList(1.0,2.0,3.0);  
        System.out.println("displaying the Number values");  
        addNumbers(l2);  
    }  
  
}
```

##### Output

    displaying the Integer values
    1
    2
    3
    displaying the Number values
    1.0
    2.0
    3.0


## External Resources

### Readings

* [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/java/generics/wildcards.html)
* [JavaTPoint](https://www.javatpoint.com/generics-in-java)

### Youtube Videos

* [Cave of Programming](https://www.youtube.com/watch?v=QqLBp7MdkEU&list=PL9DF6E4B45C36D411&index=31)