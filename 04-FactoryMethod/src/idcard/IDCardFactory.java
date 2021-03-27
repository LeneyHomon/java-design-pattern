package idcard;

import framework.Factory;
import framework.Product;

import java.util.HashMap;
import java.util.Map;

public class IDCardFactory extends Factory {

    private Map<Integer, String> ownersMap;
    private Integer code;

    public IDCardFactory() {
        this.ownersMap = new HashMap<>();
        this.code = 100;
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, code++);
    }

    @Override
    protected void registerProduct(Product p) {
        ownersMap.put(((IDCard) p).getCode(), ((IDCard) p).getOwner());
    }


    public Map<Integer, String> getOwnersMap() {
        return ownersMap;
    }

    public String getOwnerByCode(Integer code) {
        return ownersMap.getOrDefault(code, null);
    }
}
