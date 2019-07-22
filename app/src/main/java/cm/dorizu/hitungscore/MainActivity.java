package cm.dorizu.hitungscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //deklarasi variabel global
    private int skorA = 0;
    private int skorB = 0;

    public void skorTigaA(View view) {
        skorA = skorA + 3;
        tampilkanA(skorA);
    }

    public void skorDuaA(View view) {
        skorA = skorA + 2;
        tampilkanA(skorA);
    }

    public void skorSatuA(View view) {
        skorA = skorA + 1;
        tampilkanA(skorA);
    }


    public void skorTigaB(View view) {
        skorB = skorB + 3;
        tampilkanB(skorB);
    }

    public void skorDuaB(View view) {
        skorB = skorB + 2;
        tampilkanB(skorB);
    }

    public void skorSatuB(View view) {
        skorB = skorB + 1;
        tampilkanB(skorB);
    }


    public void reset(View view) {
        skorA = 0;
        skorB = 0;
        tampilkanB(skorB);
        tampilkanA(skorA);
    }

    private void tampilkanA(int jmlA) {
        TextView skornyaA = findViewById(R.id.skorViewA);
        skornyaA.setText("" + jmlA);
    }

    private void tampilkanB(int jmlB) {
        TextView skornyaA = findViewById(R.id.skorViewB);
        skornyaA.setText("" +jmlB);
    }
}
