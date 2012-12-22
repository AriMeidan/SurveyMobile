package com.example.surveymobile;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class QuetionView extends RelativeLayout{

	Activity myActivity;
	
	public QuetionView(Context context) {
		super(context);
		myActivity = (Activity)context;
		
		TextView headLine = new TextView(myActivity);
		RelativeLayout.LayoutParams textViewlp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, 
																			RelativeLayout.LayoutParams.WRAP_CONTENT);
		textViewlp.addRule(RelativeLayout.ALIGN_PARENT_TOP);
		textViewlp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
		headLine.setLayoutParams(textViewlp);
		headLine.setText("Hi");
		headLine.setId(10001);
		headLine.setTextAppearance(myActivity, R.style.headerStyle);
		headLine.setGravity(Gravity.CENTER);
		
		RadioGroup options = new RadioGroup(myActivity);
		
		RelativeLayout.LayoutParams radioGrouplp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, 
				RelativeLayout.LayoutParams.MATCH_PARENT);
		radioGrouplp.addRule(RelativeLayout.BELOW, headLine.getId());
		options.setLayoutParams(radioGrouplp);
		
		RadioButton asw1 = new RadioButton(myActivity);
		RadioButton asw2 = new RadioButton(myActivity);
		RadioButton asw3 = new RadioButton(myActivity);
		RadioButton asw4 = new RadioButton(myActivity);
		
		options.addView(asw1, 0);
		options.addView(asw2, 1);
		options.addView(asw3, 2);
		options.addView(asw4, 3);
		
		this.addView(options);
		
		//Setting params of this layout.
		RelativeLayout.LayoutParams questionViewLP = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, 
																			RelativeLayout.LayoutParams.MATCH_PARENT);
		questionViewLP.addRule(RelativeLayout.ALIGN_PARENT_TOP);
		this.setLayoutParams(questionViewLP);
        this.setId(1000);
		this.addView(headLine);
	}

}
