package com.jikexueyuan.seacret.net;

import org.json.JSONException;
import org.json.JSONObject;

import com.jikexueyuan.seacret.Config;

public class GetCode {
	public GetCode(String phone,final HttpCallbackListener listener) {
		new NetConnection(Config.SERVER_URL,HttpMethod.POST, new HttpCallbackListener() {
			
			@Override
			public void onFinish(String result) {
				try {
					JSONObject jsonObj = new JSONObject(result);
					int code_result = jsonObj.getInt(Config.KEY_STATUS);
					switch (code_result) {
					case Config.RESULT_STATUS_SUCCESS:
						
						break;

					default:
						if (listener != null) {
							listener.onError();
						}
						break;
					}
					if (listener != null) {
						
						listener.onFinish(Integer.toString(code_result));
					}
				} catch (JSONException e) {
					e.printStackTrace();
					if ( listener != null) {
						listener.onError();
					}
				}
			}
			@Override
			public void onError() {
				if (listener != null) {
					listener.onError();
				}
			}
		}, Config.KEY_ACTION,Config.ACTION_GET_CODE,Config.KEY_PHONE,phone);
	}
}
