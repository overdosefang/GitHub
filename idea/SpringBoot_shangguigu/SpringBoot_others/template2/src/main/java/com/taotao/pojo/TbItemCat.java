package com.taotao.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_item_cat")
public class TbItemCat implements Serializable {
    /**
     * 类目ID
     */
    @Id
    private Long id;

    /**
     * 父类目ID=0时，代表的是一级的类目
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 类目名称
     */
    private String name;

    /**
     * 状态。可选值:1(正常),2(删除)
     */
    private Integer status;

    /**
     * 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     */
    @Column(name = "sort_order")
    private Integer sortOrder;

    /**
     * 该类目是否为父类目，1为true，0为false
     */
    @Column(name = "is_parent")
    private Boolean isParent;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 创建时间
     */
    private Date updated;

    private static final long serialVersionUID = 1L;

    /**
     * 获取类目ID
     *
     * @return id - 类目ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置类目ID
     *
     * @param id 类目ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取父类目ID=0时，代表的是一级的类目
     *
     * @return parent_id - 父类目ID=0时，代表的是一级的类目
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置父类目ID=0时，代表的是一级的类目
     *
     * @param parentId 父类目ID=0时，代表的是一级的类目
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取类目名称
     *
     * @return name - 类目名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置类目名称
     *
     * @param name 类目名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取状态。可选值:1(正常),2(删除)
     *
     * @return status - 状态。可选值:1(正常),2(删除)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态。可选值:1(正常),2(删除)
     *
     * @param status 状态。可选值:1(正常),2(删除)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     *
     * @return sort_order - 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * 设置排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     *
     * @param sortOrder 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * 获取该类目是否为父类目，1为true，0为false
     *
     * @return is_parent - 该类目是否为父类目，1为true，0为false
     */
    public Boolean getIsParent() {
        return isParent;
    }

    /**
     * 设置该类目是否为父类目，1为true，0为false
     *
     * @param isParent 该类目是否为父类目，1为true，0为false
     */
    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    /**
     * 获取创建时间
     *
     * @return created - 创建时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置创建时间
     *
     * @param created 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取创建时间
     *
     * @return updated - 创建时间
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置创建时间
     *
     * @param updated 创建时间
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", name=").append(name);
        sb.append(", status=").append(status);
        sb.append(", sortOrder=").append(sortOrder);
        sb.append(", isParent=").append(isParent);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append("]");
        return sb.toString();
    }
}