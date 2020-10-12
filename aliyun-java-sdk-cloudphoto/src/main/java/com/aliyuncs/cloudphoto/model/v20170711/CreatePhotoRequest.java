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

package com.aliyuncs.cloudphoto.model.v20170711;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class CreatePhotoRequest extends RpcAcsRequest<CreatePhotoResponse> {
	
	public CreatePhotoRequest() {
		super("CloudPhoto", "2017-07-11", "CreatePhoto", "cloudphoto");
		setProtocol(ProtocolType.HTTPS);
	}

	private Long takenAt;

	private String photoTitle;

	private String libraryId;

	private Long shareExpireTime;

	private String storeName;

	private String uploadType;

	private String remark;

	private String sessionId;

	private String staging;

	private String fileId;

	public Long getTakenAt() {
		return this.takenAt;
	}

	public void setTakenAt(Long takenAt) {
		this.takenAt = takenAt;
		if(takenAt != null){
			putQueryParameter("TakenAt", takenAt.toString());
		}
	}

	public String getPhotoTitle() {
		return this.photoTitle;
	}

	public void setPhotoTitle(String photoTitle) {
		this.photoTitle = photoTitle;
		if(photoTitle != null){
			putQueryParameter("PhotoTitle", photoTitle);
		}
	}

	public String getLibraryId() {
		return this.libraryId;
	}

	public void setLibraryId(String libraryId) {
		this.libraryId = libraryId;
		if(libraryId != null){
			putQueryParameter("LibraryId", libraryId);
		}
	}

	public Long getShareExpireTime() {
		return this.shareExpireTime;
	}

	public void setShareExpireTime(Long shareExpireTime) {
		this.shareExpireTime = shareExpireTime;
		if(shareExpireTime != null){
			putQueryParameter("ShareExpireTime", shareExpireTime.toString());
		}
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
		if(storeName != null){
			putQueryParameter("StoreName", storeName);
		}
	}

	public String getUploadType() {
		return this.uploadType;
	}

	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
		if(uploadType != null){
			putQueryParameter("UploadType", uploadType);
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
		if(sessionId != null){
			putQueryParameter("SessionId", sessionId);
		}
	}

	public String getStaging() {
		return this.staging;
	}

	public void setStaging(String staging) {
		this.staging = staging;
		if(staging != null){
			putQueryParameter("Staging", staging);
		}
	}

	public String getFileId() {
		return this.fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
		if(fileId != null){
			putQueryParameter("FileId", fileId);
		}
	}

	@Override
	public Class<CreatePhotoResponse> getResponseClass() {
		return CreatePhotoResponse.class;
	}

}
