package com.sevenine.housekeeper.dto;
/**
 * 基金数据
 * created by xu-jp on 2020/7/29
 **/
public class FundDataDTO {

    /* id */
    private String id;

    /* 证券代码 */
    private String index_code;

    /* 名称 */
    private String name;

    /*  */
    private String ttype;

    /* pe */
    private String pe;

    /* pb */
    private String pb;

    /* pe百分位 */
    private String pe_percentile;

    /* pb百分位 */
    private String pb_percentile;

    /* 净资产收益率 */
    private String roe;

    /* 股息率 */
    private String yeild;

    /* 更新时间？ */
    private String ts;

    /* 估值类型名称？ */
    private String eva_type;

    /* 估值类型代码？ */
    private String eva_type_int;

    /* 基金详情链接 */
    private String url;

    /*  */
    private String bond_yeild;

    /* 开始时间？ */
    private String begin_at;

    /* 创建时间？ */
    private String created_at;

    /* 更新时间？ */
    private String updated_at;

    /* 预测PEG */
    private String peg;

    /*  */
    private String pb_flag;

    /*  */
    private String pb_over_history;

    /*  */
    private String pe_over_history;

    /* 时间？ */
    private String date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIndex_code() {
        return index_code;
    }

    public void setIndex_code(String index_code) {
        this.index_code = index_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTtype() {
        return ttype;
    }

    public void setTtype(String ttype) {
        this.ttype = ttype;
    }

    public String getPe() {
        return pe;
    }

    public void setPe(String pe) {
        this.pe = pe;
    }

    public String getPb() {
        return pb;
    }

    public void setPb(String pb) {
        this.pb = pb;
    }

    public String getPe_percentile() {
        return pe_percentile;
    }

    public void setPe_percentile(String pe_percentile) {
        this.pe_percentile = pe_percentile;
    }

    public String getPb_percentile() {
        return pb_percentile;
    }

    public void setPb_percentile(String pb_percentile) {
        this.pb_percentile = pb_percentile;
    }

    public String getRoe() {
        return roe;
    }

    public void setRoe(String roe) {
        this.roe = roe;
    }

    public String getYeild() {
        return yeild;
    }

    public void setYeild(String yeild) {
        this.yeild = yeild;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public String getEva_type() {
        return eva_type;
    }

    public void setEva_type(String eva_type) {
        this.eva_type = eva_type;
    }

    public String getEva_type_int() {
        return eva_type_int;
    }

    public void setEva_type_int(String eva_type_int) {
        this.eva_type_int = eva_type_int;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBond_yeild() {
        return bond_yeild;
    }

    public void setBond_yeild(String bond_yeild) {
        this.bond_yeild = bond_yeild;
    }

    public String getBegin_at() {
        return begin_at;
    }

    public void setBegin_at(String begin_at) {
        this.begin_at = begin_at;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getPeg() {
        return peg;
    }

    public void setPeg(String peg) {
        this.peg = peg;
    }

    public String getPb_flag() {
        return pb_flag;
    }

    public void setPb_flag(String pb_flag) {
        this.pb_flag = pb_flag;
    }

    public String getPb_over_history() {
        return pb_over_history;
    }

    public void setPb_over_history(String pb_over_history) {
        this.pb_over_history = pb_over_history;
    }

    public String getPe_over_history() {
        return pe_over_history;
    }

    public void setPe_over_history(String pe_over_history) {
        this.pe_over_history = pe_over_history;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "FundDataDTO{" +
                "id='" + id + '\'' +
                ", index_code='" + index_code + '\'' +
                ", name='" + name + '\'' +
                ", ttype='" + ttype + '\'' +
                ", pe='" + pe + '\'' +
                ", pb='" + pb + '\'' +
                ", pe_percentile='" + pe_percentile + '\'' +
                ", pb_percentile='" + pb_percentile + '\'' +
                ", roe='" + roe + '\'' +
                ", yeild='" + yeild + '\'' +
                ", ts='" + ts + '\'' +
                ", eva_type='" + eva_type + '\'' +
                ", eva_type_int='" + eva_type_int + '\'' +
                ", url='" + url + '\'' +
                ", bond_yeild='" + bond_yeild + '\'' +
                ", begin_at='" + begin_at + '\'' +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", peg='" + peg + '\'' +
                ", pb_flag='" + pb_flag + '\'' +
                ", pb_over_history='" + pb_over_history + '\'' +
                ", pe_over_history='" + pe_over_history + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
