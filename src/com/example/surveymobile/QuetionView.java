package com.example.surveymobile;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
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
		headLine.setTextAppearance(myActivity, R.style.headerStyle);
		headLine.setGravity(Gravity.CENTER);
		
		
		//Setting params of this layout.
		RelativeLayout.LayoutParams questionViewLP = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, 
																			RelativeLayout.LayoutParams.MATCH_PARENT);
		questionViewLP.addRule(RelativeLayout.ALIGN_PARENT_TOP);
		this.setLayoutParams(questionViewLP);
        this.setId(1000);
		this.addView(headLine);
	}

}
