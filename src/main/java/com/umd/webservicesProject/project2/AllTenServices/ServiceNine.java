package com.umd.webservicesProject.project2.AllTenServices;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.umd.webservicesProject.project2.TO.CHandlerWebServiceClassTO;
import com.umd.webservicesProject.project2.model.FinalResponeObject;

@RestController
public class ServiceNine {
	
	@RequestMapping(value="/9",method=RequestMethod.POST,produces= {"application/json","application/xml"})
	@ResponseBody
	public FinalResponeObject acceptXmlData(@RequestBody CHandlerWebServiceClassTO puser ) {
		System.out.println(puser.getUserName());
		FinalResponeObject finalResponeObject= new FinalResponeObject();
		finalResponeObject.setUserName(puser.getUserName());
		finalResponeObject.setServiceName("9");
		//set invocation date
		LocalDate now = LocalDate.now();
		
		finalResponeObject.setInvocationDate(now.toString());
		//set invocation time
		LocalTime timenow =LocalTime.now();
		finalResponeObject.setInvocationTime(timenow.toString());
		return finalResponeObject;
	}
}