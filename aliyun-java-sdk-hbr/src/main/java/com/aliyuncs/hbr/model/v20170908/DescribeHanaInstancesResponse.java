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

package com.aliyuncs.hbr.model.v20170908;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbr.transform.v20170908.DescribeHanaInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHanaInstancesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<Hana> hanas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Hana> getHanas() {
		return this.hanas;
	}

	public void setHanas(List<Hana> hanas) {
		this.hanas = hanas;
	}

	public static class Hana {

		private String clusterId;

		private String hanaName;

		private String vaultId;

		private String host;

		private Integer instanceNumber;

		private String userName;

		private Boolean useSsl;

		private Boolean validateCertificate;

		private String alertSetting;

		private String contactId;

		private Long status;

		private String statusMessage;

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getHanaName() {
			return this.hanaName;
		}

		public void setHanaName(String hanaName) {
			this.hanaName = hanaName;
		}

		public String getVaultId() {
			return this.vaultId;
		}

		public void setVaultId(String vaultId) {
			this.vaultId = vaultId;
		}

		public String getHost() {
			return this.host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public Integer getInstanceNumber() {
			return this.instanceNumber;
		}

		public void setInstanceNumber(Integer instanceNumber) {
			this.instanceNumber = instanceNumber;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Boolean getUseSsl() {
			return this.useSsl;
		}

		public void setUseSsl(Boolean useSsl) {
			this.useSsl = useSsl;
		}

		public Boolean getValidateCertificate() {
			return this.validateCertificate;
		}

		public void setValidateCertificate(Boolean validateCertificate) {
			this.validateCertificate = validateCertificate;
		}

		public String getAlertSetting() {
			return this.alertSetting;
		}

		public void setAlertSetting(String alertSetting) {
			this.alertSetting = alertSetting;
		}

		public String getContactId() {
			return this.contactId;
		}

		public void setContactId(String contactId) {
			this.contactId = contactId;
		}

		public Long getStatus() {
			return this.status;
		}

		public void setStatus(Long status) {
			this.status = status;
		}

		public String getStatusMessage() {
			return this.statusMessage;
		}

		public void setStatusMessage(String statusMessage) {
			this.statusMessage = statusMessage;
		}
	}

	@Override
	public DescribeHanaInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeHanaInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
