package com.thanggun99.baithi.model;

/**
 * Created by Thanggun99 on 25/03/2017.
 */

public class NhatKy {
    private String thoiGian;
    private String soDienThoai;

    public NhatKy(String soDienThoai, String thoiGian) {
        this.thoiGian = thoiGian;
        this.soDienThoai = soDienThoai;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
}
