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
