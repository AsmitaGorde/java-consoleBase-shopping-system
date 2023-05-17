package Application3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Shop {
    private int shopId;
    private String shopName;
    private String shopType;
    private List<Product> productlist=new ArrayList<>();
    public  Shop(){

    }


    public List<Product> getProductlist() {
        return productlist;
    }

    public void setProductlist(Product p) {
        this.productlist.add(p);
    }

    public Shop(int shopId, String shopName, String shopType, List<Product> productlist) {
        this.shopId = shopId;
        this.shopName = shopName;
        this.shopType = shopType;
        this.productlist = productlist;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }
}

