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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.ListStrategiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListStrategiesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<Strategy> strategies;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<Strategy> getStrategies() {
		return this.strategies;
	}

	public void setStrategies(List<Strategy> strategies) {
		this.strategies = strategies;
	}

	public static class Strategy {

		private String strategyId;

		private String strategyName;

		private String strategyDescription;

		private String type;

		private Long startTime;

		private Long endTime;

		private String repeatBy;

		private Integer maxAttemptsPerDay;

		private Integer minAttemptInterval;

		private String customized;

		private String routingStrategy;

		private String followUpStrategy;

		private Boolean isTemplate;

		private List<TimeFrame> workingTime;

		private List<String> repeatDays;

		public String getStrategyId() {
			return this.strategyId;
		}

		public void setStrategyId(String strategyId) {
			this.strategyId = strategyId;
		}

		public String getStrategyName() {
			return this.strategyName;
		}

		public void setStrategyName(String strategyName) {
			this.strategyName = strategyName;
		}

		public String getStrategyDescription() {
			return this.strategyDescription;
		}

		public void setStrategyDescription(String strategyDescription) {
			this.strategyDescription = strategyDescription;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getRepeatBy() {
			return this.repeatBy;
		}

		public void setRepeatBy(String repeatBy) {
			this.repeatBy = repeatBy;
		}

		public Integer getMaxAttemptsPerDay() {
			return this.maxAttemptsPerDay;
		}

		public void setMaxAttemptsPerDay(Integer maxAttemptsPerDay) {
			this.maxAttemptsPerDay = maxAttemptsPerDay;
		}

		public Integer getMinAttemptInterval() {
			return this.minAttemptInterval;
		}

		public void setMinAttemptInterval(Integer minAttemptInterval) {
			this.minAttemptInterval = minAttemptInterval;
		}

		public String getCustomized() {
			return this.customized;
		}

		public void setCustomized(String customized) {
			this.customized = customized;
		}

		public String getRoutingStrategy() {
			return this.routingStrategy;
		}

		public void setRoutingStrategy(String routingStrategy) {
			this.routingStrategy = routingStrategy;
		}

		public String getFollowUpStrategy() {
			return this.followUpStrategy;
		}

		public void setFollowUpStrategy(String followUpStrategy) {
			this.followUpStrategy = followUpStrategy;
		}

		public Boolean getIsTemplate() {
			return this.isTemplate;
		}

		public void setIsTemplate(Boolean isTemplate) {
			this.isTemplate = isTemplate;
		}

		public List<TimeFrame> getWorkingTime() {
			return this.workingTime;
		}

		public void setWorkingTime(List<TimeFrame> workingTime) {
			this.workingTime = workingTime;
		}

		public List<String> getRepeatDays() {
			return this.repeatDays;
		}

		public void setRepeatDays(List<String> repeatDays) {
			this.repeatDays = repeatDays;
		}

		public static class TimeFrame {

			private String beginTime;

			private String endTime;

			public String getBeginTime() {
				return this.beginTime;
			}

			public void setBeginTime(String beginTime) {
				this.beginTime = beginTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}
		}
	}

	@Override
	public ListStrategiesResponse getInstance(UnmarshallerContext context) {
		return	ListStrategiesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
