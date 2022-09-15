package com.sevenine.housekeeper.dto;
/**
 * DTO
 * created by xu-jp on 2020/7/29
 **/
public class ResponseDTO {

    /* 数据 */
    private ItemDTO data;

    /* 成功状态 0 成功 */
    private String result_code;

    public ItemDTO getData() {
        return data;
    }

    public void setData(ItemDTO data) {
        this.data = data;
    }

    public String getResult_code() {
        return result_code;
    }

    public void setResult_code(String result_code) {
        this.result_code = result_code;
    }

    @Override
    public String toString() {
        return "ResponseDTO{" +
                "data=" + data +
                ", result_code='" + result_code + '\'' +
                '}';
    }
}
