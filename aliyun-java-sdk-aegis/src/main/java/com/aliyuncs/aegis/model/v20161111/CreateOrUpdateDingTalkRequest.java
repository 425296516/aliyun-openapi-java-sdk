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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateOrUpdateDingTalkRequest extends RpcAcsRequest<CreateOrUpdateDingTalkResponse> {
	
	public CreateOrUpdateDingTalkRequest() {
		super("aegis", "2016-11-11", "CreateOrUpdateDingTalk", "vipaegis");
	}

	private String ruleActionName;

	private String sendUrl;

	private Long id;

	private Long intervalTime;

	public String getRuleActionName() {
		return this.ruleActionName;
	}

	public void setRuleActionName(String ruleActionName) {
		this.ruleActionName = ruleActionName;
		if(ruleActionName != null){
			putQueryParameter("RuleActionName", ruleActionName);
		}
	}

	public String getSendUrl() {
		return this.sendUrl;
	}

	public void setSendUrl(String sendUrl) {
		this.sendUrl = sendUrl;
		if(sendUrl != null){
			putQueryParameter("SendUrl", sendUrl);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public Long getIntervalTime() {
		return this.intervalTime;
	}

	public void setIntervalTime(Long intervalTime) {
		this.intervalTime = intervalTime;
		if(intervalTime != null){
			putQueryParameter("IntervalTime", intervalTime.toString());
		}
	}

	@Override
	public Class<CreateOrUpdateDingTalkResponse> getResponseClass() {
		return CreateOrUpdateDingTalkResponse.class;
	}

}
