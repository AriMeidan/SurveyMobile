package com.example.surveymobile;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {

    private RelativeLayout quetionnaireView;
	private RelativeLayout quetionnaireContainer;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button btnNext = (Button) findViewById(R.id.btn_next);
        btnNext.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
		        quetionnaireView = new QuetionView(MainActivity.this);
		        quetionnaireContainer = (RelativeLayout)findViewById(R.id.question_body);
		        quetionnaireContainer.addView(quetionnaireView);
				
			}
		});
        

        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
}
