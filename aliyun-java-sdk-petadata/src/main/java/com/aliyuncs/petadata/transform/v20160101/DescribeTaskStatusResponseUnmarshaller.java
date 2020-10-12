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

package com.aliyuncs.petadata.transform.v20160101;

import com.aliyuncs.petadata.model.v20160101.DescribeTaskStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTaskStatusResponseUnmarshaller {

	public static DescribeTaskStatusResponse unmarshall(DescribeTaskStatusResponse describeTaskStatusResponse, UnmarshallerContext context) {
		
		describeTaskStatusResponse.setRequestId(context.stringValue("DescribeTaskStatusResponse.RequestId"));
		describeTaskStatusResponse.setTaskId(context.stringValue("DescribeTaskStatusResponse.TaskId"));
		describeTaskStatusResponse.setMessage(context.stringValue("DescribeTaskStatusResponse.Message"));
		describeTaskStatusResponse.setBeginTime(context.stringValue("DescribeTaskStatusResponse.BeginTime"));
		describeTaskStatusResponse.setFinishTime(context.stringValue("DescribeTaskStatusResponse.FinishTime"));
		describeTaskStatusResponse.setStatus(context.stringValue("DescribeTaskStatusResponse.Status"));
	 
	 	return describeTaskStatusResponse;
	}
}