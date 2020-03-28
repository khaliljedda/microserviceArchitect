package org.sid.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
public class CompanyRestService {
	@Value("${xparam}")
	private int xparam;
	@Value("${yparam}")
	private int yparam;
	@GetMapping("/MyConfig")
	public Map<String,Object> myConfig(){
		 Map<String,Object> params = new HashMap<>();
		 params.put("xparam",xparam);
		 params.put("yparam",yparam);
		 params.put("threadName",Thread.currentThread().getName());
		
		return params; 
	}
}
