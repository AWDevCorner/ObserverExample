package it.androidworld.devcorner.observerexample;

import java.util.Observable;
import android.os.Handler;
import android.util.Log;

public class MyObserverClass extends Observable
{
	final Handler handler = new Handler();
	
	public MyObserverClass()
	{
		createTost();

	}
	
	private void createTost() 
	{
		handler.postDelayed(new Runnable() {
			  @Override
			  public void run() {
			    //Do something after 100ms
	
					triggerObservers();
			  }
			}, 5000);	
		
	}
	
	 private void triggerObservers() 
	 {
	        setChanged();
	        notifyObservers("Un saluto a tutti i lettori di AndroidWorld");
	  }
}
	
