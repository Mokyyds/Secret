package com.jikexueyuan.seacret;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.jikexueyuan.seacret.atys.AtyLogin;
import com.jikexueyuan.seacret.atys.AtyTimeLine;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String token = Config.getCacheToken(this);
        if (token != null) {
			Intent intent = new Intent(this, AtyTimeLine.class);
			intent.putExtra(Config.KEY_TOKEN, token);
			startActivity(intent);
		}else {
			startActivity(new Intent(this, AtyLogin.class));
		}
        finish();
    }
}
