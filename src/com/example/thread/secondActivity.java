package com.example.thread;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;

public class secondActivity extends Activity {
	private Handler handler;
	private ProgressBar progressBar;
	private Button b1;

	public secondActivity() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		handler = new Handler();
		progressBar = (ProgressBar) findViewById(R.id.progressBar1);
		b1 = (Button) findViewById(R.id.button1);
		b1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startProgress(v);
			}
		});
	}

	public void startProgress(View view) {

		new Thread(new Task()).start();
	}

	class Task implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i <= 20; i++) {
				final int value = i;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				handler.post(new Runnable() {
					@Override
					public void run() {
						progressBar.setProgress(value);
					}
				});
			}
		}
	}

}
