package com.qilinxx.rms.domain.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "user_major")
public class UserMajor implements Serializable {
    /**
     * 外键
     */
    private Integer uid;

    /**
     * 外键
     */
    private Integer mid;

    /**
     * 权限：1为审核、2为查看
     */
    private String power;

    /**
     * 备用字段
     */
    private String remake;

    private static final long serialVersionUID = 1L;

    /**
     * 获取外键
     *
     * @return uid - 外键
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置外键
     *
     * @param uid 外键
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取外键
     *
     * @return mid - 外键
     */
    public Integer getMid() {
        return mid;
    }

    /**
     * 设置外键
     *
     * @param mid 外键
     */
    public void setMid(Integer mid) {
        this.mid = mid;
    }

    /**
     * 获取权限：1为审核、2为查看
     *
     * @return power - 权限：1为审核、2为查看
     */
    public String getPower() {
        return power;
    }

    /**
     * 设置权限：1为审核、2为查看
     *
     * @param power 权限：1为审核、2为查看
     */
    public void setPower(String power) {
        this.power = power == null ? null : power.trim();
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
        sb.append(", mid=").append(mid);
        sb.append(", power=").append(power);
        sb.append(", remake=").append(remake);
        sb.append("]");
        return sb.toString();
    }
}