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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteAntChainConsortiumRequest extends RpcAcsRequest<DeleteAntChainConsortiumResponse> {
	   

	private String consortiumId;
	public DeleteAntChainConsortiumRequest() {
		super("Baas", "2018-12-21", "DeleteAntChainConsortium", "baas");
		setMethod(MethodType.PUT);
	}

	public String getConsortiumId() {
		return this.consortiumId;
	}

	public void setConsortiumId(String consortiumId) {
		this.consortiumId = consortiumId;
		if(consortiumId != null){
			putBodyParameter("ConsortiumId", consortiumId);
		}
	}

	@Override
	public Class<DeleteAntChainConsortiumResponse> getResponseClass() {
		return DeleteAntChainConsortiumResponse.class;
	}

}
