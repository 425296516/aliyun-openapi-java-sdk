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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.QueryAIAppResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryAIAppResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryAIAppResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAIAppResponseUnmarshaller {

	public static QueryAIAppResponse unmarshall(QueryAIAppResponse queryAIAppResponse, UnmarshallerContext _ctx) {
		
		queryAIAppResponse.setRequestId(_ctx.stringValue("QueryAIAppResponse.RequestId"));
		queryAIAppResponse.setSuccess(_ctx.booleanValue("QueryAIAppResponse.Success"));
		queryAIAppResponse.setErrorMessage(_ctx.stringValue("QueryAIAppResponse.ErrorMessage"));
		queryAIAppResponse.setCode(_ctx.stringValue("QueryAIAppResponse.Code"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("QueryAIAppResponse.Data.Total"));
		data.setPageCount(_ctx.integerValue("QueryAIAppResponse.Data.PageCount"));
		data.setCurrentPage(_ctx.integerValue("QueryAIAppResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("QueryAIAppResponse.Data.PageSize"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryAIAppResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setAppId(_ctx.stringValue("QueryAIAppResponse.Data.List["+ i +"].AppId"));
			listItem.setAppTemplateId(_ctx.stringValue("QueryAIAppResponse.Data.List["+ i +"].AppTemplateId"));
			listItem.setVersion(_ctx.stringValue("QueryAIAppResponse.Data.List["+ i +"].Version"));
			listItem.setLevel(_ctx.integerValue("QueryAIAppResponse.Data.List["+ i +"].Level"));
			listItem.setName(_ctx.stringValue("QueryAIAppResponse.Data.List["+ i +"].Name"));
			listItem.setDescription(_ctx.stringValue("QueryAIAppResponse.Data.List["+ i +"].Description"));

			list.add(listItem);
		}
		data.setList(list);
		queryAIAppResponse.setData(data);
	 
	 	return queryAIAppResponse;
	}
}