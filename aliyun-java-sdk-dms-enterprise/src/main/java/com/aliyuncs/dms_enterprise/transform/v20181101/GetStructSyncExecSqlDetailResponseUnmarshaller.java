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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.GetStructSyncExecSqlDetailResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetStructSyncExecSqlDetailResponse.StructSyncExecSqlDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStructSyncExecSqlDetailResponseUnmarshaller {

	public static GetStructSyncExecSqlDetailResponse unmarshall(GetStructSyncExecSqlDetailResponse getStructSyncExecSqlDetailResponse, UnmarshallerContext _ctx) {
		
		getStructSyncExecSqlDetailResponse.setRequestId(_ctx.stringValue("GetStructSyncExecSqlDetailResponse.RequestId"));
		getStructSyncExecSqlDetailResponse.setErrorCode(_ctx.stringValue("GetStructSyncExecSqlDetailResponse.ErrorCode"));
		getStructSyncExecSqlDetailResponse.setErrorMessage(_ctx.stringValue("GetStructSyncExecSqlDetailResponse.ErrorMessage"));
		getStructSyncExecSqlDetailResponse.setSuccess(_ctx.booleanValue("GetStructSyncExecSqlDetailResponse.Success"));

		StructSyncExecSqlDetail structSyncExecSqlDetail = new StructSyncExecSqlDetail();
		structSyncExecSqlDetail.setExecSql(_ctx.stringValue("GetStructSyncExecSqlDetailResponse.StructSyncExecSqlDetail.ExecSql"));
		structSyncExecSqlDetail.setTotalSqlCount(_ctx.longValue("GetStructSyncExecSqlDetailResponse.StructSyncExecSqlDetail.TotalSqlCount"));
		getStructSyncExecSqlDetailResponse.setStructSyncExecSqlDetail(structSyncExecSqlDetail);
	 
	 	return getStructSyncExecSqlDetailResponse;
	}
}