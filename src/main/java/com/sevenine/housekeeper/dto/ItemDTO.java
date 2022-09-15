package com.sevenine.housekeeper.dto;

import java.util.List;

/**
 * DTO
 * created by xu-jp on 2020/7/29
 **/
public class ItemDTO {

    /* 数据 */
    private List<FundDataDTO> items;

    /* 当前页 */
    private String  current_page;

    /* 记录数 */
    private String  size;

    /* 总数量 */
    private String  total_items;

    /* 总页数 */
    private String  total_pages;

    public List<FundDataDTO> getItems() {
        return items;
    }

    public void setItems(List<FundDataDTO> items) {
        this.items = items;
    }

    public String getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(String current_page) {
        this.current_page = current_page;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getTotal_items() {
        return total_items;
    }

    public void setTotal_items(String total_items) {
        this.total_items = total_items;
    }

    public String getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(String total_pages) {
        this.total_pages = total_pages;
    }

    @Override
    public String toString() {
        return "ItemDTO{" +
                "items=" + items +
                ", current_page='" + current_page + '\'' +
                ", size='" + size + '\'' +
                ", total_items='" + total_items + '\'' +
                ", total_pages='" + total_pages + '\'' +
                '}';
    }

}
