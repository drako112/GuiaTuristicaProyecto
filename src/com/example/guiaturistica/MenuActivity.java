package com.example.guiaturistica;

import android.content.Intent;
import android.view.View;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MenuActivity extends Activity{

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cuarta);
       
    }	
	
	
	public void Lugares(View v) {
		
		Intent act = new Intent(this, ThirdActivity.class);
		 
		 startActivity(act);
}



public void Agenda(View v) {
	
	Intent act = new Intent(this,NotasActivity.class);
	 
	 startActivity(act);
}
}
