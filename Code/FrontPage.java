package com.example.cutepokemonsound;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class FrontPage extends Activity{
	
	MediaPlayer OpeningMusic;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.logo);
		OpeningMusic = MediaPlayer.create(FrontPage.this, R.raw.pikasound);
		OpeningMusic.start();
		
		Thread timer = new Thread(){
			public void run(){
				try {
					sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally{
					Intent nextpage = new Intent("com.example.cutepokemonsound.POKEMONTABS");
					startActivity(nextpage);
					
				}
			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		OpeningMusic.release();
		finish();
	}

}
