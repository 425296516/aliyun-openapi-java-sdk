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

package com.aliyuncs.industry_brain.transform.v20180712;

import com.aliyuncs.industry_brain.model.v20180712.GetDataPropertiesResponse;
import com.aliyuncs.industry_brain.model.v20180712.GetDataPropertiesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataPropertiesResponseUnmarshaller {

	public static GetDataPropertiesResponse unmarshall(GetDataPropertiesResponse getDataPropertiesResponse, UnmarshallerContext context) {
		
		getDataPropertiesResponse.setRequestId(context.stringValue("GetDataPropertiesResponse.RequestId"));

		Data data = new Data();
		data.setProperty(context.stringValue("GetDataPropertiesResponse.Data.Property"));
		data.setVariableType(context.stringValue("GetDataPropertiesResponse.Data.VariableType"));
		data.setSelectieFilter(context.stringValue("GetDataPropertiesResponse.Data.SelectieFilter"));
		getDataPropertiesResponse.setData(data);
	 
	 	return getDataPropertiesResponse;
	}
}