package com.jeremyfeinstein.slidingmenu.example;

import android.os.Bundle;

import com.example.androidmenusample.R;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;


public class LeftAndRightActivity extends BaseActivity {

	public LeftAndRightActivity() {
		super(R.string.left_and_right);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getSlidingMenu().setMode(SlidingMenu.LEFT_RIGHT);
		getSlidingMenu().setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
		
		setContentView(R.layout.content_frame);
		getSupportFragmentManager()
		.beginTransaction()
		.replace(R.id.content_frame, new SampleListFragment())
		.commit();
		
		getSlidingMenu().setSecondaryMenu(R.layout.menu_frame_two);
		getSlidingMenu().setSecondaryShadowDrawable(R.drawable.shadowright);
		getSupportFragmentManager()
		.beginTransaction()
		.replace(R.id.menu_frame_two, new SampleListFragment())
		.commit();
	}

}
