package idcard;

import framework.Product;

public class IDCard extends Product {
    private String owner;
    private Integer code;

    public IDCard(String owner, Integer code) {
        System.out.println("制作" + owner + "(" + code + ")的ID卡。");
        this.owner = owner;
        this.code = code;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "(" + code + ")的ID卡。");
    }

    public String getOwner() {
        return owner;
    }

    public Integer getCode() {
        return code;
    }
}
