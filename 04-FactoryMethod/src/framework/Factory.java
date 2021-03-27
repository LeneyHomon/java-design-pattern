package framework;

public abstract class Factory {

    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product p);

    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
}
