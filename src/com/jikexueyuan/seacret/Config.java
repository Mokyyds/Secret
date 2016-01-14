package com.jikexueyuan.seacret;

import android.R.string;
import android.content.Context;
import android.content.SharedPreferences.Editor;

public class Config {
	
	final static String KEY_TOKEN = "token"; 
	final static String APP_ID = "com.jikexueyuan.seacret"; 
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
