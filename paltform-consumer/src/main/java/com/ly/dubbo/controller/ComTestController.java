package com.ly.dubbo.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.xnph66.api.dubbo.entity.LawReqParam;
import com.xnph66.api.dubbo.service.LawReqService;
import com.xnph66.api.dubbo.vo.LawParamVo;

@RestController
public class ComTestController {
	
	private static final Log logger =LogFactory.getLog(ComTestController.class);

	@Autowired
	private LawReqService r_lawReqService;

	@RequestMapping(value = "/test/{type}")
	public String getCity(HttpServletRequest request,@PathVariable String type) {
		logger.info("******************进入消费者方法***************");
		String result = "";
		if("law".equals(type)){
			try {
				String param = "{'n': '陈灿林','id': '420204196904184538','stype': 1}";
				LawReqParam reqParam = JSONObject.parseObject(param, LawReqParam.class);
				LawParamVo lawParamVo = new LawParamVo();
				lawParamVo.setReqParam(reqParam);
				result = r_lawReqService.lawReq(lawParamVo);
				logger.info("消费方,result:"+result);
			} catch (Exception e) {
				logger.error("获取异常信息:"+e.getMessage(), e);
			}
			
		}
		logger.info("******************进入消费者完毕***************");		
		return result;
	}

}