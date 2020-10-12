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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.DescribeDWSTaskResponse;
import com.aliyuncs.sofa.model.v20190815.DescribeDWSTaskResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDWSTaskResponseUnmarshaller {

	public static DescribeDWSTaskResponse unmarshall(DescribeDWSTaskResponse describeDWSTaskResponse, UnmarshallerContext _ctx) {
		
		describeDWSTaskResponse.setRequestId(_ctx.stringValue("DescribeDWSTaskResponse.RequestId"));
		describeDWSTaskResponse.setResultCode(_ctx.stringValue("DescribeDWSTaskResponse.ResultCode"));
		describeDWSTaskResponse.setResultMessage(_ctx.stringValue("DescribeDWSTaskResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDWSTaskResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setNewTaskStatus(_ctx.stringValue("DescribeDWSTaskResponse.Data["+ i +"].NewTaskStatus"));
			dataItem.setNumber(_ctx.longValue("DescribeDWSTaskResponse.Data["+ i +"].Number"));

			data.add(dataItem);
		}
		describeDWSTaskResponse.setData(data);
	 
	 	return describeDWSTaskResponse;
	}
}