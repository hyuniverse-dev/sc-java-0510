package part2.section21_generic;

public class Product<K, M> {
    private K kind;
    private M model;

    public K getKind() {
        return kind;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }

    // model 필드의 Getter
    public M getModel() {
        return model;
    }

    // model 필드의 Setter
    public void setModel(M model) {
        this.model = model;
    }

}
