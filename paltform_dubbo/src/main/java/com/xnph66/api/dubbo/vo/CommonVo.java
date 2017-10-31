package com.xnph66.api.dubbo.vo;

import java.io.Serializable;

public class CommonVo implements Serializable {

	private static final long serialVersionUID = -2942453831547700821L;

	
	private String applyId;						// 申请ID
	private String reqUrl;			   			// 异步回调请求地址
	private String reqType;						// 请求类型
	private String houseReqId;					// 房贷请求ID

	public String getApplyId() {
		return applyId;
	}

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getReqUrl() {
		return reqUrl;
	}

	public void setReqUrl(String reqUrl) {
		this.reqUrl = reqUrl;
	}

	public String getReqType() {
		return reqType;
	}

	public void setReqType(String reqType) {
		this.reqType = reqType;
	}

	public String getHouseReqId() {
		return houseReqId;
	}

	public void setHouseReqId(String houseReqId) {
		this.houseReqId = houseReqId;
	}
	
	
}
