package part2.section21_generic;

import lombok.ToString;

@ToString
public class Tv {
    private String brand;

    public Tv(String brand) {
        this.brand = brand;
    }
}
