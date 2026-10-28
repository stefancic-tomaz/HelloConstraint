package com.example.helloconstraint;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int st = 0;
    TextView izpis;
    Button nic;
    Button stej;

    @Override
    protected void onCreate(Bundle podatki) {
        super.onCreate(podatki);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (pogled, robovi) -> {
            Insets rob = robovi.getInsets(WindowInsetsCompat.Type.systemBars());
            pogled.setPadding(rob.left, rob.top, rob.right, rob.bottom);
            return robovi;
        });

        izpis = findViewById(R.id.show_count);
        nic = findViewById(R.id.gumb_nic);
        stej = findViewById(R.id.gumb_stej);

        if (podatki != null) {
            st = podatki.getInt("st");
            izpis.setText(String.valueOf(st));

            if (st > 0) {
                nic.setBackgroundColor(getColor(R.color.roza));

                if (st % 2 == 0) {
                    stej.setBackgroundColor(Color.GREEN);
                } else {
                    stej.setBackgroundColor(Color.RED);
                }
            }
        }
    }

    public void pokaziToast(View view) {
        Toast.makeText(this, R.string.pozdrav, Toast.LENGTH_SHORT).show();
    }

    public void countUp(View view) {
        st++;
        izpis.setText(String.valueOf(st));

        if (st % 2 == 0) {
            view.setBackgroundColor(Color.GREEN);
        } else {
            view.setBackgroundColor(Color.RED);
        }

        nic.setBackgroundColor(getColor(R.color.roza));
    }

    public void ponastavi(View view) {
        st = 0;
        izpis.setText("0");
        view.setBackgroundColor(getColor(R.color.siva));
        stej.setBackgroundColor(getColor(R.color.modra));
    }

    @Override
    protected void onSaveInstanceState(Bundle podatki) {
        podatki.putInt("st", st);
        super.onSaveInstanceState(podatki);
    }
}
