package static2;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        //추가
        //인스턴스를 통한 접근
        DecoData data3 = new DecoData();

        /**
         * static메서드를 인스턴르를 통해서 사용 가능하지만...
         * 인스턴스영역으로 갔다가 메서드영역으로 돌려보냄
         * 비추천이기에 인텔리제이에서 .을 찍어도 나오지않음. 타이핑해야함.
         */
        data3.staticCall();

        //클래스를 통한 접근
        DecoData.staticCall();

    }
}
