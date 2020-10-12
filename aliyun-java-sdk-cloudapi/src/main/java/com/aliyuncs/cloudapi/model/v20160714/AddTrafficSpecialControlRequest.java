/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddTrafficSpecialControlRequest extends RpcAcsRequest<AddTrafficSpecialControlResponse> {
	
	public AddTrafficSpecialControlRequest() {
		super("CloudAPI", "2016-07-14", "AddTrafficSpecialControl", "apigateway");
		setSysMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String trafficControlId;

	private String specialKey;

	private Integer trafficValue;

	private String securityToken;

	private String specialType;

	public String getTrafficControlId() {
		return this.trafficControlId;
	}

	public void setTrafficControlId(String trafficControlId) {
		this.trafficControlId = trafficControlId;
		if(trafficControlId != null){
			putQueryParameter("TrafficControlId", trafficControlId);
		}
	}

	public String getSpecialKey() {
		return this.specialKey;
	}

	public void setSpecialKey(String specialKey) {
		this.specialKey = specialKey;
		if(specialKey != null){
			putQueryParameter("SpecialKey", specialKey);
		}
	}

	public Integer getTrafficValue() {
		return this.trafficValue;
	}

	public void setTrafficValue(Integer trafficValue) {
		this.trafficValue = trafficValue;
		if(trafficValue != null){
			putQueryParameter("TrafficValue", trafficValue.toString());
		}
	}

	public String getBizSecurityToken() {
		return this.securityToken;
	}

	public void setBizSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	/**
	 * @deprecated use getBizSecurityToken instead of this.
	 */
	@Deprecated
	public String getSecurityToken() {
		return this.securityToken;
	}

	/**
	 * @deprecated use setBizSecurityToken instead of this.
	 */
	@Deprecated
	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getSpecialType() {
		return this.specialType;
	}

	public void setSpecialType(String specialType) {
		this.specialType = specialType;
		if(specialType != null){
			putQueryParameter("SpecialType", specialType);
		}
	}

	@Override
	public Class<AddTrafficSpecialControlResponse> getResponseClass() {
		return AddTrafficSpecialControlResponse.class;
	}

}
