package com.djnil.sanskriti2014;


import android.app.Activity;
import android.os.Bundle;

public class Options extends Activity {
	
	protected void onCreate(Bundle savedInstanceState)
	{
		overridePendingTransition(R.anim.from_middle, R.anim.to_middle);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_options);
	}

}
