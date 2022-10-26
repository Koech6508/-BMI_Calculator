package com.deb.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText et = findViewById(R.id.et);
        final EditText et2 = findViewById(R.id.et2);
        final TextView bmi = findViewById(R.id.bmi);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String we = et.getText().toString();
                String he = et2.getText().toString();

                if(TextUtils.isEmpty(we)){
                    et.setError("Please enter your weight");
                    et.requestFocus();
                    return;
                }
                if(TextUtils.isEmpty(he)){
                    et2.setError("Please enter your height");
                    et2.requestFocus();
                    return;
                }
                {

                float weight = Float.parseFloat(we);
                float height = Float.parseFloat(he);

                float bmiVal = calculateBMI(weight, height);

                String bmistr = strbmi(bmiVal);

                bmi.setText(String.valueOf(bmiVal + "-" + bmistr));

            }
        }

         private float calculateBMI (float weight,float height){
             return  (weight/ (height * height));
         }

         private String strbmi(float bmiValue) {

             if (bmiValue < 16) {
                 return "Severely underweight";
             } else if (bmiValue < 18.5) {

                 return "Underweight";
             } else if (bmiValue < 25) {

                 return "Normal";
             } else if (bmiValue < 30) {

                 return "Overweight";
             } else {
                 return "Obese";
             }

}
});
}
};