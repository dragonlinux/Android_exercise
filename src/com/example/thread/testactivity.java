package com.example.thread;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class testactivity {

	private Activity _parentActivity;

	private TextView t1;
	private Button btest;
	private Button jump1;
	private Button jump2;
	private RelativeLayout _layout;

	public testactivity(Activity parentActivity) {
		_parentActivity = parentActivity;

		initView();

	}

	private void initView() {
		t1 = (TextView) _parentActivity.findViewById(R.id.textView1);
		btest = (Button) _parentActivity.findViewById(R.id.button1);
		jump1 = (Button) _parentActivity.findViewById(R.id.button2);
		jump2 = (Button) _parentActivity.findViewById(R.id.button3);

		btest.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				t1.setText("I am fine");
				System.out.println("testactivity");
				// jump2.setEnabled(false);
				ViewGroup layout = (ViewGroup) jump2.getParent();
				layout.removeView(jump2);
				layout = (ViewGroup) jump1.getParent();
				layout.removeView(jump1);
			}
		});
		jump1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(_parentActivity, secondActivity.class);
				_parentActivity.startActivity(intent);
			}
		});
		jump2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(_parentActivity, ThirdActivity.class);
				_parentActivity.startActivity(intent);
			}
		});
	}

	public void test_function() {
		System.out.println("fjskdjfkjdfk");
	}

}
