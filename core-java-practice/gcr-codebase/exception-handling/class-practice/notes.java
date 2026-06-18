//exception handling - its a mechanism to handle the runmtime errors
//types of exceptions - 
//checked - checked at compile time
//unchecked - checked at runtime
//Custom Exceptions - user defined exceptions

//Handling Exceptions -
//1. try-catch blocks - used to handle the exceptions
//2. try-catch-finally blocks - used to handle the exceptions and finally block is used to execute the code after the try-catch block
//3. try-with-resources statement - used to handle the execptions and resources are closed automatically after the try-catch block
//4. throws clause - used to declare the exceptions that are not handled by the current method
//5. throw statement - used to throw the exceptions manually 

//exception hierarchy in java - 
//Throwable - Error, Exception
//Error - JVM related errors, cannot be handled by the program like OutOfMemoryError, StackOverflowError 
//Exception - RuntimeException, CheckedException, CustomException - User defined exceptions
//RuntimeException - unchecked exceptions, not checked at compile time, like NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException
//CheckedException - checked at compile time, like IOException, SQLException
//CustomException - user defined exceptions, extends Exception class
//finally block - used to execute the code after the try-catch block, even if the exception is thrown, the finally block is executed
//throwable class - used to create custom exceptions
//error class - used to create custom errors
//exception class - used to create custom exceptions
//custom exception - used to create custom exceptions
//custom error - used to create custom errors
//custom exception - used to create custom exceptions

