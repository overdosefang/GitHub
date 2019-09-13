package com.qilinxx.rms.domain.model;

import java.io.Serializable;
import javax.persistence.*;

public class Thesis implements Serializable {
    /**
     * uuid
     */
    @Id
    private String tid;

    /**
     * 第一作者
     */
    private String host;

    /**
     * 其他作者
     */
    private String people;

    /**
     * 论文名称
     */
    private String name;

    /**
     * 期刊
     */
    private String book;

    /**
     * 年
     */
    private Integer year;

    /**
     * 卷
     */
    private Integer dossier;

    /**
     * 期
     */
    private Integer issue;

    /**
     * 起止页码
     */
    @Column(name = "page_num")
    private String pageNum;

    /**
     * 级别
     */
    private String rank;

    /**
     * 类别
     */
    private String type;

    /**
     * 备注
     */
    private String profile;

    /**
     * 0为待审核，1为审核未通过，2为通过审核
     */
    private String state;

    /**
     * 发布人的id
     */
    @Column(name = "create_id")
    private Integer createId;

    /**
     * 论文发布时间
     */
    @Column(name = "create_time")
    private Long createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Long updateTime;

    /**
     * 外键
     */
    private Integer mid;

    /**
     * 备用字段
     */
    private String remake;

    private static final long serialVersionUID = 1L;

    /**
     * 获取uuid
     *
     * @return tid - uuid
     */
    public String getTid() {
        return tid;
    }

    /**
     * 设置uuid
     *
     * @param tid uuid
     */
    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    /**
     * 获取第一作者
     *
     * @return host - 第一作者
     */
    public String getHost() {
        return host;
    }

    /**
     * 设置第一作者
     *
     * @param host 第一作者
     */
    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    /**
     * 获取其他作者
     *
     * @return people - 其他作者
     */
    public String getPeople() {
        return people;
    }

    /**
     * 设置其他作者
     *
     * @param people 其他作者
     */
    public void setPeople(String people) {
        this.people = people == null ? null : people.trim();
    }

    /**
     * 获取论文名称
     *
     * @return name - 论文名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置论文名称
     *
     * @param name 论文名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取期刊
     *
     * @return book - 期刊
     */
    public String getBook() {
        return book;
    }

    /**
     * 设置期刊
     *
     * @param book 期刊
     */
    public void setBook(String book) {
        this.book = book == null ? null : book.trim();
    }

    /**
     * 获取年
     *
     * @return year - 年
     */
    public Integer getYear() {
        return year;
    }

    /**
     * 设置年
     *
     * @param year 年
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * 获取卷
     *
     * @return dossier - 卷
     */
    public Integer getDossier() {
        return dossier;
    }

    /**
     * 设置卷
     *
     * @param dossier 卷
     */
    public void setDossier(Integer dossier) {
        this.dossier = dossier;
    }

    /**
     * 获取期
     *
     * @return issue - 期
     */
    public Integer getIssue() {
        return issue;
    }

    /**
     * 设置期
     *
     * @param issue 期
     */
    public void setIssue(Integer issue) {
        this.issue = issue;
    }

    /**
     * 获取起止页码
     *
     * @return page_num - 起止页码
     */
    public String getPageNum() {
        return pageNum;
    }

    /**
     * 设置起止页码
     *
     * @param pageNum 起止页码
     */
    public void setPageNum(String pageNum) {
        this.pageNum = pageNum == null ? null : pageNum.trim();
    }

    /**
     * 获取级别
     *
     * @return rank - 级别
     */
    public String getRank() {
        return rank;
    }

    /**
     * 设置级别
     *
     * @param rank 级别
     */
    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    /**
     * 获取类别
     *
     * @return type - 类别
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类别
     *
     * @param type 类别
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取备注
     *
     * @return profile - 备注
     */
    public String getProfile() {
        return profile;
    }

    /**
     * 设置备注
     *
     * @param profile 备注
     */
    public void setProfile(String profile) {
        this.profile = profile == null ? null : profile.trim();
    }

    /**
     * 获取0为待审核，1为审核未通过，2为通过审核
     *
     * @return state - 0为待审核，1为审核未通过，2为通过审核
     */
    public String getState() {
        return state;
    }

    /**
     * 设置0为待审核，1为审核未通过，2为通过审核
     *
     * @param state 0为待审核，1为审核未通过，2为通过审核
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * 获取发布人的id
     *
     * @return create_id - 发布人的id
     */
    public Integer getCreateId() {
        return createId;
    }

    /**
     * 设置发布人的id
     *
     * @param createId 发布人的id
     */
    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    /**
     * 获取论文发布时间
     *
     * @return create_time - 论文发布时间
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * 设置论文发布时间
     *
     * @param createTime 论文发布时间
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
        sb.append(", tid=").append(tid);
        sb.append(", host=").append(host);
        sb.append(", people=").append(people);
        sb.append(", name=").append(name);
        sb.append(", book=").append(book);
        sb.append(", year=").append(year);
        sb.append(", dossier=").append(dossier);
        sb.append(", issue=").append(issue);
        sb.append(", pageNum=").append(pageNum);
        sb.append(", rank=").append(rank);
        sb.append(", type=").append(type);
        sb.append(", profile=").append(profile);
        sb.append(", state=").append(state);
        sb.append(", createId=").append(createId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", mid=").append(mid);
        sb.append(", remake=").append(remake);
        sb.append("]");
        return sb.toString();
    }
}