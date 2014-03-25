package it.androidworld.devcorner.observerexample;

import java.util.Observable;
import java.util.Observer;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements Observer, OnClickListener{
	
	Button start;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		start = (Button) findViewById(R.id.start);
		start.setOnClickListener(this);
		
	}
	
	@Override
	public void onClick(View v) {
		if(v.getId()==start.getId())
		{
			MyObserverClass myObserver = new MyObserverClass();
			myObserver.addObserver(this);
		}
		
	}

	@Override
	public void update(Observable observable, Object data) 
	{
		String s = (String) data;
		Toast.makeText(this, s, Toast.LENGTH_LONG).show();
		Log.e("APP", "metodo show");
	}

	


}
