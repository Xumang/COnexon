package com.example.conexon;

import android.support.v7.app.ActionBarActivity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements OnClickListener {
	
	TextView textview,brief;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textview=(TextView)findViewById(R.id.conexon1);
		Typeface mycustomfont=Typeface.createFromAsset(getAssets(), "fonts/cerebro.ttf");
		textview.setTypeface(mycustomfont);
		Button button=(Button)findViewById(R.id.login1);
		button.setOnClickListener(this);
		Button button1=(Button)findViewById(R.id.register1);
		button1.setOnClickListener(this);
		Button button2=(Button)findViewById(R.id.facebook1);
		button2.setOnClickListener(this);
		TextView conexon=(TextView)findViewById(R.id.conexon1);
		conexon.setOnClickListener(this);
		
	
		
		
	}
	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
		if(view.getId()==R.id.login1){
			Animation anim=AnimationUtils.loadAnimation(this, R.anim.animation);
			view.startAnimation(anim);
		}
		
	if(view.getId()==R.id.register1){
		Animation anim=AnimationUtils.loadAnimation(this, R.anim.animation);
		view.startAnimation(anim);	
		}
	
	if(view.getId()==R.id.facebook1){
		Animation anim=AnimationUtils.loadAnimation(this, R.anim.animation);
		view.startAnimation(anim);
	}
	
	if(view.getId()==R.id.conexon1){
		Animation anim=AnimationUtils.loadAnimation(this, R.anim.animation);
		view.startAnimation(anim);
	}
	}


}
