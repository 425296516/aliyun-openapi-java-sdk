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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.SetIdpMetadataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SetIdpMetadataResponse extends AcsResponse {

	private String requestId;

	private String idpEntityId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getIdpEntityId() {
		return this.idpEntityId;
	}

	public void setIdpEntityId(String idpEntityId) {
		this.idpEntityId = idpEntityId;
	}

	@Override
	public SetIdpMetadataResponse getInstance(UnmarshallerContext context) {
		return	SetIdpMetadataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
