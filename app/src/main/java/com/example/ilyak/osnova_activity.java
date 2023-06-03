
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		osnova
	 *	@date 		Tuesday 23rd of May 2023 08:48:46 AM
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

public class osnova_activity extends Activity {

	
	private View _bg__osnova_ek2;
	private ImageView background_intro_2;
	private ImageView top_background_2;
	private ImageView white_line_2;
	private ImageView women_2;
	private TextView download_all_the_designs_resours_available_on_the_uilover_channel_for_free;
	private TextView welcom_back_to_your_app;
	private View rectangle_4;
	private TextView signup;
	private View rectangle_3;
	private TextView login;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.osnova);

		
		_bg__osnova_ek2 = (View) findViewById(R.id._bg__osnova_ek2);
		background_intro_2 = (ImageView) findViewById(R.id.background_intro_2);
		top_background_2 = (ImageView) findViewById(R.id.top_background_2);
		white_line_2 = (ImageView) findViewById(R.id.white_line_2);
		women_2 = (ImageView) findViewById(R.id.women_2);
		download_all_the_designs_resours_available_on_the_uilover_channel_for_free = (TextView) findViewById(R.id.download_all_the_designs_resours_available_on_the_uilover_channel_for_free);
		welcom_back_to_your_app = (TextView) findViewById(R.id.welcom_back_to_your_app);
		rectangle_4 = (View) findViewById(R.id.rectangle_4);
		signup = (TextView) findViewById(R.id.signup);
		rectangle_3 = (View) findViewById(R.id.rectangle_3);
		login = (TextView) findViewById(R.id.login);

		rectangle_3.setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View view) {
						Intent intent = new Intent("com.example.ilyak.frame_3_activity");
						startActivity(intent);

					}
				}
		);

		rectangle_4.setOnClickListener(
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
	
	