package com.example.guiaturistica;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
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

public class NotasActivity extends Activity {
	EditText name;
	 String[] info; 
	 
	 final static String ACT_INFO = "com.example.guiaturistica.ACTIVIDADINFO";
	 
	 @Override
	 public void onCreate(Bundle savedInstanceState) {
	 super.onCreate(savedInstanceState);
	 setContentView(R.layout.agenda);
	 
	 name = (EditText) findViewById(R.id.nombre);
	 info = new String[2];
	 }
	 
	 public void pasarActividadInfo(View v){
	 
	 //Obtengo lo que hay en las cajas de texto.
	 
	 info[0] = name.getText().toString();
	 
	 //Creo y asigno la información a enviar.
	 Intent act = new Intent(this, ActividadInfo.class);
	 act.putExtra(ACT_INFO, info);
	 startActivity(act);
	 }
}
