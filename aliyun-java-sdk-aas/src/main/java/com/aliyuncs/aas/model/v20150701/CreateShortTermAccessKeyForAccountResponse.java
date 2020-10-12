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

package com.aliyuncs.aas.model.v20150701;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.aas.transform.v20150701.CreateShortTermAccessKeyForAccountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateShortTermAccessKeyForAccountResponse extends AcsResponse {

	private String requestId;

	private String pK;

	private AccessKey accessKey;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPK() {
		return this.pK;
	}

	public void setPK(String pK) {
		this.pK = pK;
	}

	public AccessKey getAccessKey() {
		return this.accessKey;
	}

	public void setAccessKey(AccessKey accessKey) {
		this.accessKey = accessKey;
	}

	public static class AccessKey {

		private String createTime;

		private String accessKeyId;

		private String accessKeySecret;

		private String accessKeyStatus;

		private String accessKeyType;

		private String expireTime;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getAccessKeyId() {
			return this.accessKeyId;
		}

		public void setAccessKeyId(String accessKeyId) {
			this.accessKeyId = accessKeyId;
		}

		public String getAccessKeySecret() {
			return this.accessKeySecret;
		}

		public void setAccessKeySecret(String accessKeySecret) {
			this.accessKeySecret = accessKeySecret;
		}

		public String getAccessKeyStatus() {
			return this.accessKeyStatus;
		}

		public void setAccessKeyStatus(String accessKeyStatus) {
			this.accessKeyStatus = accessKeyStatus;
		}

		public String getAccessKeyType() {
			return this.accessKeyType;
		}

		public void setAccessKeyType(String accessKeyType) {
			this.accessKeyType = accessKeyType;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}
	}

	@Override
	public CreateShortTermAccessKeyForAccountResponse getInstance(UnmarshallerContext context) {
		return	CreateShortTermAccessKeyForAccountResponseUnmarshaller.unmarshall(this, context);
	}
}
