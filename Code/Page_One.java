package com.example.cutepokemonsound;

import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Page_One extends Activity implements OnClickListener {

	ImageButton ibPika;
	ImageButton ibBulba;
	ImageButton ibChar;
	ImageButton ibEkan;
	ImageButton ibHorse;
	ImageButton ibJigg;
	ImageButton ibPsy;
	ImageButton ibSqu;
	SoundPool sp;
	int pika, bulba, charm, ekan, horse, jigg, psy, squ ;
	int time = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page_one);
		setupImageButtons();
	}

	private void setupImageButtons() {
		// TODO Auto-generated method stub
		ibPika = (ImageButton) findViewById(R.id.ibPika);
		ibBulba = (ImageButton) findViewById(R.id.ibBulba);
		ibChar = (ImageButton) findViewById(R.id.ibChar);
		ibEkan = (ImageButton) findViewById(R.id.ibEkan);
		ibHorse = (ImageButton) findViewById(R.id.ibHorse);
		ibJigg = (ImageButton) findViewById(R.id.ibJiggly);
		ibPsy = (ImageButton) findViewById(R.id.ibPsy);
		ibSqu = (ImageButton) findViewById(R.id.ibSquirt);
		ibPika.setOnClickListener(this);
		ibBulba.setOnClickListener(this);
		ibChar.setOnClickListener(this);
		ibEkan.setOnClickListener(this);
		ibHorse.setOnClickListener(this);
		ibJigg.setOnClickListener(this);
		ibPsy.setOnClickListener(this);
		ibSqu.setOnClickListener(this);
		sp = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		pika = sp.load(this, R.raw.pikachu, 1);
		bulba = sp.load(this, R.raw.bulbasaursound, 1);
		charm = sp.load(this, R.raw.charmander, 1);
		ekan = sp.load(this, R.raw.ekans, 1);
		horse = sp.load(this, R.raw.horsea, 1);
		jigg = sp.load(this, R.raw.jigglypuff, 1);
		psy = sp.load(this, R.raw.psyduck, 1);
		squ = sp.load(this, R.raw.squirtle, 1);

	}

	@Override
	public void onClick(View v) {
		int id = v.getId();
		if (id == R.id.ibPika) {
			sp.play(pika, 1, 1, 0, 0, 1);
		} else if (id == R.id.ibBulba) {
			sp.play(bulba, 1, 1, 0, 0, 1);
		} else if (id == R.id.ibChar) {
			sp.play(charm, 1, 1, 0, 0, 1);
		} else if (id == R.id.ibEkan) {
			sp.play(ekan, 1, 1, 0, 0, 1);
		} else if (id == R.id.ibHorse) {
			sp.play(horse, 1, 1, 0, 0, 1);
		} else if (id == R.id.ibJiggly) {
			sp.play(jigg, 1, 1, 0, 0, 1);
		} else if (id == R.id.ibPsy) {
			sp.play(psy, 1, 1, 0, 0, 1);
		} else if (id == R.id.ibSquirt) {
			sp.play(squ, 1, 1, 0, 0, 1);
		}
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		
	}

}
