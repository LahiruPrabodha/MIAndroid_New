package h_one.com.machineinventory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class machineid_scan_breakdown_repair extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machineid_scan_breakdown_repair);

        Intent i = getIntent();
        final String BrkType = i.getStringExtra("Btype");

        // public String BrkType = getIntent().getExtras().getString("Btype");

        Button btn_machineid_scan_next = (Button)findViewById(R.id.machineid_scan);



        btn_machineid_scan_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(BrkType=="true"){
                    Intent goToBreakdwnCategory = new Intent(getApplicationContext(),machine_breakdown_category_list.class);
                    startActivity(goToBreakdwnCategory);
                }else{
                    Intent goToRepairCategory = new Intent(getApplicationContext(),machine_repair_action_category_list.class);
                    startActivity(goToRepairCategory);
                }





            }
        });
    }



}
