package com.example.usuario.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtvCalculadora;
    TextView txtvCalculos;
    String valor1;
    String valor2;
    String signo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtvCalculadora=findViewById(R.id.txtvCalculadora);
        txtvCalculos=findViewById(R.id.txtbCalculos);
    }
    public void onClick0(View v)
    {
        txtvCalculos.setText(txtvCalculos.getText() + "0");
        txtvCalculadora.setText(txtvCalculadora.getText()+"0");

    }
    public void onClick1(View v)
    {
        txtvCalculos.setText(txtvCalculos.getText() + "1");
        txtvCalculadora.setText(txtvCalculadora.getText()+"1");

    }
    public void onClick2(View v)
    {
        txtvCalculos.setText(txtvCalculos.getText() + "2");
        txtvCalculadora.setText(txtvCalculadora.getText()+"2");
    }
    public void onClick3(View v)
    {
        txtvCalculos.setText(txtvCalculos.getText() + "3");
        txtvCalculadora.setText(txtvCalculadora.getText()+"3");
    }
    public void onClick4(View v)
    {
        txtvCalculos.setText(txtvCalculos.getText() + "4");
        txtvCalculadora.setText(txtvCalculadora.getText()+"4");

    }
    public void onClick5(View v)
    {
        txtvCalculos.setText(txtvCalculos.getText() + "5");
        txtvCalculadora.setText(txtvCalculadora.getText()+"5");

    }
    public void onClick6(View v)
    {
        txtvCalculos.setText(txtvCalculos.getText() + "6");
        txtvCalculadora.setText(txtvCalculadora.getText()+"6");

    }

    public void onClick7(View v)
    {

        txtvCalculos.setText(txtvCalculos.getText() + "7");
        txtvCalculadora.setText(txtvCalculadora.getText()+"7");

    }
    public void onClick8(View v)
    {
        txtvCalculos.setText(txtvCalculos.getText() + "8");
        txtvCalculadora.setText(txtvCalculadora.getText()+"8");

    }
    public void onClick9(View v)
    {
        txtvCalculos.setText(txtvCalculos.getText() + "9");
        txtvCalculadora.setText(txtvCalculadora.getText()+"9");
    }
    public void onClick_mas(View v)
    {
        txtvCalculos.setText(txtvCalculos.getText()+"+");
        if(!txtvCalculadora.getText().equals(""))
        {
            valor1=txtvCalculadora.getText().toString();
            signo="+";
            txtvCalculadora.setText("");

        }

    }
    public void onClick_por(View v)
    {
        txtvCalculos.setText(txtvCalculos.getText()+"*");
        if(!txtvCalculadora.getText().equals(""))
        {
            valor1=txtvCalculadora.getText().toString();
            signo="*";
            txtvCalculadora.setText("");

        }

    }
    public void onClick_entre(View v)
    {
        txtvCalculos.setText(txtvCalculos.getText()+"/");
        if(!txtvCalculadora.getText().equals(""))
        {
            valor1=txtvCalculadora.getText().toString();
            signo="/";
            txtvCalculadora.setText("");

        }

    }
    public void onClick_porcentaje(View v)
    {
        txtvCalculos.setText(txtvCalculos.getText()+"%");
        if(!txtvCalculadora.getText().equals(""))
        {
            valor1=txtvCalculadora.getText().toString();
            signo="%";
            txtvCalculadora.setText("");

        }

    }
    public void onClick_punto(View v)
    {
        String cadena;
        cadena = txtvCalculadora.getText().toString();
        if (cadena.length()<=0)
        {
            txtvCalculadora.setText(txtvCalculadora.getText() + "0.");
        }
        else
        {
            if(!punto(txtvCalculadora.getText().toString()))
            {
                txtvCalculadora.setText(txtvCalculadora.getText()+ ".");
                txtvCalculos.setText(txtvCalculos.getText()+".");
            }
        }

    }

    public void onClick_menos(View v)
    {
        txtvCalculos.setText(txtvCalculos.getText()+"-");
        if(!txtvCalculadora.getText().equals(""))
        {
            valor1=txtvCalculadora.getText().toString();
            signo="-";
            txtvCalculadora.setText("");

        }

    }
    public void onClick_raiz(View v)
    {
       String cadena;
       Double num;
       cadena=txtvCalculadora.getText().toString();
       if (cadena.length()>0)
       {
           num = Math.sqrt(Double.parseDouble(cadena)) ;
           txtvCalculadora.setText(num.toString());
           txtvCalculos.setText("sqrt ("+txtvCalculos.getText()+")");
       }

    }
    public void onClick_inverso(View v)
    {
        String cadena;
        Double num;
        cadena=txtvCalculadora.getText().toString();
        if (cadena.length()>0)
        {
            num =1/(Double.parseDouble(cadena)) ;
            txtvCalculadora.setText(num.toString());
            txtvCalculos.setText("1/"+txtvCalculos.getText());
        }

    }
    public void onClick_Seno(View v)
    {
        String cadena;
        Double num;
        cadena=txtvCalculadora.getText().toString();
        if (cadena.length()>0)
        {
            num = Math.sin(Double.parseDouble(cadena)*Math.PI/180) ;
            txtvCalculadora.setText(num.toString());
            txtvCalculos.setText("Sin("+txtvCalculos.getText()+")");
        }

    }
    public void onClick_coseno(View v)
    {
        String cadena;
        Double num;
        cadena=txtvCalculadora.getText().toString();
        if (cadena.length()>0)
        {
            num = Math.cos(Double.parseDouble(cadena)*Math.PI/180) ;
            txtvCalculadora.setText(num.toString());
            txtvCalculos.setText("Cos("+txtvCalculos.getText()+")");
        }

    }
    public void onClick_tang(View v)
    {
        String cadena;
        Double num;
        cadena=txtvCalculadora.getText().toString();
        if (cadena.length()>0)
        {
            num = Math.tan(Double.parseDouble(cadena)*Math.PI/180) ;
            txtvCalculadora.setText(num.toString());
            txtvCalculos.setText("Tan ("+txtvCalculos.getText()+")");
        }

    }
    public void onClick_aSen(View v)
    {
        String cadena;
        Double num;
        cadena=txtvCalculadora.getText().toString();
        if (cadena.length()>0)
        {
            num = Math.asin(Double.parseDouble(cadena)*Math.PI/180) ;
            txtvCalculadora.setText(num.toString());
            txtvCalculos.setText("aSen ("+txtvCalculos.getText()+")");
        }

    }
    public void onClick_aCos(View v)
    {
        String cadena;
        Double num;
        cadena=txtvCalculadora.getText().toString();
        if (cadena.length()>0)
        {
            num = Math.acos(Double.parseDouble(cadena)*Math.PI/180) ;
            txtvCalculadora.setText(num.toString());
            txtvCalculos.setText("aCos("+txtvCalculos.getText()+")");
        }

    }
    public void onClick_aTan(View v)
    {
        String cadena;
        Double num;
        cadena=txtvCalculadora.getText().toString();
        if (cadena.length()>0)
        {
            num = Math.atan(Double.parseDouble(cadena)*Math.PI/180) ;
            txtvCalculadora.setText(num.toString());
            txtvCalculos.setText("aTan("+txtvCalculos.getText()+")");
        }

    }
    public void onClick_Ln(View v)
    {
        String cadena;
        Double num;
        cadena=txtvCalculadora.getText().toString();
        if (cadena.length()>0)
        {
            num = Math.log(Double.parseDouble(cadena)) ;
            txtvCalculadora.setText(num.toString());
        }
        txtvCalculos.setText("Ln ("+txtvCalculos.getText()+")");

    }
    public void onClick_Exp(View v)
    {
        String cadena;
        Double num;
        cadena=txtvCalculadora.getText().toString();
        if (cadena.length()>0)
        {
            num = Math.exp(Double.parseDouble(cadena)) ;
            txtvCalculadora.setText(num.toString());
            txtvCalculos.setText("e^("+txtvCalculos.getText()+")");
        }

    }

    public void onClick_del(View v)
    {
        String cadena;
        String cadena2;
        cadena = txtvCalculadora.getText().toString();
        if (cadena.length()>0)
        {
            cadena=cadena.substring(0, cadena.length()-1);
            txtvCalculadora.setText(cadena);
        }
        cadena2 = txtvCalculos.getText().toString();
        if (cadena.length()>0)
        {
            cadena2=cadena2.substring(0, cadena.length()-1);
            txtvCalculos.setText(cadena2);
        }

    }
    public void onClick_C(View v)
    {

            txtvCalculadora.setText("");
            txtvCalculos.setText("");


    }
    public void onClick_igual(View v)
    {

        String resultado;

        valor2=txtvCalculadora.getText().toString();
        if(!valor2.equals(""))
        {
            resultado=calculo(valor1,valor2,signo);
            txtvCalculadora.setText(resultado);
            txtvCalculos.setText(resultado);
        }



    }
    public static String calculo(String valor1,String valor2, String signo)
    {
        Double resultado = 0.0;
        String respuesta;
        if(signo.equals("-")){
            resultado=Double.parseDouble(valor1)-Double.parseDouble(valor2);

        }
        if(signo.equals("+")){
            resultado=Double.parseDouble(valor1)+Double.parseDouble(valor2);

        }
        if(signo.equals("*")){
            resultado=Double.parseDouble(valor1)*Double.parseDouble(valor2);

        }
        if(signo.equals("/")){
            resultado=Double.parseDouble(valor1)/Double.parseDouble(valor2);

        }
        if(signo.equals("%")){
            resultado=Double.parseDouble(valor1)/(100);

        }

        respuesta=resultado.toString();
        return respuesta;

    }
    public static boolean punto(String cadena)
    {
        boolean haypunto;
        haypunto=false;
        for(int i=0;i<cadena.length();i++)
        {
            if (cadena.substring(i,i+1).equals("."))
            {
                haypunto=true;
                break;
            }
        }
        return haypunto;
    }
}
