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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateLinkeantcodeAntcodeUpdatecommitnoteRequest extends RpcAcsRequest<UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse> {
	   

	private String note;

	private String noteId;

	private String id;

	private String state;

	private List<String> labelsRepeatLists;

	private String requestGitOperate;

	private String sha;
	public UpdateLinkeantcodeAntcodeUpdatecommitnoteRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkeantcodeAntcodeUpdatecommitnote", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
		if(note != null){
			putBodyParameter("Note", note);
		}
	}

	public String getNoteId() {
		return this.noteId;
	}

	public void setNoteId(String noteId) {
		this.noteId = noteId;
		if(noteId != null){
			putBodyParameter("NoteId", noteId);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		if(state != null){
			putBodyParameter("State", state);
		}
	}

	public List<String> getLabelsRepeatLists() {
		return this.labelsRepeatLists;
	}

	public void setLabelsRepeatLists(List<String> labelsRepeatLists) {
		this.labelsRepeatLists = labelsRepeatLists;	
		if (labelsRepeatLists != null) {
			for (int i = 0; i < labelsRepeatLists.size(); i++) {
				putBodyParameter("LabelsRepeatList." + (i + 1) , labelsRepeatLists.get(i));
			}
		}	
	}

	public String getRequestGitOperate() {
		return this.requestGitOperate;
	}

	public void setRequestGitOperate(String requestGitOperate) {
		this.requestGitOperate = requestGitOperate;
		if(requestGitOperate != null){
			putBodyParameter("RequestGitOperate", requestGitOperate);
		}
	}

	public String getSha() {
		return this.sha;
	}

	public void setSha(String sha) {
		this.sha = sha;
		if(sha != null){
			putBodyParameter("Sha", sha);
		}
	}

	@Override
	public Class<UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse> getResponseClass() {
		return UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.class;
	}

}
