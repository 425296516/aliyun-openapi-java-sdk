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

package com.aliyuncs.mhub.transform.v20170825;

import com.aliyuncs.mhub.model.v20170825.QueryProductInfoResponse;
import com.aliyuncs.mhub.model.v20170825.QueryProductInfoResponse.ProductInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryProductInfoResponseUnmarshaller {

	public static QueryProductInfoResponse unmarshall(QueryProductInfoResponse queryProductInfoResponse, UnmarshallerContext _ctx) {
		
		queryProductInfoResponse.setRequestId(_ctx.stringValue("QueryProductInfoResponse.RequestId"));

		ProductInfo productInfo = new ProductInfo();
		productInfo.setName(_ctx.stringValue("QueryProductInfoResponse.ProductInfo.Name"));
		productInfo.setIndustryId(_ctx.integerValue("QueryProductInfoResponse.ProductInfo.IndustryId"));
		productInfo.setEncodedIcon(_ctx.stringValue("QueryProductInfoResponse.ProductInfo.EncodedIcon"));
		productInfo.setIconName(_ctx.stringValue("QueryProductInfoResponse.ProductInfo.IconName"));
		productInfo.setReadonly(_ctx.booleanValue("QueryProductInfoResponse.ProductInfo.Readonly"));
		queryProductInfoResponse.setProductInfo(productInfo);
	 
	 	return queryProductInfoResponse;
	}
}