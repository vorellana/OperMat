package com.example.opermat01;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    //mis declaraciones
	private EditText et1,et2;
	private TextView tvR;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //mis declaraciones
       et1=(EditText)findViewById(R.id.txtNum1);
       et2=(EditText)findViewById(R.id.txtNum2);
       tvR=(TextView)findViewById(R.id.lblResp);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    
    public void Sumar(View view){
    	//String valor1=txtNum1.
    	String valor1=et1.getText().toString();
    	String valor2=et2.getText().toString();
    	int nro1=Integer.parseInt(valor1);
    	int nro2=Integer.parseInt(valor2);
    	int iRes=nro1+nro2;
    	String sRes = String.valueOf(iRes);
    	tvR.setText(sRes);
    }
    
  
    public void Restar(View view){
    	//String valor1=txtNum1.
    	String valor1=et1.getText().toString();
    	String valor2=et2.getText().toString();
    	int nro1=Integer.parseInt(valor1);
    	int nro2=Integer.parseInt(valor2);
    	int iRes=nro1-nro2;
    	String sRes = String.valueOf(iRes);
    	tvR.setText(sRes);
    }
    public void Multiplicar(View view){
    	//String valor1=txtNum1.
    	String valor1=et1.getText().toString();
    	String valor2=et2.getText().toString();
    	int nro1=Integer.parseInt(valor1);
    	int nro2=Integer.parseInt(valor2);
    	int iRes=nro1*nro2;
    	String sRes = String.valueOf(iRes);
    	tvR.setText(sRes);
    }
    public void Dividir(View view){
    	//String valor1=txtNum1.
    	String valor1=et1.getText().toString();
    	String valor2=et2.getText().toString();
    	int nro1=Integer.parseInt(valor1);
    	int nro2=Integer.parseInt(valor2);
    	double iRes=nro1/nro2;
    	String sRes = String.valueOf(iRes);
    	tvR.setText(sRes);
    }
}
