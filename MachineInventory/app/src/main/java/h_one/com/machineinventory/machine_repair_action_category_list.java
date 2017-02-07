package h_one.com.machineinventory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class machine_repair_action_category_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine_repair_action_category_list);

        Button btn_confirm_as_repair = (Button)findViewById(R.id.cnfrm_repair_btn);

        btn_confirm_as_repair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToConfirm = new Intent(getApplicationContext(),machine_breakdwn_action_confirm_SMS.class);
                startActivity(goToConfirm);
            }
        });
    }
}
