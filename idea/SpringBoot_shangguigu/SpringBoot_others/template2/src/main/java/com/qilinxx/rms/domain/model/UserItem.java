package com.qilinxx.rms.domain.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "user_item")
public class UserItem implements Serializable {
    /**
     * 工号
     */
    private Integer uid;

    /**
     * 项目、论文、奖励的id
     */
    @Column(name = "item_id")
    private String itemId;

    /**
     * project、thesis、reward
     */
    @Column(name = "item_type")
    private String itemType;

    /**
     * 备用字段
     */
    private String remake;

    private static final long serialVersionUID = 1L;

    /**
     * 获取工号
     *
     * @return uid - 工号
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置工号
     *
     * @param uid 工号
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取项目、论文、奖励的id
     *
     * @return item_id - 项目、论文、奖励的id
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置项目、论文、奖励的id
     *
     * @param itemId 项目、论文、奖励的id
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * 获取project、thesis、reward
     *
     * @return item_type - project、thesis、reward
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * 设置project、thesis、reward
     *
     * @param itemType project、thesis、reward
     */
    public void setItemType(String itemType) {
        this.itemType = itemType == null ? null : itemType.trim();
    }

    /**
     * 获取备用字段
     *
     * @return remake - 备用字段
     */
    public String getRemake() {
        return remake;
    }

    /**
     * 设置备用字段
     *
     * @param remake 备用字段
     */
    public void setRemake(String remake) {
        this.remake = remake == null ? null : remake.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", itemId=").append(itemId);
        sb.append(", itemType=").append(itemType);
        sb.append(", remake=").append(remake);
        sb.append("]");
        return sb.toString();
    }
}