package by.clevertek.test.repository.productRepository;

/**
 * @author Eugene Petrov
 */
public enum ProductType {
    MILK(1), CHEESE(2);
    private int id;

    ProductType(int id) {
        this.id = id;
    }


    public static ProductType getProductTypeById(int id) throws IllegalArgumentException {
        ProductType returnedType = null;
        for (ProductType type : ProductType.values()) {
            if (type.id == id) {
                returnedType = type;
            }
        }
        if (returnedType != null) {
            return returnedType;
        } else {
            throw new IllegalArgumentException("Wrong id number");
        }
    }
}
