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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudphoto.model.v20170711.RemoveAlbumPhotosResponse;
import com.aliyuncs.cloudphoto.model.v20170711.RemoveAlbumPhotosResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveAlbumPhotosResponseUnmarshaller {

	public static RemoveAlbumPhotosResponse unmarshall(RemoveAlbumPhotosResponse removeAlbumPhotosResponse, UnmarshallerContext context) {
		
		removeAlbumPhotosResponse.setRequestId(context.stringValue("RemoveAlbumPhotosResponse.RequestId"));
		removeAlbumPhotosResponse.setCode(context.stringValue("RemoveAlbumPhotosResponse.Code"));
		removeAlbumPhotosResponse.setMessage(context.stringValue("RemoveAlbumPhotosResponse.Message"));
		removeAlbumPhotosResponse.setAction(context.stringValue("RemoveAlbumPhotosResponse.Action"));

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < context.lengthValue("RemoveAlbumPhotosResponse.Results.Length"); i++) {
			Result result = new Result();
			result.setId(context.longValue("RemoveAlbumPhotosResponse.Results["+ i +"].Id"));
			result.setIdStr(context.stringValue("RemoveAlbumPhotosResponse.Results["+ i +"].IdStr"));
			result.setCode(context.stringValue("RemoveAlbumPhotosResponse.Results["+ i +"].Code"));
			result.setMessage(context.stringValue("RemoveAlbumPhotosResponse.Results["+ i +"].Message"));

			results.add(result);
		}
		removeAlbumPhotosResponse.setResults(results);
	 
	 	return removeAlbumPhotosResponse;
	}
}