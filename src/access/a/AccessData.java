package access.a;

public class AccessData {

    public int publicField;
    int defaultField;
    private int privateFied;

    public void publicMethod() {
        System.out.println("publicMethod 호출 " + publicField);
    }

    void defalutMethod() {
        System.out.println("defalutMethod 호출 " + defaultField);
    }
    private void privateMethod() {
        System.out.println("privateMethod 호출 " + privateFied);
    }

    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateFied = 300;
        publicMethod();
        defalutMethod();
        privateMethod();
    }
}
