/**         NOTES ON CLASSES, OBJECTS, VARIABLES AND METHODS
 *    An Object is anything that exists, it can be Human, Biro, Air.
 *  What an Object have is called Instance Variables, and What an object can do is called Methods.
 *  A Class is a blue-print, Template or Contract that defines what an Object data fields and Methods will be.
 *  You can create many instance of a class, and the process of creating an instance of a class is called INSTANTIATION.
 *  An Object is more often called an INSTANCE
 *  A Class uses Variables to define data fields, and uses Methods to define Actions.
 *    A Class provides methods of a special type, known as CONSTRUCTORS, which are invoked to
 *  create a new object.
 *  A constructor can perform any action, but constructors are designed to
 *  perform initializing actions, such as setting the default values of Variables.
 *  A constructor is invoked to create an object using the new operator.
 *  A constructor must have the same name as the class itself.
 *  ■ Constructors do not have a return type—not even void.
 *  ■ Constructors are invoked using the new operator when an object is created.
 *   Constructors play the role of initializing objects.
 *   Constructors are used to construct an object from a class.
 *     A class normally provides a constructor without arguments.
 *   Such a constructor is referred to as a no-argument constructor.
 *     A class may be defined without constructors. In this case, a public no-arg constructor with
 *   an empty body is implicitly defined in the class. This constructor, called a default constructor,
 *   is provided automatically only if no constructors are explicitly defined in the class
 *
 *     In OOP terminology, an object’s member refers to its data fields and methods. After an object
 *  is created, its data can be accessed and its methods can be invoked using the dot operator (.),
 *  also known as the object member access operator.
 *  All the methods in the Math class i.e Math.power() are static methods, which are defined using the static keyword.
 *
 *    NullPointerException is a common runtime error. It occurs when you invoke
 *  a method on a reference variable with a null value. Make sure you assign an object
 *  reference to the variable before invoking the method through the reference variable
 *
 *    Note that Java API contains a rich set of classes for developing Java programs.
 *  All the classes in the java library are all static classes.
        When should we declare a method static?
        Ans : When it does not use any instance variable

        How do we know we need an Instance Variable?
        ANS : when it will be used in more than one method.

        Implicitly : when it is done by you.
        Explicitly : when it is done by your compiler.

        What do we test for?
        - we test for functionalities and not methods
        (i.e we test that deposit works and not deposit method works.)
        */

package _9_ObjectsAndClasses;

public class NotesOnClassesObjectsAndMethods {}
