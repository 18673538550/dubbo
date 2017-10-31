package com.xnph66.api.dubbo.vo;

import java.io.Serializable;

import com.xnph66.api.dubbo.entity.LawReqParam;

public class LawParamVo extends CommonVo implements Serializable {

	private static final long serialVersionUID = 1947262726133603015L;

	private String appId; 					// 在管理平台中心为每一个业务分配的appId
	private String nonce; 					// 随机整数，用于增加签名的随即性，提高破解难度
	private String reqId; 					// 请求id，用于追溯请求。由业务方保证在同appId下唯一
	private String timestamp; 				// 当前时间戳，单位:秒
	private String signature; 				// 签名
	private String skey;					// 密钥


	private String accessToken; 			// 从鉴权服务中获取的口令
	
	private LawReqParam reqParam;			//汇法网请求参数对象

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getNonce() {
		return nonce;
	}

	public void setNonce(String nonce) {
		this.nonce = nonce;
	}

	public String getReqId() {
		return reqId;
	}

	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getSkey() {
		return skey;
	}

	public void setSkey(String skey) {
		this.skey = skey;
	}

	public LawReqParam getReqParam() {
		return reqParam;
	}

	public void setReqParam(LawReqParam reqParam) {
		this.reqParam = reqParam;
	}
}
