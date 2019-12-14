package com.example.rumahmakan;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class order extends AppCompatActivity {

    int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }


    /**
     * This method is called when the minus button is clicked.
     */
    public void dec(View view) {
        if (quantity == 1) {
            Toast.makeText(this, "You can't have less than 1 coffee", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity - 1;
        //displayQuantity(quantity);
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void inc(View view) {
        if (quantity == 100) {
            Toast.makeText(this, "You can't have more than 100 coffees", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity + 1;
        //displayQuantity(quantity);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        //Mengambil nama user
        EditText nameField = (EditText) findViewById(R.id.name_field);
        Editable namaField = nameField.getText();
        String name = namaField.toString();


        EditText isikrit = (EditText) findViewById(R.id.kritik);
        Editable iskrit = isikrit.getText();
        String kritik = iskrit.toString();

        EditText isisaran = (EditText) findViewById(R.id.saran);
        Editable issaran = isisaran.getText();
        String  saran=  issaran.toString();


        String priceMessage = createOrderSummary(name, kritik, saran);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto: powersonotniel123@gmail.com "));
        intent.putExtra(Intent.EXTRA_SUBJECT,
                getString(R.string.order_summary_email_subject,name));
        intent.putExtra(Intent.EXTRA_TEXT, priceMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }


    //Create summary of order
    //param name the customer
    //param price the order
    //param addWhippedCream is whether or not the user want whipped cream topping
    //return the text summary
    private String createOrderSummary(String name, String kritik, String saran) {
        String orderKritik = "Hi, " + getString(R.string.order_summary_nama,name);
        orderKritik += "\n" + getString(R.string.order_summary_kritik,kritik);
        orderKritik += "\n" + getString(R.string.order_saran,saran);

        orderKritik += "\n" + getString(R.string.thank_you);
        return orderKritik;
    }

}