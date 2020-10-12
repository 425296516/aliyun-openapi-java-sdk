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

package com.aliyuncs.oam.model.v20170101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CheckPermissionRequest extends RpcAcsRequest<CheckPermissionResponse> {
	   

	private String resource;

	private String actionField;

	private Long aliUid;
	public CheckPermissionRequest() {
		super("Oam", "2017-01-01", "CheckPermission");
		setMethod(MethodType.POST);
	}

	public String getResource() {
		return this.resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
		if(resource != null){
			putQueryParameter("Resource", resource);
		}
	}

	public String getActionField() {
		return this.actionField;
	}

	public void setActionField(String actionField) {
		this.actionField = actionField;
		if(actionField != null){
			putQueryParameter("ActionField", actionField);
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
		}
	}

	@Override
	public Class<CheckPermissionResponse> getResponseClass() {
		return CheckPermissionResponse.class;
	}

}
