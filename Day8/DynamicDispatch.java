package Day8;

class Parent {

    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    void show() {
        System.out.println("Child");
    }
}

public class DynamicDispatch {

    public static void main(String[] args) {

        Parent p = new Child();

        p.show();
    }
}
