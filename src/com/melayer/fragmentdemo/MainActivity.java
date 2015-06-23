package com.melayer.fragmentdemo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		FragmentManager manager = getSupportFragmentManager();
		FragmentTransaction txn = manager.beginTransaction();
		// txn.replace(R.id.frameContainer, new MyFragment());

		txn.replace(R.id.frameContainer, MyFragment.getInstance("Hello"));
		
		txn.commit();
	}
}
