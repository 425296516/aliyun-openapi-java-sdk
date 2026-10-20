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

package com.aliyuncs.cloudesl.model.v20200201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudesl.transform.v20200201.DescribeStoreConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStoreConfigResponse extends AcsResponse {

	private String requestId;

	private String errorMessage;

	private Boolean success;

	private String errorCode;

	private String code;

	private String message;

	private String dynamicMessage;

	private String dynamicCode;

	private StoreConfigInfo storeConfigInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public StoreConfigInfo getStoreConfigInfo() {
		return this.storeConfigInfo;
	}

	public void setStoreConfigInfo(StoreConfigInfo storeConfigInfo) {
		this.storeConfigInfo = storeConfigInfo;
	}

	public static class StoreConfigInfo {

		private String storeId;

		private Boolean enableNotification;

		private String notificationWebHook;

		private String notificationSilentTimes;

		private List<SubscribeContent> subscribeContents;

		public String getStoreId() {
			return this.storeId;
		}

		public void setStoreId(String storeId) {
			this.storeId = storeId;
		}

		public Boolean getEnableNotification() {
			return this.enableNotification;
		}

		public void setEnableNotification(Boolean enableNotification) {
			this.enableNotification = enableNotification;
		}

		public String getNotificationWebHook() {
			return this.notificationWebHook;
		}

		public void setNotificationWebHook(String notificationWebHook) {
			this.notificationWebHook = notificationWebHook;
		}

		public String getNotificationSilentTimes() {
			return this.notificationSilentTimes;
		}

		public void setNotificationSilentTimes(String notificationSilentTimes) {
			this.notificationSilentTimes = notificationSilentTimes;
		}

		public List<SubscribeContent> getSubscribeContents() {
			return this.subscribeContents;
		}

		public void setSubscribeContents(List<SubscribeContent> subscribeContents) {
			this.subscribeContents = subscribeContents;
		}

		public static class SubscribeContent {

			private String category;

			private Boolean enable;

			private String threshold;

			private Boolean atAll;

			private String atMobileList;

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public Boolean getEnable() {
				return this.enable;
			}

			public void setEnable(Boolean enable) {
				this.enable = enable;
			}

			public String getThreshold() {
				return this.threshold;
			}

			public void setThreshold(String threshold) {
				this.threshold = threshold;
			}

			public Boolean getAtAll() {
				return this.atAll;
			}

			public void setAtAll(Boolean atAll) {
				this.atAll = atAll;
			}

			public String getAtMobileList() {
				return this.atMobileList;
			}

			public void setAtMobileList(String atMobileList) {
				this.atMobileList = atMobileList;
			}
		}
	}

	@Override
	public DescribeStoreConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeStoreConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
