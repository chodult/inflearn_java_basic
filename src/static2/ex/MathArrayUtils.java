package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        //private 인스턴스 생성을 막는다.
    }

    public static int sum(int[] values) {
        int sumValues = 0;
        for (int i = 0; i < values.length; i++) {
            sumValues += values[i];
        }
        return sumValues;
    }

    public static double average(int[] values) {
//        for (int i = 0; i < values.length; i++) {
//            averageValues += values[i];
//        }
        return (double) sum(values) / values.length;
    }
    public static int min(int[] values) {
        int minValues = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] < minValues) {
                minValues = values[i];
            }
        }
        return minValues;
    }

    public static int max(int[] values) {
        int maxValues = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] > maxValues) {
                maxValues = values[i];
            }
        }
        return maxValues;
    }
}
