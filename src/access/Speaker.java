package access;

public class Speaker {

    int voulme;

    Speaker (int voulme){
        this.voulme = voulme;
    }

    void volumeUp() {
        if (voulme >= 100){
            System.out.println("음량을 증가 할 수 없습니다. 최대 음량입니다");
        } else {
            voulme += 10;
            System.out.println("음량을 10 증가합니다");
        }
    }

    void volumeDown() {
        voulme -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재 음량 : " + voulme);
    }
}
