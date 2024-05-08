package assgn3;

public class Q4 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello");
        Box<String> anotherStringBox = stringBox;
        stringBox.setValue("World");
        System.out.println(anotherStringBox.getValue());

        Box<Integer> intBox = new Box<>(10);
        Box<Integer> anotherIntBox = intBox;
        intBox.setValue(20);
        System.out.println(anotherIntBox.getValue());

        Box<Object> objectBox = new Box<>(null);
        objectBox.setValue("Hello");
        System.out.println(objectBox.getValue());
    }
}

class Box<T> {
    private T value;
    public Box(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
}
