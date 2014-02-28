package com.power.core.security.entity;

// Generated 2014-1-2 10:44:18 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SysPath generated by hbm2java
 */
@Entity
@Table(name = "sys_path", catalog = "powersh")
public class SysPath implements java.io.Serializable {

	private String pid;
	private String pkey;
	private String pvalue;
	private String ptarget;
	private String pstatus;
	private String ptype;

	public SysPath() {
	}

	public SysPath(String pid, String pkey) {
		this.pid = pid;
		this.pkey = pkey;
	}

	public SysPath(String pid, String pkey, String pvalue, String ptarget,
			String pstatus, String ptype) {
		this.pid = pid;
		this.pkey = pkey;
		this.pvalue = pvalue;
		this.ptarget = ptarget;
		this.pstatus = pstatus;
		this.ptype = ptype;
	}

	@Id
	@Column(name = "PID", unique = true, nullable = false, length = 30)
	public String getPid() {
		return this.pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	@Column(name = "PKey", nullable = false, length = 50)
	public String getPkey() {
		return this.pkey;
	}

	public void setPkey(String pkey) {
		this.pkey = pkey;
	}

	@Column(name = "PValue", length = 150)
	public String getPvalue() {
		return this.pvalue;
	}

	public void setPvalue(String pvalue) {
		this.pvalue = pvalue;
	}

	@Column(name = "PTarget", length = 100)
	public String getPtarget() {
		return this.ptarget;
	}

	public void setPtarget(String ptarget) {
		this.ptarget = ptarget;
	}

	@Column(name = "PStatus", length = 4)
	public String getPstatus() {
		return this.pstatus;
	}

	public void setPstatus(String pstatus) {
		this.pstatus = pstatus;
	}

	@Column(name = "PType", length = 4)
	public String getPtype() {
		return this.ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

}
