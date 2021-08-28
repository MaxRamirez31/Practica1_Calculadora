package ipn.cecyt9.practica1_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private View miView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Double numero1,resultado;
    String operador;

    public void onClickButtonOne(View miView){
        TextView tv = findViewById(R.id.textView3);
        String value = tv.getText().toString();
        tv.setText(value + "1");
    }

    Double numero2;

    public void onClickButtonTwo(View miView){
        TextView tv = findViewById(R.id.textView3);
        String value = tv.getText().toString();
        tv.setText(value + "2");
    }

    Double numero3;

    public void onClickButtonThree(View miView){
        TextView tv = findViewById(R.id.textView3);
        String value = tv.getText().toString();
        tv.setText(value + "3");
    }

    Double numero4;

    public void onClickButtonFour(View miView){
        TextView tv = findViewById(R.id.textView3);
        String value = tv.getText().toString();
        tv.setText(value + "4");
    }

    Double numero5;

    public void onClickButtonFive(View miView){
        TextView tv = findViewById(R.id.textView3);
        String value = tv.getText().toString();
        tv.setText(value + "5");
    }

    Double numero6;

    public void onClickButtonSix(View miView){
        TextView tv = findViewById(R.id.textView3);
        String value = tv.getText().toString();
        tv.setText(value + "6");
    }

    Double numero7;

    public void onClickButtonSeven(View miView){
        TextView tv = findViewById(R.id.textView3);
        String value = tv.getText().toString();
        tv.setText(value + "7");
    }

    Double numero8;

    public void onClickButtonEight(View miView){
        TextView tv = findViewById(R.id.textView3);
        String value = tv.getText().toString();
        tv.setText(value + "8");
    }

    Double numero9;

    public void onClickButtonNine(View miView){
        TextView tv = findViewById(R.id.textView3);
        String value = tv.getText().toString();
        tv.setText(value + "9");
    }

    Double numero0;

    public void onClickButtonZero(View miView){
        TextView tv = findViewById(R.id.textView3);
        String value = tv.getText().toString();
        tv.setText(value + "0");
    }

    public void onClickOperacionCapturaNumero1(View miView){
        TextView tv = (TextView) findViewById(R.id.textView3);
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void onClickSuma(View miView){
        operador="+";
        onClickOperacionCapturaNumero1(miView);

    }

    public void onClickIgual(View miView) {
        TextView tv = (TextView) findViewById(R.id.textView3);
        numero2 = Double.parseDouble(tv.getText().toString());

        try {
            if (operador.equals("+")){
                resultado = numero1 + numero2;
            }
            tv.setText(resultado.toString());
        }catch(NumberFormatException nfe){
            Toast.makeText(this, "Numero Incorrecto", Toast.LENGTH_SHORT).show();
        }

    }

}