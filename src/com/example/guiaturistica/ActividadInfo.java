package com.example.guiaturistica;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

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


public class ActividadInfo extends Activity{
	String[] info; // Para recibir la información.
	 
	 TextView nombre; //Para mostrar en pantalla la información.
	 
	@Override
	 public void onCreate(Bundle savedInstanceState) {
	 super.onCreate(savedInstanceState);
	 setContentView(R.layout.informacion);
	 
	 nombre = (TextView) findViewById(R.id.mostrarNombre);
	 
	 //Obtengo la información de la Actividad anterior y se la asigno a la variable info.
	 Intent men = getIntent();
	 info = men.getStringArrayExtra(NotasActivity.ACT_INFO);
	 
	 //Muestro la información en la interfaz.
	 nombre.setText(info[0]);
	 }
}
