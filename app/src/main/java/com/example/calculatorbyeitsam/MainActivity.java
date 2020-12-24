package com.example.calculatorbyeitsam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bA,bS,bM,bD,bE,bC;
    TextView et;
    float rs1,rs2;
    boolean A,S,D,M;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0=(Button)findViewById(R.id.bt0);
        b1=(Button)findViewById(R.id.bt1);
        b2=(Button)findViewById(R.id.bt2);
        b3=(Button)findViewById(R.id.bt3);
        b4=(Button)findViewById(R.id.bt4);
        b5=(Button)findViewById(R.id.bt5);
        b6=(Button)findViewById(R.id.bt6);
        b7=(Button)findViewById(R.id.bt7);
        b8=(Button)findViewById(R.id.bt8);
        b9=(Button)findViewById(R.id.bt9);
        bA=(Button)findViewById(R.id.btAdd);
        bS=(Button)findViewById(R.id.btMin);
        bM=(Button)findViewById(R.id.btMul);
        bD=(Button)findViewById(R.id.btDiv);
        bE=(Button)findViewById(R.id.btEqual);
        bC=(Button)findViewById(R.id.btClear);
        et=(TextView) findViewById(R.id.editText);



        b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            et.setText(et.getText()+"1");
        }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"9");
            }
        });

        bA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et==null)
                {
                    et.setText("");
                }
                else
                {
                    rs1=Float.parseFloat(et.getText()+"");
                    A=true;
                    et.setText(null);
                }
            }
        });


        bS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et==null)
                {
                    et.setText("");
                }
                else
                {
                    rs1=Float.parseFloat(et.getText()+"");
                    S=true;
                    et.setText(null);
                }
            }
        });


        bM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et==null)
                {
                    et.setText("");
                }
                else
                {
                    rs1=Float.parseFloat(et.getText()+"");
                    M=true;
                    et.setText(null);
                }
            }
        });


        bD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et==null)
                {
                    et.setText("");
                }
                else
                {
                    rs1=Float.parseFloat(et.getText()+"");
                    D=true;
                    et.setText(null);
                }
            }
        });


        bE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rs2=Float.parseFloat(et.getText()+"");

                if(A==true)
                {
                    et.setText(rs1+rs2+"");
                }
                if(S==true)
                {
                    et.setText(rs1-rs2+"");
                }
                if(M==true)
                {
                    et.setText(rs1*rs2+"");
                }
                if(D==true)
                {
                    et.setText(rs1/rs2+"");
                }
            }
        });

        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText("");
            }
        });
    }
}