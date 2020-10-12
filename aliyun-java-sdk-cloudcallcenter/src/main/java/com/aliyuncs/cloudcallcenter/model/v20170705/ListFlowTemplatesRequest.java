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

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListFlowTemplatesRequest extends RpcAcsRequest<ListFlowTemplatesResponse> {
	
	public ListFlowTemplatesRequest() {
		super("CloudCallCenter", "2017-07-05", "ListFlowTemplates", "CloudCallCenter", "innerAPI");
	}

	private Integer flowTemplatesType;

	private Integer pageSize;

	private String nameKeyword;

	private Integer pageNumber;

	public Integer getFlowTemplatesType() {
		return this.flowTemplatesType;
	}

	public void setFlowTemplatesType(Integer flowTemplatesType) {
		this.flowTemplatesType = flowTemplatesType;
		if(flowTemplatesType != null){
			putQueryParameter("FlowTemplatesType", flowTemplatesType.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getNameKeyword() {
		return this.nameKeyword;
	}

	public void setNameKeyword(String nameKeyword) {
		this.nameKeyword = nameKeyword;
		if(nameKeyword != null){
			putQueryParameter("NameKeyword", nameKeyword);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	@Override
	public Class<ListFlowTemplatesResponse> getResponseClass() {
		return ListFlowTemplatesResponse.class;
	}

}
