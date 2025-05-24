package part2.section21_generic;

public class GenericEx2 {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<>();

        // 실제 데이터 대입
        product1.setKind(new Tv("삼성TV"));
        product1.setModel("Smart TV");

        System.out.println("kind == " + product1.getKind());
        System.out.println("model ==  " + product1.getModel());

        // Car 제품 생성하기 Product 객체에서 kind에는 Car 객체를 대입하고, model "Sports Car"를 대입하기.
        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("Sports Car");

        System.out.println("product2.getKind() = " + product2.getKind());
        System.out.println("product2.getModel() = " + product2.getModel());
    }
}
