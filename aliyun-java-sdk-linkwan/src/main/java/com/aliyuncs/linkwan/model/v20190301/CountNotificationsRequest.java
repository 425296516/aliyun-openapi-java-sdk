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

package com.aliyuncs.linkwan.model.v20190301;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkwan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CountNotificationsRequest extends RpcAcsRequest<CountNotificationsResponse> {
	   

	private Long endMillis;

	private String handleState;

	private List<String> categorys;

	private Long beginMillis;
	public CountNotificationsRequest() {
		super("LinkWAN", "2019-03-01", "CountNotifications", "linkwan");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getEndMillis() {
		return this.endMillis;
	}

	public void setEndMillis(Long endMillis) {
		this.endMillis = endMillis;
		if(endMillis != null){
			putQueryParameter("EndMillis", endMillis.toString());
		}
	}

	public String getHandleState() {
		return this.handleState;
	}

	public void setHandleState(String handleState) {
		this.handleState = handleState;
		if(handleState != null){
			putQueryParameter("HandleState", handleState);
		}
	}

	public List<String> getCategorys() {
		return this.categorys;
	}

	public void setCategorys(List<String> categorys) {
		this.categorys = categorys;	
		if (categorys != null) {
			for (int i = 0; i < categorys.size(); i++) {
				putQueryParameter("Category." + (i + 1) , categorys.get(i));
			}
		}	
	}

	public Long getBeginMillis() {
		return this.beginMillis;
	}

	public void setBeginMillis(Long beginMillis) {
		this.beginMillis = beginMillis;
		if(beginMillis != null){
			putQueryParameter("BeginMillis", beginMillis.toString());
		}
	}

	@Override
	public Class<CountNotificationsResponse> getResponseClass() {
		return CountNotificationsResponse.class;
	}

}
