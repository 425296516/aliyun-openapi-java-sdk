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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ImportKeyPairRequest extends RpcAcsRequest<ImportKeyPairResponse> {
	   

	private String keyPairName;

	private String publicKeyBody;

	private String version;
	public ImportKeyPairRequest() {
		super("Ens", "2017-11-10", "ImportKeyPair", "ens");
		setMethod(MethodType.POST);
	}

	public String getKeyPairName() {
		return this.keyPairName;
	}

	public void setKeyPairName(String keyPairName) {
		this.keyPairName = keyPairName;
		if(keyPairName != null){
			putQueryParameter("KeyPairName", keyPairName);
		}
	}

	public String getPublicKeyBody() {
		return this.publicKeyBody;
	}

	public void setPublicKeyBody(String publicKeyBody) {
		this.publicKeyBody = publicKeyBody;
		if(publicKeyBody != null){
			putQueryParameter("PublicKeyBody", publicKeyBody);
		}
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
		if(version != null){
			putQueryParameter("Version", version);
		}
	}

	@Override
	public Class<ImportKeyPairResponse> getResponseClass() {
		return ImportKeyPairResponse.class;
	}

}
