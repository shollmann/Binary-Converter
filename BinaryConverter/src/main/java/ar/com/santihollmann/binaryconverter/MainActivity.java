package ar.com.santihollmann.binaryconverter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText decimalNumber = (EditText) findViewById(R.id.main_decimal_number);
        Button convertTo = (Button) findViewById(R.id.main_convertTo);
        final TextView binaryNumber = (TextView) findViewById(R.id.main_binary_number);

        convertTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NumberConverter numberConverter = new NumberConverter();

                String decimalConvertedToBinary = numberConverter.convertDecimalToBinary(decimalNumber.getText());

                binaryNumber.setText(decimalConvertedToBinary);

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
