package example.android.nurichsan_1202150058_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

        EditText NMenu, NPorsi;
        Button btEatbus, btAbnormal;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            NMenu = findViewById(R.id.menumakan);
            NPorsi = findViewById(R.id.porsimakan);
            btEatbus = findViewById(R.id.button1);
            btAbnormal = findViewById(R.id.button2);

            btEatbus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent lanjut = new Intent(MainActivity.this, Main2Activity.class);
                    lanjut.putExtra("namatempat", "EATBUS");
                    lanjut.putExtra("namamenu", NMenu.getText().toString());
                    lanjut.putExtra("jumlahporsi", NPorsi.getText().toString());
                    lanjut.putExtra("totalharga", "50000");
                    startActivity(lanjut);
                }
            });

            btAbnormal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent lanjut = new Intent(MainActivity.this,Main2Activity.class);
                    lanjut.putExtra("namatempat", "ABNORMAL");
                    lanjut.putExtra("namamenu", NMenu.getText().toString());
                    lanjut.putExtra("jumlahporsi", NPorsi.getText().toString());
                    lanjut.putExtra("totalharga", "30000");
                    startActivity(lanjut);
                }
            });

        }
    }