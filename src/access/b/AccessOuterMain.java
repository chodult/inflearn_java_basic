package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //default 호출 불가
        //defalut는 package-private이기 때문에 같은 패키지 내에서만 가능
//        data.defaultField = 2;
//        data.defalutMethod();

        //private 호출 불가능
//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess();
    }
}
