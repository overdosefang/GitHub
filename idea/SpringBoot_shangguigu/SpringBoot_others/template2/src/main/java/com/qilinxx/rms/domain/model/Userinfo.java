package com.qilinxx.rms.domain.model;

import java.io.Serializable;
import javax.persistence.*;

public class Userinfo implements Serializable {
    /**
     * 工号
     */
    @Id
    private Integer uid;

    /**
     * 密码
     */
    private String password;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 职称
     */
    private String title;

    /**
     * 所属学院
     */
    private String belong;

    /**
     * 所在专业
     */
    private Integer mid;

    /**
     * 简介
     */
    private String profile;

    /**
     * 0为初次使用，1为不可用，2为待审核，3为正常使用
     */
    private String state;

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
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 获取职称
     *
     * @return title - 职称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置职称
     *
     * @param title 职称
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取所属学院
     *
     * @return belong - 所属学院
     */
    public String getBelong() {
        return belong;
    }

    /**
     * 设置所属学院
     *
     * @param belong 所属学院
     */
    public void setBelong(String belong) {
        this.belong = belong == null ? null : belong.trim();
    }

    /**
     * 获取所在专业
     *
     * @return mid - 所在专业
     */
    public Integer getMid() {
        return mid;
    }

    /**
     * 设置所在专业
     *
     * @param mid 所在专业
     */
    public void setMid(Integer mid) {
        this.mid = mid;
    }

    /**
     * 获取简介
     *
     * @return profile - 简介
     */
    public String getProfile() {
        return profile;
    }

    /**
     * 设置简介
     *
     * @param profile 简介
     */
    public void setProfile(String profile) {
        this.profile = profile == null ? null : profile.trim();
    }

    /**
     * 获取0为初次使用，1为不可用，2为待审核，3为正常使用
     *
     * @return state - 0为初次使用，1为不可用，2为待审核，3为正常使用
     */
    public String getState() {
        return state;
    }

    /**
     * 设置0为初次使用，1为不可用，2为待审核，3为正常使用
     *
     * @param state 0为初次使用，1为不可用，2为待审核，3为正常使用
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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
        sb.append(", password=").append(password);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", title=").append(title);
        sb.append(", belong=").append(belong);
        sb.append(", mid=").append(mid);
        sb.append(", profile=").append(profile);
        sb.append(", state=").append(state);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", remake=").append(remake);
        sb.append("]");
        return sb.toString();
    }
}