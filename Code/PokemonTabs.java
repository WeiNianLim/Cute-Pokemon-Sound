package com.example.cutepokemonsound;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class PokemonTabs extends Activity implements OnClickListener,
		OnCheckedChangeListener {

	TabHost TabT;
	ImageButton ibPika;
	ImageButton ibBulba;
	ImageButton ibChar;
	ImageButton ibEkan;
	ImageButton ibHorse;
	ImageButton ibJigg;
	ImageButton ibPsy;
	ImageButton ibSqu;
	SoundPool sp;
	RadioGroup SoundGroup;
	int pika, bulba, charm, ekan, horse, jigg, psy, squ;
	int time = 0;
	int NewSoundId;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pokemon_tabs);
		initialization();

	}

	private void initialization() {
		// TODO Auto-generated method stub
		TabT = (TabHost) findViewById(R.id.tabhost);
		ibPika = (ImageButton) findViewById(R.id.ibPika);
		ibBulba = (ImageButton) findViewById(R.id.ibBulba);
		ibChar = (ImageButton) findViewById(R.id.ibChar);
		ibEkan = (ImageButton) findViewById(R.id.ibEkan);
		ibHorse = (ImageButton) findViewById(R.id.ibHorse);
		ibJigg = (ImageButton) findViewById(R.id.ibJiggly);
		ibPsy = (ImageButton) findViewById(R.id.ibPsy);
		ibSqu = (ImageButton) findViewById(R.id.ibSquirt);
		SoundGroup = (RadioGroup) findViewById(R.id.rg1);
		ibPika.setOnClickListener(this);
		ibBulba.setOnClickListener(this);
		ibChar.setOnClickListener(this);
		ibEkan.setOnClickListener(this);
		ibHorse.setOnClickListener(this);
		ibJigg.setOnClickListener(this);
		ibPsy.setOnClickListener(this);
		ibSqu.setOnClickListener(this);
		SoundGroup.setOnCheckedChangeListener(this);
		sp = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		pika = sp.load(this, R.raw.pikachu, 1);
		bulba = sp.load(this, R.raw.bulbasaursound, 1);
		charm = sp.load(this, R.raw.charmander, 1);
		ekan = sp.load(this, R.raw.ekans, 1);
		horse = sp.load(this, R.raw.horsea, 1);
		jigg = sp.load(this, R.raw.jigglypuff, 1);
		psy = sp.load(this, R.raw.psyduck, 1);
		squ = sp.load(this, R.raw.squirtle, 1);
		initializeTab();
	}

	private void initializeTab() {
		// TODO Auto-generated method stub
		// setup initialize the tabs
		TabT.setup();
		// ------------------------Tab 1------------------------//
		TabSpec specs = TabT.newTabSpec("tag1");
		specs.setContent(R.id.tab1);
		specs.setIndicator("Pokemon Voices");
		TabT.addTab(specs);
		// ------------------------Tab 2------------------------//
		specs = TabT.newTabSpec("tag2");
		specs.setContent(R.id.tab2);
		specs.setIndicator("New ringtones");
		TabT.addTab(specs);
		// ------------------------Tab 3------------------------//
		specs = TabT.newTabSpec("tag3");
		specs.setContent(R.id.tab3);
		specs.setIndicator("Nothing");
		TabT.addTab(specs);
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

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		if (checkedId == R.id.rPika) {
			NewSoundId = R.raw.pikachu;
		} else if (checkedId == R.id.rEkans) {
			NewSoundId = R.raw.ekans;
		} else if (checkedId == R.id.rBulba) {
			NewSoundId = R.raw.bulbasaursound;
		} else if (checkedId == R.id.rChar) {
			NewSoundId = R.raw.charmander;
		} else if (checkedId == R.id.rHorsey) {
			NewSoundId = R.raw.horsea;
		} else if (checkedId == R.id.rJiggly) {
			NewSoundId = R.raw.jigglypuff;
		} else if (checkedId == R.id.rPsyduck) {
			NewSoundId = R.raw.psyduck;
		} else if (checkedId == R.id.rSquirt) {
			NewSoundId = R.raw.squirtle;
		}
	}

}
