
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		main
	 *	@date 		0
	 *	@title 		main
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.2.9.xd
	 *
	 */
	

package exportkit.xd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

	public class main_activity extends Activity {

	Timer timer;
	private View _bg__main_ek2;
	private TextView medicamento;
	private TextView commercium;
	private ImageView logo1111;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		
		_bg__main_ek2 = (View) findViewById(R.id._bg__main_ek2);
		medicamento = (TextView) findViewById(R.id.medicamento);
		commercium = (TextView) findViewById(R.id.commercium);
		logo1111 = (ImageView) findViewById(R.id.logo1111);
	
		
		//custom code goes here
		timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				Intent intent = new Intent(main_activity.this, login_activity.class);
				startActivity(intent);
				finish();
			}
		}, 5000);


	}
}
	
	