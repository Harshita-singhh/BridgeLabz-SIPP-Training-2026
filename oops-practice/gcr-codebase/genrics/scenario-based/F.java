class Box<T>{
    T data;
    public Box(T data){
        this.data=data;
    }

    public T getBox(){
        return data;
    }

    public void setBox(T data){
        this.data=data;
    }

}

public class F {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(10);
        System.out.println(box.getBox());
        box.setBox(20);
        System.out.println(box.getBox());
    }
}