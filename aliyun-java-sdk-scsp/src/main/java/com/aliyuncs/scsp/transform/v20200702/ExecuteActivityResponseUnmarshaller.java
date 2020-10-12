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

package com.aliyuncs.scsp.transform.v20200702;

import com.aliyuncs.scsp.model.v20200702.ExecuteActivityResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecuteActivityResponseUnmarshaller {

	public static ExecuteActivityResponse unmarshall(ExecuteActivityResponse executeActivityResponse, UnmarshallerContext _ctx) {
		
		executeActivityResponse.setRequestId(_ctx.stringValue("ExecuteActivityResponse.RequestId"));
		executeActivityResponse.setSuccess(_ctx.booleanValue("ExecuteActivityResponse.Success"));
		executeActivityResponse.setCode(_ctx.stringValue("ExecuteActivityResponse.Code"));
		executeActivityResponse.setMessage(_ctx.stringValue("ExecuteActivityResponse.Message"));
	 
	 	return executeActivityResponse;
	}
}