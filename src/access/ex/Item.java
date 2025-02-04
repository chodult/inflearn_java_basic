package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //이름가져오기
    public String getName() {
        return name;
    }

    //합계출력
    public int getTotalPrice() {
        return price * quantity;
    }

}
