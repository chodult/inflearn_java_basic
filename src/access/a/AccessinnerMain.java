package access.a;

public class AccessinnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //default 호출 가능
        data.defaultField = 2;
        data.defalutMethod();

        //private 호출 불가능
//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess();
    }
}
