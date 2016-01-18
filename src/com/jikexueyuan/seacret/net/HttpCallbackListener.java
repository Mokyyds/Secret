package com.jikexueyuan.seacret.net;

public interface HttpCallbackListener {
	void onFinish(String response);
	void onError();
}
