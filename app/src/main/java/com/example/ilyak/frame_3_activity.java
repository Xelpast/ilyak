
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		frame_3
	 *	@date 		Wednesday 24th of May 2023 09:25:48 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.ilyak;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class frame_3_activity extends Activity {

	
	private View _bg__frame_3_ek2;
	private ImageView top_background_3;
	private TextView login_to__your_account;
	private TextView your_email;
	private View rectangle_3;
	private TextView enter_your_email;
	private TextView your_password;
	private TextView forget_password__;
	private View rectangle_4;
	private TextView enter_your_password;
	private View rectangle_6;
	private TextView register;
	private ImageView circle_1;
	private View rectangle_7;
	private TextView don_t_have_an_account___register_;
	private ImageView women2_1;
	private ImageView facebook_1;
	private ImageView google_1;
	private ImageView twitter_1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.frame_3);

		
		_bg__frame_3_ek2 = (View) findViewById(R.id._bg__frame_3_ek2);
		top_background_3 = (ImageView) findViewById(R.id.top_background_3);
		login_to__your_account = (TextView) findViewById(R.id.login_to__your_account);
		your_email = (TextView) findViewById(R.id.your_email);
		rectangle_3 = (View) findViewById(R.id.rectangle_3);
		enter_your_email = (TextView) findViewById(R.id.enter_your_email);
		your_password = (TextView) findViewById(R.id.your_password);
		forget_password__ = (TextView) findViewById(R.id.forget_password__);
		rectangle_4 = (View) findViewById(R.id.rectangle_4);
		enter_your_password = (TextView) findViewById(R.id.enter_your_password);
		rectangle_6 = (View) findViewById(R.id.rectangle_6);
		register = (TextView) findViewById(R.id.register);
		circle_1 = (ImageView) findViewById(R.id.circle_1);
		rectangle_7 = (View) findViewById(R.id.rectangle_7);
		don_t_have_an_account___register_ = (TextView) findViewById(R.id.don_t_have_an_account___register_);
		women2_1 = (ImageView) findViewById(R.id.women2_1);
		facebook_1 = (ImageView) findViewById(R.id.facebook_1);
		google_1 = (ImageView) findViewById(R.id.google_1);
		twitter_1 = (ImageView) findViewById(R.id.twitter_1);

		rectangle_7.setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View view) {
						Intent intent2 = new Intent("com.example.ilyak.frame_2_activity");
						startActivity(intent2);

					}
				}
		);
		
		//custom code goes here

	}
}
	
	