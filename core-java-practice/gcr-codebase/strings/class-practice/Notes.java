//SCP - String Constant Pool in Java
// String literals are stored in a special memory area called the String Constant Pool (SCP).

//String s1 = "abc";
//String s2 = "def";
//String s3 = s1+"def"; //stored in heap memory, not in SCP, because it is created at runtime using string concatenation, which results in a new string object being created in the heap memory, rather than referencing an existing string literal in the SCP. Therefore, s3 is stored in the heap memory and not in the SCP.
//String s4 = s1+s2;
//s3 == s4 -> false, string builder is used to create s3 and s4, so they are stored in the heap memory, not in the SCP, because they are created at runtime. Therefore, s3 and s4 reference different memory locations, resulting in false when using '==' for comparison. To compare the content of s3 and s4, the '.equals()' method should be used instead, which will return true since their content is the same.
//s1.concat("def") -> "abcdef", this creates a new string object in the heap memory, and does not modify the original string s1, which remains "abc". Therefore, s1.concat("def") will return a new string "abcdef", but s1 will still be "abc".


//Strings are immutable in Java, meaning once created, their content cannot be changed. When a string literal is created
//it is stored in the SCP. If another string literal with the same content is created, it will reference the same memory location in the SCP, rather than creating a new object. This allows for memory optimization and faster string comparison using the '==' operator for string literals. However, when using the 'new' keyword to create a string, a new object is created in the heap memory, and '==' will return false when comparing it to a string literal, even if their content is the same. To compare the content of strings, the '.equals()' method should be used instead.


// == vs .equals() in Java
// == -> refers to the reference of the object in memory
// .equals() -> refers to the content of the object


//StringBuilder and StringBuffer are mutable classes in Java, which means their content can be modified after creation. 
//They are used for efficient string manipulation, especially when concatenating multiple strings, 
//as they do not create new objects in memory like String does. 
//StringBuilder is not synchronized and is faster than StringBuffer, which is synchronized and thread-safe. 
//When using StringBuilder or StringBuffer, the '==' operator will compare the reference of the object, while the '.equals()' method will compare the content of the object.
//StringBuilder -> Synchronized, means it is not thread-safe, and should be used in single-threaded environments for better performance.
//StringBuffer -> not Synchronized, means it is thread-safe, and should be used in multi-threaded environments to avoid concurrency issues.


//all Memory areas in java - 
// 1. Heap Memory - objects using 'new' keyword, stringBuilder, StringBuffer, and non-primitive data types are stored in heap memory.
// 2. Stack Memory - local variables, method calls, and primitive data types are stored in stack memory. Each thread has its own stack memory, and it is used for method execution and variable storage during runtime.
// 3. String Constant Pool (SCP) - in heap memory, string literals, string objects
// 4. Method Area - class-level data, static variables, and method bytecode are stored in the method area. It is shared among all threads and is used for class loading and runtime data storage.
// 5. Program Counter Register - it is a small memory area that holds the address of the currently executing instruction in a thread. Each thread has its own program counter register, and it is used to keep track of the execution flow of the program. It helps in managing method calls and returns during program execution.
// 6. Native Method Stack - it is a memory area that is used to support native methods, which are methods written in languages other than Java (such as C or C++). The native method stack is used to manage the execution of native methods and to store their local variables and data. It is separate from the Java stack and is used when Java code interacts with native code through the Java Native Interface (JNI).


//thread -> a thread is a lightweight process that can run concurrently with other threads within the same program. It allows for multitasking and can improve the performance of a program by allowing multiple tasks to be executed simultaneously. Each thread has its own stack memory and program counter register, but they share the heap memory and method area. Threads can be created using the Thread class or by implementing the Runnable interface in Java.
//thread vs method -> a thread is a separate path of execution within a program, while a method is a block of code that performs a specific task. 
//A thread can execute multiple methods, and methods can be called by multiple threads. 
//Threads are used for concurrent execution, while methods are used for code organization and reusability.


//Kadane's Algorithm - its a DP algo, used to find the maximum sum of a contiguous subarray in an array of integers. 
//It works by iterating through the array and keeping track of the current maximum sum and the overall maximum sum. 
//If the current maximum sum becomes negative, it is reset to zero, as it would not contribute to a larger sum. 
//The overall maximum sum is updated whenever the current maximum sum exceeds it. 
//This algorithm has a time complexity of O(n) and a space complexity of O(1), making it efficient for solving this problem.
//[1, -1, 2, 3, 4, 1, 6]
//currentMax = 1, maxSoFar = 1 //max(0 + 1, 1) -> 1, max(0, 1) -> 1
//currentMax = 0, maxSoFar = 1 //max(1 + -1, -1) -> 0, max(1, 0) -> 1
//currentMax = 2, maxSoFar = 2 //max(0 + 2, 2) -> 2, max(1, 2) -> 2
//currentMax = 5, maxSoFar = 5 //max(2 + 3, 3) -> 5, max(2, 5) -> 5
//currentMax = 9, maxSoFar = 9 //max(5 + 4, 4) -> 9, max(5, 9) -> 9
//currentMax = 10, maxSoFar = 10 //max(9 + 1, 1) -> 10, max(9, 10) -> 10
//currentMax = 16, maxSoFar = 16 //max(10 + 6, 6) -> 16, max(10, 16) -> 16
//Output -> 16 
//formula used -> currentMax = max(currentMax + arr[i], arr[i])
//maxSoFar = max(maxSoFar, currentMax)


//dutch national flag
//sort colors 75 leetcode problem
//[0, 0, 1, 2, 0, 0, 1, 2]
//output -> [0, 0, 0, 0, 1, 1, 2, 2]
//i -> array index, j -> 0 end index, k -> 2 end index
//calculation of approach - 
//i = 0, j = 0, k = 7 -> [0, 0, 1, 2, 0, 0, 1, 2] // arr[i] = 0 -> swap(i, j) -> i++ -> j++
//i = 1, j = 1, k = 7 -> [0, 0, 1, 2, 0, 0, 1, 2] // arr[i] = 0 -> swap(i, j) -> i++ -> j++
//i = 2, j = 2, k = 7 -> [0, 0, 1, 2, 0, 0, 1, 2] // arr[i] = 1 -> i++
//i = 3, j = 2, k = 7 -> [0, 0, 1, 2, 0, 0, 1, 2] // arr[i] = 2 -> swap(i, k) -> k--
//i = 3, j = 2, k = 6 -> [0, 0, 1, 1, 0, 0, 2, 2] // arr[i] = 2 -> swap(i, k) -> k--
//i = 3, j = 2, k = 5 -> [0, 0, 1, 0, 0, 1, 2, 2] // arr[i] = 0 -> swap(i, j) -> i++ -> j++
//i = 4, j = 3, k = 5 -> [0, 0, 0, 1, 0, 1, 2, 2] // arr[i] = 0 -> swap(i, j) -> i++ -> j++
//i = 5, j = 4, k = 5 -> [0, 0, 0, 0, 1, 1, 2, 2] // arr[i] = 1 -> i++
//i = 6, j = 4, k = 5 -> [0, 0, 0, 0, 1, 1, 2, 2] // i > k -> exit loop
//pseudocode -
//initialize i, j, k
//while i <= k
//  if arr[i] == 0 -> swap(i, j) -> i++ -> j++
//  else if arr[i] == 1 -> i++
//  else -> swap(i, k) -> k-- //i++ is not incremented here because we need to check the swapped value at index i in the next iteration
//time complexity -> O(n) -> we are iterating through the array once