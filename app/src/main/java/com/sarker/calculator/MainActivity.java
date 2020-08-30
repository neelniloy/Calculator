package com.sarker.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;


public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPlus,btnMinus,btnPercentage,btnDivide,btnEqual,btnClear,btnMultiplication,btnDot,btnBracket;
    ImageButton backspace;
    TextView Input,Output;
    String process,last="";
    boolean checkBracket = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        backspace = findViewById(R.id.btndelete);

        btnPlus = findViewById(R.id.btnPlus);
        btnMinus =findViewById(R.id.btnMinus);
        btnMultiplication = findViewById(R.id.btnMultiplication);
        btnDivide = findViewById(R.id.btnDivide);
        btnPercentage = findViewById(R.id.btnPercentage);

        btnClear = findViewById(R.id.btnClear);
        btnDot = findViewById(R.id.btnDot);
        btnBracket = findViewById(R.id.btnBracket);
        btnEqual = findViewById(R.id.btnEqual);

        Input = findViewById(R.id.Input);
        Output = findViewById(R.id.Output);


        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Input.setText("");
                Output.setText("");
                process = "";
                last = "";
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(last.equals("f")) {
                    last = "";
                    process = "";
                }
                    Input.setText(process);
                    process = Input.getText().toString();
                    Input.setText(process + "0");
                    process = Input.getText().toString();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(last.equals("f")) {
                    last = "";
                    process = "";
                }
                Input.setText(process);
                process = Input.getText().toString();
                Input.setText(process + "1");
                process = Input.getText().toString();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(last.equals("f")) {
                    last = "";
                    process = "";
                }
                Input.setText(process);
                process = Input.getText().toString();
                Input.setText(process + "2");
                process = Input.getText().toString();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(last.equals("f")) {
                    last = "";
                    process = "";
                }
                Input.setText(process);
                process = Input.getText().toString();
                Input.setText(process + "3");
                process = Input.getText().toString();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(last.equals("f")) {
                    last = "";
                    process = "";
                }
                Input.setText(process);
                process = Input.getText().toString();
                Input.setText(process + "4");
                process = Input.getText().toString();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(last.equals("f")) {
                    last = "";
                    process = "";
                }
                Input.setText(process);
                process = Input.getText().toString();
                Input.setText(process + "5");
                process = Input.getText().toString();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(last.equals("f")) {
                    last = "";
                    process = "";
                }
                Input.setText(process);
                process = Input.getText().toString();
                Input.setText(process + "6");
                process = Input.getText().toString();
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(last.equals("f")) {
                    last = "";
                    process = "";
                }
                Input.setText(process);
                process = Input.getText().toString();
                Input.setText(process + "0");
                process = Input.getText().toString();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(last.equals("f")) {
                    last = "";
                    process = "";
                }
                Input.setText(process);
                process = Input.getText().toString();
                Input.setText(process + "7");
                process = Input.getText().toString();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(last.equals("f")) {
                    last = "";
                    process = "";
                }
                Input.setText(process);
                process = Input.getText().toString();
                Input.setText(process + "8");
                process = Input.getText().toString();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(last.equals("f")) {
                    last = "";
                    process = "";
                }
                Input.setText(process);
                process = Input.getText().toString();
                Input.setText(process + "9");
                process = Input.getText().toString();
            }
        });

        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (last.equals("f")) {
                    last = "";
                    process = "";
                }
                if (Input.getText().equals("")) {
                    Input.setText("");
                    Output.setText("");
                } else {
                    Input.setText(Input.getText().subSequence(0, Input.getText().length() - 1));
                    process = Input.getText().toString();

                    if (Input.getText().equals("")) {
                        Output.setText("");
                    }

                }
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(last.equals("f")) {
                    last = "";
                }
                Input.setText(process);
                process = Input.getText().toString();
                Input.setText(process + "+");
                process = Input.getText().toString();
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(last.equals("f")) {
                    last = "";
                }
                Input.setText(process);
                process = Input.getText().toString();
                Input.setText(process + "-");
                process = Input.getText().toString();
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(last.equals("f")) {
                    last = "";
                }
                Input.setText(process);
                process = Input.getText().toString();
                Input.setText(process + "×");
                process = Input.getText().toString();
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(last.equals("f")) {
                    last = "";
                }
                Input.setText(process);
                process = Input.getText().toString();
                Input.setText(process + "÷");
                process = Input.getText().toString();
            }
        });

        btnPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(last.equals("f")) {
                    last = "";
                }
                Input.setText(process);
                process = Input.getText().toString();
                Input.setText(process + "%");
                process = Input.getText().toString();
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(last.equals("f")) {
                    last = "";
                }
                Input.setText(process);
                process = Input.getText().toString();
                Input.setText(process + ".");
                process = Input.getText().toString();
            }
        });


        btnBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBracket){
                    if(last.equals("f")) {
                        last = "";
                    }
                    Input.setText(process);
                    process = Input.getText().toString();
                    Input.setText(process + "(");
                    process = Input.getText().toString();
                    checkBracket = false;
                }
                else{
                    if(last.equals("f")) {
                        last = "";
                    }
                    Input.setText(process);
                    process = Input.getText().toString();
                    Input.setText(process + ")");
                    process = Input.getText().toString();
                    checkBracket = true;
                }

            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(TextUtils.isEmpty(Input.getText().toString())) {

                    Toast.makeText(MainActivity.this, "No Input", Toast.LENGTH_SHORT).show();
                    Output.setText("");

                }else {

                    process = Input.getText().toString();
                    last = "f";

                    process = process.replaceAll("×", "*");
                    process = process.replaceAll("%", "/100");
                    process = process.replaceAll("÷", "/");

                    Context rhino = Context.enter();
                    rhino.setOptimizationLevel(-1);

                    String finalResult = "";

                    try{
                        Scriptable scriptable = rhino.initStandardObjects();
                        finalResult = rhino.evaluateString(scriptable, process, "javascript", 1, null).toString();
                    }
                    catch(Exception e){
                        finalResult = "Error";
                    }

                    if(finalResult.equals("Error")){
                        Output.setText(finalResult);
                    }else {
                        double value = Double.parseDouble(finalResult);

                        if (value == Math.round(value)) {
                            Output.setText("=  "+ (int)value);
                            process = String.valueOf((int)value) ;
                        } else {
                            Output.setText("=  "+ value);
                            process = String.valueOf(value) ;
                        }
                    }


                }

            }
        });
    }

    public String lastChars(String a) {

        String str1 = "";
        if(a.length()>=1){
            str1 =a.substring(a.length()-1);
            return str1;
        }else{
            return str1;
        }

    }

}