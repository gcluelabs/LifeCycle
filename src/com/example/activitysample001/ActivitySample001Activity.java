package com.example.activitysample001;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class ActivitySample001Activity extends Activity {

	@Override
	public void onCreate( Bundle savedInstanceState ) {
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_activity_sample001 );

		Log.i( "ACTIVITY", "onCreate()" );
	}

	@Override
	public void onStart() {
		super.onStart();

		Log.i( "ACTIVITY", "onStart()" );
	}

	@Override
	public void onResume() {
		super.onResume();

		Log.i( "ACTIVITY", "onResume()" );
	}

	@Override
	public void onPause() {
		super.onPause();

		Log.i( "ACTIVITY", "onPause()" );
	}

	@Override
	public void onStop() {
		super.onStop();

		Log.i( "ACTIVITY", "onStop()" );
	}

	@Override
	public void onRestart() {
		super.onRestart();

		Log.i( "ACTIVITY", "onRestart()" );
	}

	@Override
	public void onDestroy() {
		super.onDestroy();

		Log.i( "ACTIVITY", "onDestroy()" );
	}
}