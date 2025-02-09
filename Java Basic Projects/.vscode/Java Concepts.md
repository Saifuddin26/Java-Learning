# Java Concepts

..Using constructor because it is called by itself while making objects.

..this: 
available only in scope of current object, removes ambiguity betweeen instance variables and 
local variables with same name, used for overloaded, can call other constructor on current object

..getter methods 
system gets the variables even if its private 

..local variables
ones used in the methods or functions

..instance variables
ones used in the data members of class

..void 
use void when the method has to return nothing

..encapsulation
when the data members are kept private and they are used by getter and setter methods it concept of encapsulating

..class 
class is also a datatype not primitive like string or int

..object
the object is type of the class.

..public Rental(Car car, Customer customer, int days) 
here the car and customer itself are object coming from above code.
using class is here is as data type.


..difference between arraylist and array
array length be known first and is fixed size 
arraylist get double when its near to get filled 
so arraylist is more efficient 

..private List<Car> cars;
this is the array list 
this goes as follows
[carobject1, carobject2, carobject3.....]

..public carRentalSystem(){
    cars = new ArrayList<>();
}
when the constructor is made memory is specified for the objects.
right now as objects are not made its empty array list.


..Java List 
arrayList is the concrete implementation of of java list interface.