package h_one.com.machineinventory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Machine_BreakDown extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine__break_down);

        Button btn_mrk_as_brkdwn = (Button)findViewById(R.id.mrk_as_brekdwn);
        Button btn_mrl_as_repred = (Button)findViewById(R.id.mrk_as_repird);


        btn_mrk_as_brkdwn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent goToMachineIdBrekdwnScan = new Intent(getApplicationContext(),machineid_scan_breakdown_repair.class);
//                startActivity(goToMachineIdBrekdwnScan);


//
                //Intent goToMachineIdBrekdwnScan = new Intent(getApplicationContext(),machineid_scan_breakdown_repair.class);


                Intent goToMachineIdBrekdwnScan = new Intent(Machine_BreakDown.this,machineid_scan_breakdown_repair.class);

                goToMachineIdBrekdwnScan.putExtra("Btype",true);
                startActivity(goToMachineIdBrekdwnScan);
            }
        });

        btn_mrl_as_repred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent goToMachineIdRepairScan = new Intent(getApplicationContext(),machineid_scan_breakdown_repair.class);

                Intent goToMachineIdRepairScan = new Intent(Machine_BreakDown.this,machine_repair_action_category_list.class);

                goToMachineIdRepairScan.putExtra("Btype",false);
                startActivity(goToMachineIdRepairScan);
            }
        });


    }
}
