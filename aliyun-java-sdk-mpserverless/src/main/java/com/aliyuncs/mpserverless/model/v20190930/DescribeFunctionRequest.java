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

package com.aliyuncs.mpserverless.model.v20190930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeFunctionRequest extends RpcAcsRequest<DescribeFunctionResponse> {
	   

	private String spaceId;

	private String functionId;
	public DescribeFunctionRequest() {
		super("MPServerless", "2019-09-30", "DescribeFunction", "MPServerless");
		setMethod(MethodType.POST);
	}

	public String getSpaceId() {
		return this.spaceId;
	}

	public void setSpaceId(String spaceId) {
		this.spaceId = spaceId;
		if(spaceId != null){
			putBodyParameter("SpaceId", spaceId);
		}
	}

	public String getFunctionId() {
		return this.functionId;
	}

	public void setFunctionId(String functionId) {
		this.functionId = functionId;
		if(functionId != null){
			putBodyParameter("FunctionId", functionId);
		}
	}

	@Override
	public Class<DescribeFunctionResponse> getResponseClass() {
		return DescribeFunctionResponse.class;
	}

}
