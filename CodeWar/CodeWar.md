..Split String Problem

public method can call from same package or another package
.. static before method shows that it belongs to class itself and is not
instance method
object = instance of class
static method can be called without creating objects because it does not
use instance variable
StringSplitter.splitString();

instance method can be called by
StringSplitter stringsplit = new StringSplitter();
stringsplit.add() // suppose add was the instance method

// TWO BUILT IN METHODS USED
substring(index inclusive, index exclusive)
toArray(new String[0]): converts list into array with correct size and with correct data type specified as string

// override methods works on instance variable and methods of class but not static


.. DECIMAL TO BINARY AND THEN COUNTING ONES IN THE RESULT
.. LEARNED ABOUT FOR EACH LOOP
for(type variable : collection)
here collection can be array list set
does not modify the collection
cleaner and readable
good for iterating collections

example
for( char bit : binary.toCharArray() )
here binary is string it will convert to char array and each char will go one by one in in bit variable

.. Learned how to take input in java
import java.util.Scanner

Scanner scanner = new Scanner ();
int Number = scanner.NextInt()
