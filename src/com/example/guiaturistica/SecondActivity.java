package com.example.guiaturistica;

//import com.example.aa.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends Activity {
    
	int request_Code = 1;
    EditText usuario;
	EditText contrasena;
	//Button grid;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        
        usuario = (EditText) findViewById(R.id.etUsuario);
        contrasena = (EditText) findViewById(R.id.etContrasena);
        /*grid = (Button) findViewById(R.id.gvGrid);
        grid.setOnClickListener(this);*/
    }
    /*
    public void onClick(View v) {
    	startActivity(new Intent("net.learn2develop.ThirdActivity"));
    }*/
    
    public void Button(View v)
	{
		
		
		if (usuario.getText().toString().equals("diogle") &&  contrasena.getText().toString().equals("12345"))
		{
			Intent act = new Intent(this,MenuActivity.class);
			startActivity(act);
		}
		 
	}
    
}
        /*switch(v.getId())
    	{
    	//case R.id.gvGrid:
    		//if (usuario.getText().toString().equals("diogle") &&  contrasena.getText().toString().equals("12345"))
        		{*/
    	        			//Intent i = new Intent("net.learn2develop.ThirdActivity");
    	        			 
    	        		//	break;
        		//}
    		/*}
    }*/
    /*
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if (requestCode == request_Code) {
            if (resultCode == RESULT_OK) {
                Toast.makeText(this,data.getData().toString(),
                    Toast.LENGTH_SHORT).show();
            }
        }
    } */
	
	/*public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}*/
//}
