package com.jikexueyuan.seacret;

import android.R.string;
import android.content.Context;
import android.content.SharedPreferences.Editor;

public class Config {
	public static final String SERVER_URL = "http://www.iot.ia.cn";
	public static final String ACTION_GET_CODE = "send_pass";
	public static final String KEY_ACTION = "action";
	public static final String KEY_PHONE = "phone";
	public final static String KEY_TOKEN = "token";
	public final static String KEY_STATUS = "status";
	public final static int RESULT_STATUS_SUCCESS = 1;
	public final static int RESULT_STATUS_FAIL = 0;
	public final static int RESULT_STATUS_INVALID_TOKEN = 2;
	
	public final static String APP_ID = "com.jikexueyuan.seacret"; 
	public final static String CHARSET = "utf-8";
	public static String getCacheToken(Context context)
	{
		return context.getSharedPreferences(APP_ID, context.MODE_PRIVATE).getString(KEY_TOKEN, null);
		
	}
	
	public static void CacheToken(Context context,String tonken)
	{
		Editor editor = context.getSharedPreferences(APP_ID, context.MODE_PRIVATE).edit();
		editor.putString(KEY_TOKEN, tonken);
		editor.commit();
		
	}
}
