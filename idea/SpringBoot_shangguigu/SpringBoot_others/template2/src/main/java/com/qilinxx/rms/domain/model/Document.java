package com.qilinxx.rms.domain.model;

import java.io.Serializable;
import javax.persistence.*;

public class Document implements Serializable {
    /**
     * 自增长
     */
    @Id
    private Integer did;

    /**
     * 附件名称
     */
    private String name;

    /**
     * 附件类型
     */
    private String type;

    /**
     * 附件存储路径
     */
    private String path;

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
     * 获取自增长
     *
     * @return did - 自增长
     */
    public Integer getDid() {
        return did;
    }

    /**
     * 设置自增长
     *
     * @param did 自增长
     */
    public void setDid(Integer did) {
        this.did = did;
    }

    /**
     * 获取附件名称
     *
     * @return name - 附件名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置附件名称
     *
     * @param name 附件名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取附件类型
     *
     * @return type - 附件类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置附件类型
     *
     * @param type 附件类型
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取附件存储路径
     *
     * @return path - 附件存储路径
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置附件存储路径
     *
     * @param path 附件存储路径
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
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
        sb.append(", did=").append(did);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", path=").append(path);
        sb.append(", itemId=").append(itemId);
        sb.append(", itemType=").append(itemType);
        sb.append(", remake=").append(remake);
        sb.append("]");
        return sb.toString();
    }
}