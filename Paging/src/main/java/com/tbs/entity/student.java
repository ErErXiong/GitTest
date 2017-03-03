package com.tbs.entity;

public class student {
    private Integer sid;

    private String sname;

    private Integer sage;

    private Integer tid;
    
    private String tname;

    public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

	@Override
	public String toString() {
		return "student [sid=" + sid + ", sname=" + sname + ", sage=" + sage
				+ ", tid=" + tid + ", tname=" + tname + "]";
	}
}