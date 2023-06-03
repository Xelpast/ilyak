
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		frame_2
	 *	@date 		Wednesday 24th of May 2023 08:10:40 AM
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

public class frame_2_activity extends Activity {

	
	private View _bg__frame_2_ek2;
	private View white_line_2;
	private ImageView top_background_3;
	private TextView create_account;
	private ImageView women1_1;
	private TextView your_email;
	private View rectangle_3;
	private TextView enter_your_email;
	private TextView your_password;
	private View rectangle_4;
	private TextView enter_your_password;
	private TextView repeat_password;
	private View rectangle_5;
	private TextView enter_your_password_again;
	private View rectangle_6;
	private TextView register;
	private ImageView circle_1;
	private TextView already_have_an_account__;
	private View rectangle_7;
	private TextView login;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.frame_2);

		
		_bg__frame_2_ek2 = (View) findViewById(R.id._bg__frame_2_ek2);
		white_line_2 = (View) findViewById(R.id.white_line_2);
		top_background_3 = (ImageView) findViewById(R.id.top_background_3);
		create_account = (TextView) findViewById(R.id.create_account);
		women1_1 = (ImageView) findViewById(R.id.women1_1);
		your_email = (TextView) findViewById(R.id.your_email);
		rectangle_3 = (View) findViewById(R.id.rectangle_3);
		enter_your_email = (TextView) findViewById(R.id.enter_your_email);
		your_password = (TextView) findViewById(R.id.your_password);
		rectangle_4 = (View) findViewById(R.id.rectangle_4);
		enter_your_password = (TextView) findViewById(R.id.enter_your_password);
		repeat_password = (TextView) findViewById(R.id.repeat_password);
		rectangle_5 = (View) findViewById(R.id.rectangle_5);
		enter_your_password_again = (TextView) findViewById(R.id.enter_your_password_again);
		rectangle_6 = (View) findViewById(R.id.rectangle_6);
		register = (TextView) findViewById(R.id.register);
		circle_1 = (ImageView) findViewById(R.id.circle_1);
		already_have_an_account__ = (TextView) findViewById(R.id.already_have_an_account__);
		rectangle_7 = (View) findViewById(R.id.rectangle_7);
		login = (TextView) findViewById(R.id.login);

		rectangle_7.setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View view) {
						Intent intent2 = new Intent("com.example.ilyak.frame_3_activity");
						startActivity(intent2);

					}
				}
		);
		
		//custom code goes here
	
	}
}
	
	