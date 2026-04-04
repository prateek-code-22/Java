package Classes;

import java.awt.Rectangle;

public class Sealed_Class {
    
}

// to control the inheritance of class & give permit to some classes only.
// permit to circle and rectangle class only
public sealed interface Shape permits Circle, Rectangle
{

}

//non sealed rectangle interface can be extended further.
public non-sealed interface Rectangle implements Shape{

}

//final class so no more extension
public final class Circle{

}
