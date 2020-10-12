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

package com.aliyuncs.ess.model.v20140828;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ess.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ExecuteScalingRuleRequest extends RpcAcsRequest<ExecuteScalingRuleResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private Float breachThreshold;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private Float metricValue;

	private String scalingRuleAri;
	public ExecuteScalingRuleRequest() {
		super("Ess", "2014-08-28", "ExecuteScalingRule", "ess");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public Float getBreachThreshold() {
		return this.breachThreshold;
	}

	public void setBreachThreshold(Float breachThreshold) {
		this.breachThreshold = breachThreshold;
		if(breachThreshold != null){
			putQueryParameter("BreachThreshold", breachThreshold.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Float getMetricValue() {
		return this.metricValue;
	}

	public void setMetricValue(Float metricValue) {
		this.metricValue = metricValue;
		if(metricValue != null){
			putQueryParameter("MetricValue", metricValue.toString());
		}
	}

	public String getScalingRuleAri() {
		return this.scalingRuleAri;
	}

	public void setScalingRuleAri(String scalingRuleAri) {
		this.scalingRuleAri = scalingRuleAri;
		if(scalingRuleAri != null){
			putQueryParameter("ScalingRuleAri", scalingRuleAri);
		}
	}

	@Override
	public Class<ExecuteScalingRuleResponse> getResponseClass() {
		return ExecuteScalingRuleResponse.class;
	}

}
