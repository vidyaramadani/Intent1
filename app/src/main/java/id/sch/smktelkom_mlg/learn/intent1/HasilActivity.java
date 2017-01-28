package id.sch.smktelkom_mlg.learn.intent1;

import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        String nama = getIntent().getStringExtra(MainActivity.NAMA);
        int umur = getIntent().getIntExtra(MainActivity.UMUR, 0);

        int yearNow = Calendar.getInstance().get(Calendar.YEAR);
        int tahunLahir = yearNow - umur;

        TextView tvHasil = (TextView) findViewById(R.id.textViewHasil);
        tvHasil.setText(nama + " lahir pada tahun " + tahunLahir);

        setTitle("Hasil");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
