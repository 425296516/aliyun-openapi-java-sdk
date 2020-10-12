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

import com.aliyuncs.cloudphoto.model.v20170711.AddAlbumPhotosResponse;
import com.aliyuncs.cloudphoto.model.v20170711.AddAlbumPhotosResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddAlbumPhotosResponseUnmarshaller {

	public static AddAlbumPhotosResponse unmarshall(AddAlbumPhotosResponse addAlbumPhotosResponse, UnmarshallerContext context) {
		
		addAlbumPhotosResponse.setRequestId(context.stringValue("AddAlbumPhotosResponse.RequestId"));
		addAlbumPhotosResponse.setCode(context.stringValue("AddAlbumPhotosResponse.Code"));
		addAlbumPhotosResponse.setMessage(context.stringValue("AddAlbumPhotosResponse.Message"));
		addAlbumPhotosResponse.setAction(context.stringValue("AddAlbumPhotosResponse.Action"));

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < context.lengthValue("AddAlbumPhotosResponse.Results.Length"); i++) {
			Result result = new Result();
			result.setId(context.longValue("AddAlbumPhotosResponse.Results["+ i +"].Id"));
			result.setIdStr(context.stringValue("AddAlbumPhotosResponse.Results["+ i +"].IdStr"));
			result.setCode(context.stringValue("AddAlbumPhotosResponse.Results["+ i +"].Code"));
			result.setMessage(context.stringValue("AddAlbumPhotosResponse.Results["+ i +"].Message"));

			results.add(result);
		}
		addAlbumPhotosResponse.setResults(results);
	 
	 	return addAlbumPhotosResponse;
	}
}