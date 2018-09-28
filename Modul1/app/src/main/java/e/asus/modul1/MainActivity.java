package e.asus.modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView)findViewById(R.id.txt0);
    }

    public void showToast(View view) {
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show();

    }

    public void countUp(View view) {
       i++;
        txt.setText(String.valueOf(i));
    }
}
