package example.android.nurichsan_1202150058_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

    class Main2Activity extends AppCompatActivity {

        TextView Ntempat;
        TextView Nmenu;
        TextView Nbporsi;
        TextView Ntotharga;
        private  final int saldo = 65500;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);

            Ntempat = findViewById(R.id.namatempat);
            Nmenu = findViewById(R.id.namamakanan);
            Nbporsi = findViewById(R.id.totalporsi);
            Ntotharga = findViewById(R.id.totalharga);

            Intent y = getIntent();

            String namatempat = y.getStringExtra("namatempat");
            String namamenu = y.getStringExtra("namamenu");
            String jumlahporsi = y.getStringExtra("jumlahporsi");
            String totalharga = y.getStringExtra("totalharga");

            int totalHarga = Integer.valueOf(totalharga) * Integer.valueOf(jumlahporsi);

            Ntempat.setText(namatempat);
            Nmenu.setText(namamenu);
            Nbporsi.setText(jumlahporsi);
            Ntotharga.setText(String.valueOf(totalHarga));

            if (totalHarga <= saldo){
                Toast.makeText(this, "Disini saja makan malamnya", Toast.LENGTH_LONG).show();

            } else {
                Toast.makeText(this,"Jangan disini makan malamnua, uang kamu tidak cukup", Toast.LENGTH_LONG).show();
            }
        }
    }
