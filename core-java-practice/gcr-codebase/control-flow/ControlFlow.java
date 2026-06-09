public class ControlFlow{
    static int x;
    int y;
    void method1(){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args){
        ControlFlow obj = new ControlFlow();
        obj.method1();
        //what is object-level variable and class-level variable
        //class-level variable is static variable and object-level variable is instance variable
        //class-level variable is shared among all instances of the class, while object-level variable is unique to each instance of the class
        //class-level variable is accessed using the class name, while
        //object-level variable is accessed using the object reference
        //class-level variable is initialized when the class is loaded, while object-level variable is initialized when the object is created 
    
        int k = 10;
        int res1 = k++ + --k + k + k-- - ++k - --k;
        //k++: returns 10, then k becomes 11
        //--k: k becomes 10, then returns 10
        //k: returns 10
        //k--: returns 10, then k becomes 9
        //++k: k becomes 10, then returns 10
        //--k: k becomes 9, then returns 9
        System.out.println(res1);
    }
}
