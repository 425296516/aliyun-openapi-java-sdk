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

package com.aliyuncs.industry_brain.model.v20180712;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.industry_brain.transform.v20180712.GetDataPropertiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDataPropertiesResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String property;

		private String variableType;

		private String selectieFilter;

		public String getProperty() {
			return this.property;
		}

		public void setProperty(String property) {
			this.property = property;
		}

		public String getVariableType() {
			return this.variableType;
		}

		public void setVariableType(String variableType) {
			this.variableType = variableType;
		}

		public String getSelectieFilter() {
			return this.selectieFilter;
		}

		public void setSelectieFilter(String selectieFilter) {
			this.selectieFilter = selectieFilter;
		}
	}

	@Override
	public GetDataPropertiesResponse getInstance(UnmarshallerContext context) {
		return	GetDataPropertiesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
