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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutUsergetbyaccountlistResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutUsergetbyaccountlistResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutUsergetbyaccountlistResponseUnmarshaller {

	public static GetLinkeBahamutUsergetbyaccountlistResponse unmarshall(GetLinkeBahamutUsergetbyaccountlistResponse getLinkeBahamutUsergetbyaccountlistResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutUsergetbyaccountlistResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountlistResponse.RequestId"));
		getLinkeBahamutUsergetbyaccountlistResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountlistResponse.ResultCode"));
		getLinkeBahamutUsergetbyaccountlistResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountlistResponse.ResultMessage"));
		getLinkeBahamutUsergetbyaccountlistResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountlistResponse.ErrorMessage"));
		getLinkeBahamutUsergetbyaccountlistResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountlistResponse.ErrorMsgParamsMap"));
		getLinkeBahamutUsergetbyaccountlistResponse.setMessage(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountlistResponse.Message"));
		getLinkeBahamutUsergetbyaccountlistResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutUsergetbyaccountlistResponse.ResponseStatusCode"));
		getLinkeBahamutUsergetbyaccountlistResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutUsergetbyaccountlistResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutUsergetbyaccountlistResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAccount(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountlistResponse.Result["+ i +"].Account"));
			resultItem.setConfirmedTime(_ctx.longValue("GetLinkeBahamutUsergetbyaccountlistResponse.Result["+ i +"].ConfirmedTime"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutUsergetbyaccountlistResponse.Result["+ i +"].Created"));
			resultItem.setCustomer(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountlistResponse.Result["+ i +"].Customer"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutUsergetbyaccountlistResponse.Result["+ i +"].Deleted"));
			resultItem.setDepartment(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountlistResponse.Result["+ i +"].Department"));
			resultItem.setEmail(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountlistResponse.Result["+ i +"].Email"));
			resultItem.setEmpId(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountlistResponse.Result["+ i +"].EmpId"));
			resultItem.setHasConfirmed(_ctx.booleanValue("GetLinkeBahamutUsergetbyaccountlistResponse.Result["+ i +"].HasConfirmed"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountlistResponse.Result["+ i +"].Id"));
			resultItem.setLastLogin(_ctx.longValue("GetLinkeBahamutUsergetbyaccountlistResponse.Result["+ i +"].LastLogin"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutUsergetbyaccountlistResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountlistResponse.Result["+ i +"].Name"));
			resultItem.setNick(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountlistResponse.Result["+ i +"].Nick"));
			resultItem.setUid(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountlistResponse.Result["+ i +"].Uid"));
			resultItem.setUniqueId(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountlistResponse.Result["+ i +"].UniqueId"));
			resultItem.setWw(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountlistResponse.Result["+ i +"].Ww"));

			List<String> tenants = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutUsergetbyaccountlistResponse.Result["+ i +"].Tenants.Length"); j++) {
				tenants.add(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountlistResponse.Result["+ i +"].Tenants["+ j +"]"));
			}
			resultItem.setTenants(tenants);

			result.add(resultItem);
		}
		getLinkeBahamutUsergetbyaccountlistResponse.setResult(result);
	 
	 	return getLinkeBahamutUsergetbyaccountlistResponse;
	}
}