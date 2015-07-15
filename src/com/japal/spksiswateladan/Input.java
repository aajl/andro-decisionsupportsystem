package com.japal.spksiswateladan;

import android.R.layout;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter.LengthFilter;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Input extends Activity{
	
	private Button bersih;
	private Button proses;
	
	//nama
	private EditText no1;
	private EditText no2;
	private EditText no3;
	private EditText no4;
	private EditText no5;
	private EditText no6;
	
	//c1
	private EditText c11;
	private EditText c12;
	private EditText c13;
	private EditText c14;
	private EditText c15;
	private EditText c16;

	//c2
	private EditText c21;
	private EditText c22;
	private EditText c23;
	private EditText c24;
	private EditText c25;
	private EditText c26;
	
	//c3
	private EditText c31;
	private EditText c32;
	private EditText c33;
	private EditText c34;
	private EditText c35;
	private EditText c36;
	
	//c4
	private EditText c41;
	private EditText c42;
	private EditText c43;
	private EditText c44;
	private EditText c45;
	private EditText c46;
	
	//c5
	private EditText c51;
	private EditText c52;
	private EditText c53;
	private EditText c54;
	private EditText c55;
	private EditText c56;

	//total
	private TextView p1;
	private TextView p2;
	private TextView p3;
	private TextView p4;
	private TextView p5;
	private TextView p6;
	private EditText edp1;
	private EditText edp2;
	private EditText edp3;
	private EditText edp4;
	private EditText edp5;
	private EditText edp6;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	       getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
	                                WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.input);
		
		bersih = (Button)findViewById(R.id.btn_bersih);
		bersih.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//deklarasi nama
				no1 = (EditText)findViewById(R.id.no1);
				no2 = (EditText)findViewById(R.id.no2);
				no3 = (EditText)findViewById(R.id.no3);
				no4 = (EditText)findViewById(R.id.no4);
				no5 = (EditText)findViewById(R.id.no5);
				no6 = (EditText)findViewById(R.id.no6);
				
				//deklarasi c
				c11 = (EditText)findViewById(R.id.c11);
				c12 = (EditText)findViewById(R.id.c12);
				c13 = (EditText)findViewById(R.id.c13);
				c14 = (EditText)findViewById(R.id.c14);
				c15 = (EditText)findViewById(R.id.c15);
				c16 = (EditText)findViewById(R.id.c16);
				c21 = (EditText)findViewById(R.id.c21);
				c22 = (EditText)findViewById(R.id.c22);
				c23 = (EditText)findViewById(R.id.c23);
				c24 = (EditText)findViewById(R.id.c24);
				c25 = (EditText)findViewById(R.id.c25);
				c26 = (EditText)findViewById(R.id.c26);
				c31 = (EditText)findViewById(R.id.c31);
				c32 = (EditText)findViewById(R.id.c32);
				c33 = (EditText)findViewById(R.id.c33);
				c34 = (EditText)findViewById(R.id.c34);
				c35 = (EditText)findViewById(R.id.c35);
				c36 = (EditText)findViewById(R.id.c36);
				c41 = (EditText)findViewById(R.id.c41);
				c42 = (EditText)findViewById(R.id.c42);
				c43 = (EditText)findViewById(R.id.c43);
				c44 = (EditText)findViewById(R.id.c44);
				c45 = (EditText)findViewById(R.id.c45);
				c46 = (EditText)findViewById(R.id.c46);
				c51 = (EditText)findViewById(R.id.c51);
				c52 = (EditText)findViewById(R.id.c52);
				c53 = (EditText)findViewById(R.id.c53);
				c54 = (EditText)findViewById(R.id.c54);
				c55 = (EditText)findViewById(R.id.c55);
				c56 = (EditText)findViewById(R.id.c56);
				edp1= (EditText)findViewById(R.id.edp1);
				edp2= (EditText)findViewById(R.id.edp2);
				edp3= (EditText)findViewById(R.id.edp3);
				edp4= (EditText)findViewById(R.id.edp4);
				edp5= (EditText)findViewById(R.id.edp5);
				edp6= (EditText)findViewById(R.id.edp6);
				
				p1 = (TextView)findViewById(R.id.p1);
				p2 = (TextView)findViewById(R.id.p2);
				p3 = (TextView)findViewById(R.id.p3);
				p4 = (TextView)findViewById(R.id.p4);
				p5 = (TextView)findViewById(R.id.p5);
				p6 = (TextView)findViewById(R.id.p6);
				
				no1.setText("");
				no2.setText("");
				no3.setText("");
				no4.setText("");
				no5.setText("");
				no6.setText("");
				c11.setText("");
				c12.setText("");
				c13.setText("");
				c14.setText("");
				c15.setText("");
				c16.setText("");
				c21.setText("");
				c22.setText("");
				c23.setText("");
				c24.setText("");
				c25.setText("");
				c26.setText("");
				c31.setText("");
				c32.setText("");
				c33.setText("");
				c34.setText("");
				c35.setText("");
				c36.setText("");
				c41.setText("");
				c42.setText("");
				c43.setText("");
				c44.setText("");
				c45.setText("");
				c46.setText("");
				c51.setText("");
				c52.setText("");
				c53.setText("");
				c54.setText("");
				c55.setText("");
				c56.setText("");
				edp1.setText("");
				edp2.setText("");
				edp3.setText("");
				edp4.setText("");
				edp5.setText("");
				edp6.setText("");
				p1.setText("--");
				p2.setText("--");
				p3.setText("--");
				p4.setText("--");
				p5.setText("--");
				p6.setText("--");
				
				no1.requestFocus();
				
			}
		});
		
		proses = (Button)findViewById(R.id.btn_proses);
		proses.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// TODO Auto-generated method stub
				no1 = (EditText)findViewById(R.id.no1);
				no2 = (EditText)findViewById(R.id.no2);
				no3 = (EditText)findViewById(R.id.no3);
				no4 = (EditText)findViewById(R.id.no4);
				no5 = (EditText)findViewById(R.id.no5);
				no6 = (EditText)findViewById(R.id.no6);
				
				//deklarasi c
				c11 = (EditText)findViewById(R.id.c11);
				c12 = (EditText)findViewById(R.id.c12);
				c13 = (EditText)findViewById(R.id.c13);
				c14 = (EditText)findViewById(R.id.c14);
				c15 = (EditText)findViewById(R.id.c15);
				c16 = (EditText)findViewById(R.id.c16);
				c21 = (EditText)findViewById(R.id.c21);
				c22 = (EditText)findViewById(R.id.c22);
				c23 = (EditText)findViewById(R.id.c23);
				c24 = (EditText)findViewById(R.id.c24);
				c25 = (EditText)findViewById(R.id.c25);
				c26 = (EditText)findViewById(R.id.c26);
				c31 = (EditText)findViewById(R.id.c31);
				c32 = (EditText)findViewById(R.id.c32);
				c33 = (EditText)findViewById(R.id.c33);
				c34 = (EditText)findViewById(R.id.c34);
				c35 = (EditText)findViewById(R.id.c35);
				c36 = (EditText)findViewById(R.id.c36);
				c41 = (EditText)findViewById(R.id.c41);
				c42 = (EditText)findViewById(R.id.c42);
				c43 = (EditText)findViewById(R.id.c43);
				c44 = (EditText)findViewById(R.id.c44);
				c45 = (EditText)findViewById(R.id.c45);
				c46 = (EditText)findViewById(R.id.c46);
				c51 = (EditText)findViewById(R.id.c51);
				c52 = (EditText)findViewById(R.id.c52);
				c53 = (EditText)findViewById(R.id.c53);
				c54 = (EditText)findViewById(R.id.c54);
				c55 = (EditText)findViewById(R.id.c55);
				c56 = (EditText)findViewById(R.id.c56);
				edp1= (EditText)findViewById(R.id.edp1);
				edp2= (EditText)findViewById(R.id.edp2);
				edp3= (EditText)findViewById(R.id.edp3);
				edp4= (EditText)findViewById(R.id.edp4);
				edp5= (EditText)findViewById(R.id.edp5);
				edp6= (EditText)findViewById(R.id.edp6);
				p1 = (TextView)findViewById(R.id.p1);
				p2 = (TextView)findViewById(R.id.p2);
				p3 = (TextView)findViewById(R.id.p3);
				p4 = (TextView)findViewById(R.id.p4);
				p5 = (TextView)findViewById(R.id.p5);
				p6 = (TextView)findViewById(R.id.p6);

				//input c1
				int k11 = (Integer.parseInt(c11.getText().toString()));
				int k12 = (Integer.parseInt(c12.getText().toString()));
				int k13 = (Integer.parseInt(c13.getText().toString()));
				int k14 = (Integer.parseInt(c14.getText().toString()));
				int k15 = (Integer.parseInt(c15.getText().toString()));
				int k16 = (Integer.parseInt(c16.getText().toString()));
				//input c2
				int k21 = (Integer.parseInt(c21.getText().toString()));
				int k22 = (Integer.parseInt(c22.getText().toString()));
				int k23 = (Integer.parseInt(c23.getText().toString()));
				int k24 = (Integer.parseInt(c24.getText().toString()));
				int k25 = (Integer.parseInt(c25.getText().toString()));
				int k26 = (Integer.parseInt(c26.getText().toString()));
				//input c3
				int k31 = (Integer.parseInt(c31.getText().toString()));
				int k32 = (Integer.parseInt(c32.getText().toString()));
				int k33 = (Integer.parseInt(c33.getText().toString()));
				int k34 = (Integer.parseInt(c34.getText().toString()));
				int k35 = (Integer.parseInt(c35.getText().toString()));
				int k36 = (Integer.parseInt(c36.getText().toString()));
				//input c4
				int k41 = (Integer.parseInt(c41.getText().toString()));
				int k42 = (Integer.parseInt(c42.getText().toString()));
				int k43 = (Integer.parseInt(c43.getText().toString()));
				int k44 = (Integer.parseInt(c44.getText().toString()));
				int k45 = (Integer.parseInt(c45.getText().toString()));
				int k46 = (Integer.parseInt(c46.getText().toString()));
				//input c5
				int k51 = (Integer.parseInt(c51.getText().toString()));
				int k52 = (Integer.parseInt(c52.getText().toString()));
				int k53 = (Integer.parseInt(c53.getText().toString()));
				int k54 = (Integer.parseInt(c54.getText().toString()));
				int k55 = (Integer.parseInt(c55.getText().toString()));
				int k56 = (Integer.parseInt(c56.getText().toString()));
				
				//array k1
				int[] nilaik1 = {k11,k12,k13,k14,k15,k16};
				int maxk1 = 0;
				int mink1 = 1000;
				//array k2
				int[] nilaik2 = {k21,k22,k23,k24,k25,k26};
				int maxk2 = 0;
				int mink2 = 1000;
				//array k3
				int[] nilaik3 = {k31,k32,k33,k34,k35,k36};
				int maxk3 = 0;
				int mink3 = 1000;
				//array k4
				int[] nilaik4 = {k41,k42,k43,k44,k45,k46};
				int maxk4 = 0;
				int mink4 = 1000;
				//array k5
				int[] nilaik5 = {k51,k52,k53,k54,k55,k56};
				int maxk5 = 0;
				int mink5 = 1000;
				
				//proses k1
				for (int a=0; a<nilaik1.length; a++){
		            if (nilaik1[a]>maxk1){
		                maxk1 = nilaik1[a];
		            }
		            else if (nilaik1[a]<mink1){
		                mink1 = nilaik1[a];
		            }
				}
				double nk11 = (k11 / maxk1) * 0.1;
			    double nk12 = (k12 / maxk1) * 0.1;
				double nk13 = (k13 / maxk1) * 0.1;
				double nk14 = (k14 / maxk1) * 0.1;
				double nk15 = (k15 / maxk1) * 0.1;
				double nk16 = (k16 / maxk1) * 0.1;
				
				//proses k2
				for (int b=0; b<nilaik2.length; b++){
		            if (nilaik1[b]>maxk2){
		                maxk2 = nilaik2[b];
		            }
		            else if (nilaik2[b]<mink2){
		                mink2 = nilaik1[b];
		            }
				}
				double nk21 = (k21 / maxk2) * 0.2;
				double nk22 = (k22 / maxk2) * 0.2;
				double nk23 = (k23 / maxk2) * 0.2;
				double nk24 = (k24 / maxk2) * 0.2;
				double nk25 = (k25 / maxk2) * 0.2;
				double nk26 = (k26 / maxk2) * 0.2;
				
				//proses k3
				for (int c=0; c<nilaik3.length; c++){
		            if (nilaik3[c]>maxk3){
		                maxk3 = nilaik3[c];
		            }
		            else if (nilaik3[c]<mink3){
		                mink3 = nilaik3[c];
		            }
				}
				double nk31 = (k31 / maxk3) * 0.2;
				double nk32 = (k32 / maxk3) * 0.2;
				double nk33 = (k33 / maxk3) * 0.2;
				double nk34 = (k34 / maxk3) * 0.2;
				double nk35 = (k35 / maxk3) * 0.2;
				double nk36 = (k36 / maxk3) * 0.2;
				
				//proses k4
				for (int d=0; d<nilaik4.length; d++){
		            if (nilaik4[d]>maxk4){
		                maxk4 = nilaik4[d];
		            }
		            else if (nilaik4[d]<mink4){
		                mink4 = nilaik4[d];
		            }
				}
				double nk41 = (k41 / maxk4) * 0.3;
				double nk42 = (k42 / maxk4) * 0.3;
				double nk43 = (k43 / maxk4) * 0.3;
				double nk44 = (k44 / maxk4) * 0.3;
				double nk45 = (k45 / maxk4) * 0.3;
				double nk46 = (k46 / maxk4) * 0.3;
				
				//proses k5
				for (int e=0; e<nilaik5.length; e++){
		            if (nilaik5[e]>maxk5){
		                maxk5 = nilaik5[e];
		            }
		            else if (nilaik5[e]<mink5){
		                mink5 = nilaik5[e];
		            }
				}
				double nk51 = (k51 / maxk5) * 0.2;
				double nk52 = (k52 / maxk5) * 0.2;
				double nk53 = (k53 / maxk5) * 0.2;
				double nk54 = (k54 / maxk5) * 0.2;
				double nk55 = (k55 / maxk5) * 0.2;
				double nk56 = (k56 / maxk5) * 0.2;
				
				
				//total per kriteria dan siswa
				double tsk1 = nk11 + nk21 + nk31 + nk41 + nk51;
				double tsk2 = nk12 + nk22 + nk32 + nk42 + nk52;
				double tsk3 = nk13 + nk23 + nk33 + nk43 + nk53;
				double tsk4 = nk14 + nk24 + nk34 + nk44 + nk54;
				double tsk5 = nk15 + nk25 + nk35 + nk45 + nk55;
				double tsk6 = nk16 + nk26 + nk36 + nk46 + nk56;
				
				//membuat output
				String nm1 = no1.getText().toString();
				String nm2 = no2.getText().toString();
				String nm3 = no3.getText().toString();
				String nm4 = no4.getText().toString();
				String nm5 = no5.getText().toString();
				String nm6 = no6.getText().toString();
				
				p1.setText("" +nm1);
				p2.setText("" +nm2);
				p3.setText("" +nm3);
				p4.setText("" +nm4);
				p5.setText("" +nm5);
				p6.setText("" +nm6);
				
				edp1.setText("" +tsk1);
				edp2.setText("" +tsk2);
				edp3.setText("" +tsk3);
				edp4.setText("" +tsk4);
				edp5.setText("" +tsk5);
				edp6.setText("" +tsk6);
				
				double[] total={tsk1,tsk2,tsk3,tsk4,tsk5,tsk6};
				double max= 0;
				double min=1000;
				
				for(int f=0; f<total.length; f++){
					if(total[f]>max){
						max = total[f];
						
					}
				}
				
				
					AlertDialog alertDialog = new AlertDialog.Builder(
							Input.this).create();

					
					alertDialog.setTitle("SPK Siswa Teladan");
					if (max == tsk1){
						alertDialog.setMessage("Nilai terbesar adalah : "+max+
								   "\nDengan Nama		  : "+nm1);
						alertDialog.show();
					}
					else if(max == tsk2){
						alertDialog.setMessage("Nilai terbesar adalah : "+max+
								   "\nDengan Nama		  : "+nm2);
						alertDialog.show();
					}
					else if(max == tsk3){
						alertDialog.setMessage("Nilai terbesar adalah : "+max+
								   "\nDengan Nama		  : "+nm3);
						alertDialog.show();
					}
					else if(max == tsk4){
					alertDialog.setMessage("Nilai terbesar adalah : "+max+
							   "\nDengan Nama		  : "+nm4);
					alertDialog.show();
					}
					else if(max == tsk5){
						alertDialog.setMessage("Nilai terbesar adalah : "+max+
								   "\nDengan Nama		  : "+nm5);
						alertDialog.show();
					}
					else if(max == tsk6){
						alertDialog.setMessage("Nilai terbesar adalah : "+max+
								   "\nDengan Nama		  : "+nm6);
						alertDialog.show();
					}
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
					}
		});
	}

}
