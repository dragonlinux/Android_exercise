package com.example.thread;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		RelativeLayout layout = new RelativeLayout(getApplicationContext());
		setContentView(R.layout.activity_main);

		testactivity tt = new testactivity(MainActivity.this);
		tt.test_function();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
