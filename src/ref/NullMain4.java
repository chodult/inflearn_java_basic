package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigdata.count = " + bigData.count);
        System.out.println("bigdata.data = " + bigData.data);

        System.out.println("bigdata.data.valiue = " + bigData.data.value);
    }
}
