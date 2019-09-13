package com.taotao.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "tb_order_item")
public class TbOrderItem implements Serializable {
    @Id
    private String id;

    /**
     * 商品id
     */
    @Column(name = "item_id")
    private String itemId;

    /**
     * 订单id
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 商品购买数量
     */
    private Integer num;

    /**
     * 商品标题
     */
    private String title;

    /**
     * 商品单价
     */
    private Long price;

    /**
     * 商品总金额
     */
    @Column(name = "total_fee")
    private Long totalFee;

    /**
     * 商品图片地址
     */
    @Column(name = "pic_path")
    private String picPath;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取商品id
     *
     * @return item_id - 商品id
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置商品id
     *
     * @param itemId 商品id
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * 获取订单id
     *
     * @return order_id - 订单id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单id
     *
     * @param orderId 订单id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * 获取商品购买数量
     *
     * @return num - 商品购买数量
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置商品购买数量
     *
     * @param num 商品购买数量
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取商品标题
     *
     * @return title - 商品标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置商品标题
     *
     * @param title 商品标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取商品单价
     *
     * @return price - 商品单价
     */
    public Long getPrice() {
        return price;
    }

    /**
     * 设置商品单价
     *
     * @param price 商品单价
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * 获取商品总金额
     *
     * @return total_fee - 商品总金额
     */
    public Long getTotalFee() {
        return totalFee;
    }

    /**
     * 设置商品总金额
     *
     * @param totalFee 商品总金额
     */
    public void setTotalFee(Long totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * 获取商品图片地址
     *
     * @return pic_path - 商品图片地址
     */
    public String getPicPath() {
        return picPath;
    }

    /**
     * 设置商品图片地址
     *
     * @param picPath 商品图片地址
     */
    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", itemId=").append(itemId);
        sb.append(", orderId=").append(orderId);
        sb.append(", num=").append(num);
        sb.append(", title=").append(title);
        sb.append(", price=").append(price);
        sb.append(", totalFee=").append(totalFee);
        sb.append(", picPath=").append(picPath);
        sb.append("]");
        return sb.toString();
    }
}