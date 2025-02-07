package static1;

public class Data3 {
    public String name;
    /**
     * 멤버 변수에 static이 붙으면
     * static 변수 , 정적 변수, 클래스 변수
     */
    public static int count;

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
