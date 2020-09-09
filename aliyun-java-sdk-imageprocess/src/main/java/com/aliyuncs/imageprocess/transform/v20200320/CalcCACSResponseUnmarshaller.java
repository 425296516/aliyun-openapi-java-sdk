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

package com.aliyuncs.imageprocess.transform.v20200320;

import com.aliyuncs.imageprocess.model.v20200320.CalcCACSResponse;
import com.aliyuncs.imageprocess.model.v20200320.CalcCACSResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CalcCACSResponseUnmarshaller {

	public static CalcCACSResponse unmarshall(CalcCACSResponse calcCACSResponse, UnmarshallerContext _ctx) {
		
		calcCACSResponse.setRequestId(_ctx.stringValue("CalcCACSResponse.RequestId"));

		Data data = new Data();
		data.setScore(_ctx.stringValue("CalcCACSResponse.Data.Score"));
		calcCACSResponse.setData(data);
	 
	 	return calcCACSResponse;
	}
}