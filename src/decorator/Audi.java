package decorator;

public class Audi implements ICar{

    private int price;

    public Audi(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public void showPrice() {
        System.out.println("audi 의 가격은 " + this.price+ " 원 입니다.");
    }
}
