package br.cesed.carioca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txt = (TextView) findViewById(R.id.numPegacao);
        Button btn = (Button) findViewById(R.id.btnPegacao);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valorTexto = Integer.parseInt(txt.getText().toString());
                valorTexto++;
                txt.setText(String.valueOf(valorTexto));
            }
        });
    }
}
