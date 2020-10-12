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

package com.aliyuncs.vs.model.v20181212;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vs.transform.v20181212.DescribeGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGroupsResponse extends AcsResponse {

	private String requestId;

	private Long pageSize;

	private Long pageNum;

	private Long pageCount;

	private Long totalCount;

	private List<Group> groups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(Long pageCount) {
		this.pageCount = pageCount;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<Group> getGroups() {
		return this.groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public static class Group {

		private String id;

		private String aliasId;

		private String name;

		private String description;

		private String app;

		private String region;

		private String inProtocol;

		private String outProtocol;

		private Boolean enabled;

		private String status;

		private String createdTime;

		private String pushDomain;

		private String playDomain;

		private Boolean lazyPull;

		private String callback;

		private Integer captureInterval;

		private Integer captureImage;

		private Integer captureVideo;

		private String captureOssBucket;

		private String captureOssPath;

		private String gbId;

		private String gbIp;

		private Long gbPort;

		private List<String> gbUdpPorts;

		private List<String> gbTcpPorts;

		private Stats stats;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getAliasId() {
			return this.aliasId;
		}

		public void setAliasId(String aliasId) {
			this.aliasId = aliasId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getApp() {
			return this.app;
		}

		public void setApp(String app) {
			this.app = app;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getInProtocol() {
			return this.inProtocol;
		}

		public void setInProtocol(String inProtocol) {
			this.inProtocol = inProtocol;
		}

		public String getOutProtocol() {
			return this.outProtocol;
		}

		public void setOutProtocol(String outProtocol) {
			this.outProtocol = outProtocol;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getPushDomain() {
			return this.pushDomain;
		}

		public void setPushDomain(String pushDomain) {
			this.pushDomain = pushDomain;
		}

		public String getPlayDomain() {
			return this.playDomain;
		}

		public void setPlayDomain(String playDomain) {
			this.playDomain = playDomain;
		}

		public Boolean getLazyPull() {
			return this.lazyPull;
		}

		public void setLazyPull(Boolean lazyPull) {
			this.lazyPull = lazyPull;
		}

		public String getCallback() {
			return this.callback;
		}

		public void setCallback(String callback) {
			this.callback = callback;
		}

		public Integer getCaptureInterval() {
			return this.captureInterval;
		}

		public void setCaptureInterval(Integer captureInterval) {
			this.captureInterval = captureInterval;
		}

		public Integer getCaptureImage() {
			return this.captureImage;
		}

		public void setCaptureImage(Integer captureImage) {
			this.captureImage = captureImage;
		}

		public Integer getCaptureVideo() {
			return this.captureVideo;
		}

		public void setCaptureVideo(Integer captureVideo) {
			this.captureVideo = captureVideo;
		}

		public String getCaptureOssBucket() {
			return this.captureOssBucket;
		}

		public void setCaptureOssBucket(String captureOssBucket) {
			this.captureOssBucket = captureOssBucket;
		}

		public String getCaptureOssPath() {
			return this.captureOssPath;
		}

		public void setCaptureOssPath(String captureOssPath) {
			this.captureOssPath = captureOssPath;
		}

		public String getGbId() {
			return this.gbId;
		}

		public void setGbId(String gbId) {
			this.gbId = gbId;
		}

		public String getGbIp() {
			return this.gbIp;
		}

		public void setGbIp(String gbIp) {
			this.gbIp = gbIp;
		}

		public Long getGbPort() {
			return this.gbPort;
		}

		public void setGbPort(Long gbPort) {
			this.gbPort = gbPort;
		}

		public List<String> getGbUdpPorts() {
			return this.gbUdpPorts;
		}

		public void setGbUdpPorts(List<String> gbUdpPorts) {
			this.gbUdpPorts = gbUdpPorts;
		}

		public List<String> getGbTcpPorts() {
			return this.gbTcpPorts;
		}

		public void setGbTcpPorts(List<String> gbTcpPorts) {
			this.gbTcpPorts = gbTcpPorts;
		}

		public Stats getStats() {
			return this.stats;
		}

		public void setStats(Stats stats) {
			this.stats = stats;
		}

		public static class Stats {

			private Long deviceNum;

			private Long iedNum;

			private Long ipcNum;

			private Long platformNum;

			public Long getDeviceNum() {
				return this.deviceNum;
			}

			public void setDeviceNum(Long deviceNum) {
				this.deviceNum = deviceNum;
			}

			public Long getIedNum() {
				return this.iedNum;
			}

			public void setIedNum(Long iedNum) {
				this.iedNum = iedNum;
			}

			public Long getIpcNum() {
				return this.ipcNum;
			}

			public void setIpcNum(Long ipcNum) {
				this.ipcNum = ipcNum;
			}

			public Long getPlatformNum() {
				return this.platformNum;
			}

			public void setPlatformNum(Long platformNum) {
				this.platformNum = platformNum;
			}
		}
	}

	@Override
	public DescribeGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
