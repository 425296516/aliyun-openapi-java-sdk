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

package com.aliyuncs.cspro.transform.v20180315;

import com.aliyuncs.cspro.model.v20180315.UploadOwnedDomainsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadOwnedDomainsResponseUnmarshaller {

	public static UploadOwnedDomainsResponse unmarshall(UploadOwnedDomainsResponse uploadOwnedDomainsResponse, UnmarshallerContext _ctx) {
		
		uploadOwnedDomainsResponse.setRequestId(_ctx.stringValue("UploadOwnedDomainsResponse.RequestId"));
		uploadOwnedDomainsResponse.setCode(_ctx.integerValue("UploadOwnedDomainsResponse.Code"));
		uploadOwnedDomainsResponse.setMessage(_ctx.stringValue("UploadOwnedDomainsResponse.Message"));
		uploadOwnedDomainsResponse.setSuccess(_ctx.booleanValue("UploadOwnedDomainsResponse.Success"));
	 
	 	return uploadOwnedDomainsResponse;
	}
}