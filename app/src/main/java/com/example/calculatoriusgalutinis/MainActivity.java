package com.example.calculatoriusgalutinis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnCE,btnC,btnProcent,btnRoot,btnPlus,btnMinus,btnDivide,btnSquare,btnTimes,btnEqual,btnDot,btnMemoryClear,btnMemoryMinus,btnMemoryPlus,btnMemoryRecall,btnFactorial;
    TextView tvmain;
    int sum = 0;
    double tempfigure1;
    double memory1 = 0;


    ArrayList<Double> tempfigure = new ArrayList<Double>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnCE = findViewById(R.id.btnCE);
        btnC = findViewById(R.id.btnC);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnDivide = findViewById(R.id.btnDivide);
        btnTimes = findViewById(R.id.btnTimes);
        btnEqual = findViewById(R.id.btnEqual);
        btnDot = findViewById(R.id.btnDot);
        btnProcent = findViewById(R.id.btnProcent);
        btnFactorial = findViewById(R.id.btnFactorial);
        btnRoot = findViewById(R.id.btnRoot);
        btnSquare = findViewById(R.id.btnSquare);
        btnMemoryClear = findViewById(R.id.btnMemoryClear);
        btnMemoryMinus = findViewById(R.id.btnMemoryMinus);
        btnMemoryPlus = findViewById(R.id.btnMemoryPlus);
        btnMemoryRecall = findViewById(R.id.btnMemoryRecall);


        tvmain = findViewById(R.id.tvmain);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+btn1.getText().toString());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+btn2.getText().toString());
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+btn3.getText().toString());
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+btn4.getText().toString());
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+btn5.getText().toString());
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+btn6.getText().toString());
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+btn7.getText().toString());
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+btn8.getText().toString());
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+btn9.getText().toString());
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+btn0.getText().toString());
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+btnDot.getText().toString());
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                if (!val.equals(""))
                {
                    tvmain.setText(val+btnPlus.getText().toString());
                }
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                if (!val.equals(""))
                {
                    tvmain.setText(val+btnDivide.getText().toString());
                }
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                char last = val.charAt(val.length() -1);
                if (last!='-')
                {
                    tvmain.setText(val+btnMinus.getText().toString());
                }
            }
        });
        btnTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                char last = val.charAt(val.length() -1);
                if (!val.equals(""))
                {
                    tvmain.setText(val+btnTimes.getText().toString());
                }
            }
        });
        btnRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val));
                String result = String.valueOf(r);
                tvmain.setText(result);
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                String replacedString = val.replace('÷','/').replace('×', '*');
                double result = eval(replacedString);
                String r = String.valueOf(result);
                tvmain.setText(r);
            }
        });
        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText("");
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                val = val.substring(0, val.length() - 1);
                tvmain.setText(val);
            }
        });
        btnProcent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                val = val.substring(0, val.length() - 1);
                tvmain.setText(val);
            }
        });


        btnSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Double.parseDouble(tvmain.getText().toString());
                double square = d*d;
                tvmain.setText(String.valueOf(square));
            }
        });
        btnFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(tvmain.getText().toString());
                int fact = factorial(val);
                tvmain.setText(String.valueOf(fact));
            }
        });
    }
    /**
     btnMemoryPlus.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
    tempfigure.add(Double.parseDouble(tvmain.getText().toString()));
    memory1=memory1+tempfigure.get(0);
    tempfigure1=0;
    tempfigure.removeAll(tempfigure);
    tvmain.setText(memory1);
    }
    });

     btnMemoryMinus.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
    tempfigure.add(Double.parseDouble(tvsec.getText().toString()));
    memory1=memory1-tempfigure.get(0);
    tempfigure1=0;
    tempfigure.removeAll(tempfigure);
    tvmain.setText(memory1);
    }
    });

     btnMemoryClear.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
    memory1=0;
    tempfigure1=0;
    tempfigure.removeAll(tempfigure);
    tvmain.setText(memory1);
    }
    });

     btnMemoryRecall.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
    tvmain.setText();
    }
    });
     */
    int factorial(int n)
    {

        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);

    }

    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm();
                    else if (eat('-')) x -= parseTerm();
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor();
                    else if (eat('/')) x /= parseFactor();
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor();
                if (eat('-')) return -parseFactor();

                double x;
                int startPos = this.pos;
                if (eat('(')) {
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') {
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor());

                return x;
            }
        }.parse();
    }
}