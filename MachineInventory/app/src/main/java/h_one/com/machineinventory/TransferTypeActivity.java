package h_one.com.machineinventory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TransferTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_type);

        Button btn_ytop = (Button)findViewById(R.id.yard_prod);
        Button btn_ytom = (Button)findViewById(R.id.yard_maint);
        Button btn_ptoy = (Button)findViewById(R.id.prod_yard);
        Button btn_mtoy = (Button)findViewById(R.id.maint_yard);

        btn_ytop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ytop_intent = new Intent(getApplicationContext(), employeeIdScanActivity.class);
                startActivity(ytop_intent);
            }
        });
    }
}
