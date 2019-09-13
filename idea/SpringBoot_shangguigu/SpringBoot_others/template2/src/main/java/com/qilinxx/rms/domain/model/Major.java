package com.qilinxx.rms.domain.model;

import java.io.Serializable;
import javax.persistence.*;

public class Major implements Serializable {
    /**
     * 自增长
     */
    @Id
    private Integer mid;

    /**
     * 专业名称
     */
    private String name;

    /**
     * 专业简介
     */
    private String profile;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Long createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Long updateTime;

    /**
     * 0为此权限不可用，1为此权限可用
     */
    private String state;

    /**
     * 备用字段
     */
    private String remake;

    private static final long serialVersionUID = 1L;

    /**
     * 获取自增长
     *
     * @return mid - 自增长
     */
    public Integer getMid() {
        return mid;
    }

    /**
     * 设置自增长
     *
     * @param mid 自增长
     */
    public void setMid(Integer mid) {
        this.mid = mid;
    }

    /**
     * 获取专业名称
     *
     * @return name - 专业名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置专业名称
     *
     * @param name 专业名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取专业简介
     *
     * @return profile - 专业简介
     */
    public String getProfile() {
        return profile;
    }

    /**
     * 设置专业简介
     *
     * @param profile 专业简介
     */
    public void setProfile(String profile) {
        this.profile = profile == null ? null : profile.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取0为此权限不可用，1为此权限可用
     *
     * @return state - 0为此权限不可用，1为此权限可用
     */
    public String getState() {
        return state;
    }

    /**
     * 设置0为此权限不可用，1为此权限可用
     *
     * @param state 0为此权限不可用，1为此权限可用
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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
        sb.append(", mid=").append(mid);
        sb.append(", name=").append(name);
        sb.append(", profile=").append(profile);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", state=").append(state);
        sb.append(", remake=").append(remake);
        sb.append("]");
        return sb.toString();
    }
}