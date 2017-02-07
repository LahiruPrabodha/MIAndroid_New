package h_one.com.machineinventory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TransferOptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_options);

        Button but = (Button)findViewById(R.id.mchn_trans);
        Button but_mchn_brkdwn = (Button)findViewById(R.id.mrk_as_repird);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToIntExt = new Intent(getApplicationContext(), IntExtSelectionActivity.class);
                startActivity(goToIntExt);
            }
        });

        but_mchn_brkdwn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToBrkDwn = new Intent(getApplicationContext(),Machine_BreakDown.class);
                startActivity(goToBrkDwn);
            }
        });
    }
}
