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

package com.aliyuncs.ccc.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PredictiveRecordSuccessRequest extends RpcAcsRequest<PredictiveRecordSuccessResponse> {
	
	public PredictiveRecordSuccessRequest() {
		super("CCC", "2017-07-05", "PredictiveRecordSuccess");
		setSysMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String callId;

	private String callingNumber;

	private String instanceId;

	private String calledNumber;

	private String callType;

	private String scenarioId;

	private String taskId;

	private String cabInstanceId;

	private Long cabInstanceOwnerId;

	public String getCallId() {
		return this.callId;
	}

	public void setCallId(String callId) {
		this.callId = callId;
		if(callId != null){
			putQueryParameter("CallId", callId);
		}
	}

	public String getCallingNumber() {
		return this.callingNumber;
	}

	public void setCallingNumber(String callingNumber) {
		this.callingNumber = callingNumber;
		if(callingNumber != null){
			putQueryParameter("CallingNumber", callingNumber);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getCalledNumber() {
		return this.calledNumber;
	}

	public void setCalledNumber(String calledNumber) {
		this.calledNumber = calledNumber;
		if(calledNumber != null){
			putQueryParameter("CalledNumber", calledNumber);
		}
	}

	public String getCallType() {
		return this.callType;
	}

	public void setCallType(String callType) {
		this.callType = callType;
		if(callType != null){
			putQueryParameter("CallType", callType);
		}
	}

	public String getScenarioId() {
		return this.scenarioId;
	}

	public void setScenarioId(String scenarioId) {
		this.scenarioId = scenarioId;
		if(scenarioId != null){
			putQueryParameter("ScenarioId", scenarioId);
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId);
		}
	}

	public String getCabInstanceId() {
		return this.cabInstanceId;
	}

	public void setCabInstanceId(String cabInstanceId) {
		this.cabInstanceId = cabInstanceId;
		if(cabInstanceId != null){
			putQueryParameter("CabInstanceId", cabInstanceId);
		}
	}

	public Long getCabInstanceOwnerId() {
		return this.cabInstanceOwnerId;
	}

	public void setCabInstanceOwnerId(Long cabInstanceOwnerId) {
		this.cabInstanceOwnerId = cabInstanceOwnerId;
		if(cabInstanceOwnerId != null){
			putQueryParameter("CabInstanceOwnerId", cabInstanceOwnerId.toString());
		}
	}

	@Override
	public Class<PredictiveRecordSuccessResponse> getResponseClass() {
		return PredictiveRecordSuccessResponse.class;
	}

}
