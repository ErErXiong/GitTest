package com.tbs.entity;

public class teacher {
    private Integer tid;

    private String tname;

    private Integer tage;

    private String courename;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public Integer getTage() {
        return tage;
    }

    public void setTage(Integer tage) {
        this.tage = tage;
    }

    public String getCourename() {
        return courename;
    }

    public void setCourename(String courename) {
        this.courename = courename == null ? null : courename.trim();
    }
}