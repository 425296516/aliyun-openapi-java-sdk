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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class StopInstanceRequest extends RpcAcsRequest<StopInstanceResponse> {
	   

	private String forceStop;

	private String version;

	private String instanceId;
	public StopInstanceRequest() {
		super("Ens", "2017-11-10", "StopInstance", "ens");
		setMethod(MethodType.POST);
	}

	public String getForceStop() {
		return this.forceStop;
	}

	public void setForceStop(String forceStop) {
		this.forceStop = forceStop;
		if(forceStop != null){
			putQueryParameter("ForceStop", forceStop);
		}
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
		if(version != null){
			putQueryParameter("Version", version);
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

	@Override
	public Class<StopInstanceResponse> getResponseClass() {
		return StopInstanceResponse.class;
	}

}
