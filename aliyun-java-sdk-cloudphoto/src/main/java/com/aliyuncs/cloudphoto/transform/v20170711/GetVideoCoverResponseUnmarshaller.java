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

package com.aliyuncs.cloudphoto.transform.v20170711;

import com.aliyuncs.cloudphoto.model.v20170711.GetVideoCoverResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVideoCoverResponseUnmarshaller {

	public static GetVideoCoverResponse unmarshall(GetVideoCoverResponse getVideoCoverResponse, UnmarshallerContext context) {
		
		getVideoCoverResponse.setRequestId(context.stringValue("GetVideoCoverResponse.RequestId"));
		getVideoCoverResponse.setCode(context.stringValue("GetVideoCoverResponse.Code"));
		getVideoCoverResponse.setMessage(context.stringValue("GetVideoCoverResponse.Message"));
		getVideoCoverResponse.setVideoCoverUrl(context.stringValue("GetVideoCoverResponse.VideoCoverUrl"));
		getVideoCoverResponse.setAction(context.stringValue("GetVideoCoverResponse.Action"));
	 
	 	return getVideoCoverResponse;
	}
}