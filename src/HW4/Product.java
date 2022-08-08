package HW4;

public class Product {
    int ProductID;
    String NameFruits;
    int PriceFruits;
    String Made;

    @Override
    public String toString() {
        return "Product{" + "ProductID=" + ProductID + ", NameFruits='" + NameFruits + '\'' + ", PriceFruits=" + PriceFruits + ", Made='" + Made + '\'' + '}';
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public void setNameFruits(String nameFruits) {
        NameFruits = nameFruits;
    }

    public void setPriceFruits(int priceFruits) {
        PriceFruits = priceFruits;
    }

    public void setMade(String made) {
        Made = made;
    }


}
