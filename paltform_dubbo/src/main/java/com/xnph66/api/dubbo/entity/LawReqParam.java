package com.xnph66.api.dubbo.entity;

import java.io.Serializable;

public class LawReqParam implements Serializable{
	
	private static final long serialVersionUID = -2812254881966985671L;
	
	
	private Integer smodel; 				// 查询模式，业务方不需要关注
	private Integer stype; 					// 查询模式。stype =1表示查询个人信息；stype =2表示查询企业信息；默认为查询个人模式
	private String n; 						// 姓名/全称。最大长度150。查询个人时姓名、身份证都必填；查询企业时全称、机构代码二选一。
	private String id; 						// 身份证/组织机构代。最大长度150。查询个人时姓名、身份证都必填、查询企业时全称、机构代码二选一。
	private String year; 					// 时间过滤。最大长度100。实现筛选某几年的信息，多个年份使用英文逗号分隔，如：year=2015,2014，表示只查询2015和2014年的信息
	private Integer pg; 					// 页码。此参数控制获取哪一页的一批结果，默认为1（最大为100）
	private Integer pz; 					// 每页数量。一次查询最多获取结果数量，默认为10,最大100，最小5。
	private String tp; 						// 用于实现分类查询，类型名与类型编号对应关系见下述1.2输出参数介绍“navigate”，“propername”为类型汉字名称，“propervalue”为对应编号

	
	
	public Integer getSmodel() {
		return smodel;
	}

	public void setSmodel(Integer smodel) {
		this.smodel = smodel;
	}

	public Integer getStype() {
		return stype;
	}

	public void setStype(Integer stype) {
		this.stype = stype;
	}

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Integer getPg() {
		return pg;
	}

	public void setPg(Integer pg) {
		this.pg = pg;
	}

	public Integer getPz() {
		return pz;
	}

	public void setPz(Integer pz) {
		this.pz = pz;
	}

	public String getTp() {
		return tp;
	}

	public void setTp(String tp) {
		this.tp = tp;
	}

	
}
