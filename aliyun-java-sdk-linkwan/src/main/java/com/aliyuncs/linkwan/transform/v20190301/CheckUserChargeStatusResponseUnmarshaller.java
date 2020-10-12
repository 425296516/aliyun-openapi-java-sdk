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

package com.aliyuncs.linkwan.transform.v20190301;

import com.aliyuncs.linkwan.model.v20190301.CheckUserChargeStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckUserChargeStatusResponseUnmarshaller {

	public static CheckUserChargeStatusResponse unmarshall(CheckUserChargeStatusResponse checkUserChargeStatusResponse, UnmarshallerContext _ctx) {
		
		checkUserChargeStatusResponse.setRequestId(_ctx.stringValue("CheckUserChargeStatusResponse.RequestId"));
		checkUserChargeStatusResponse.setSuccess(_ctx.booleanValue("CheckUserChargeStatusResponse.Success"));
		checkUserChargeStatusResponse.setData(_ctx.stringValue("CheckUserChargeStatusResponse.Data"));
	 
	 	return checkUserChargeStatusResponse;
	}
}