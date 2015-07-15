package com.japal.spksiswateladan;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	
	private Button masuk;
	private Button namakelompok;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	       getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
	                                WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main);
		
		masuk = (Button) findViewById(R.id.btn_masuk);
		masuk.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// TODO Auto-generated method stub
				Intent i = new Intent(view.getContext(), Input.class);
				startActivityForResult(i, 0);
			}
		});
		
		namakelompok = (Button)findViewById(R.id.btn_namakelompok);
		namakelompok.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// Creating alert Dialog with one Button

				AlertDialog alertDialog = new AlertDialog.Builder(
						MainActivity.this).create();

				
				alertDialog.setTitle("Nama Kelompok");
				alertDialog.setMessage("	.::Welcome to SPK Siswa Teladan::." +
						"\n" +
						"\nAdam Japal" +
						"\nDeni Kesuma" +
						"\nEko Hendriyanto" +
						"\nReflan Nuari");
				alertDialog.setButton("OK",
						new DialogInterface.OnClickListener() {

							public void onClick(DialogInterface dialog,
									int which) {
								// Write your code here to execute after dialog
								// closed
								Toast.makeText(getApplicationContext(),
										"Selamat Menggunakan", Toast.LENGTH_SHORT)
										.show();
							}
						});

				// Showing Alert Message
				alertDialog.show();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
