package gtbit.retro06.www.sikkimelectricityboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Bill extends AppCompatActivity {
	String billDate;
	Person customer;
	float amount;
	float unitsConsumed;
	// ServiceCenter billingCenter;
	Grid grid;
	Meter meter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);
    }
}
