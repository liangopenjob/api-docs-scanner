package com.jwliang.application.api.annotation.scanner.bean.mock;

/**
 * 
 * @ClassName: ByteMockType  
 * @Description: ByteMock注解信息
 * @author: liangjunwei
 * @email: liangjwjob_2014@sina.com
 * @date: 2017年2月27日
 *
 */

public class ByteMockType implements VoFieldMockType {
	
	private String byteStr;
	private String description;
	/** 
	 * 获取 byteStr
	 *  
	 * @return byteStr 
	 */
	public String getByteStr() {
		return byteStr;
	}
	/** 
	 * 设置 byteStr
	 *  
	 * @param byteStr 
	 *            byteStr 
	 */
	public void setByteStr(String byteStr) {
		this.byteStr = byteStr;
	}
	/** 
	 * 获取 description
	 *  
	 * @return description 
	 */
	public String getDescription() {
		return description;
	}
	/** 
	 * 设置 description
	 *  
	 * @param description 
	 *            description 
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
}

