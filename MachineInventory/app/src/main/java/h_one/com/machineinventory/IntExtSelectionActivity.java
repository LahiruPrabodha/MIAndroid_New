package h_one.com.machineinventory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntExtSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_int_ext_selection);

        Button but_int = (Button)findViewById(R.id.inter_trans);
        Button but_ext = (Button)findViewById(R.id.exter_trans);

        but_int.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inter_intent = new Intent(getApplicationContext(), TransferTypeActivity.class);
                startActivity(inter_intent);
            }
        });
    }
}
