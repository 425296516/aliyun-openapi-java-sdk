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

package com.aliyuncs.pts.transform.v20190810;

import com.aliyuncs.pts.model.v20190810.SynchronizeInstanceInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SynchronizeInstanceInfoResponseUnmarshaller {

	public static SynchronizeInstanceInfoResponse unmarshall(SynchronizeInstanceInfoResponse synchronizeInstanceInfoResponse, UnmarshallerContext _ctx) {
		
		synchronizeInstanceInfoResponse.setRequestId(_ctx.stringValue("SynchronizeInstanceInfoResponse.RequestId"));
		synchronizeInstanceInfoResponse.setCode(_ctx.stringValue("SynchronizeInstanceInfoResponse.Code"));
		synchronizeInstanceInfoResponse.setMessage(_ctx.stringValue("SynchronizeInstanceInfoResponse.Message"));
		synchronizeInstanceInfoResponse.setHttpStatusCode(_ctx.integerValue("SynchronizeInstanceInfoResponse.HttpStatusCode"));
		synchronizeInstanceInfoResponse.setSuccess(_ctx.booleanValue("SynchronizeInstanceInfoResponse.Success"));
	 
	 	return synchronizeInstanceInfoResponse;
	}
}