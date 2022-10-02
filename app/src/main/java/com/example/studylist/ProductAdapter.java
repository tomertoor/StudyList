package com.example.studylist;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ProductAdapter extends ArrayAdapter<Product> {

    Context context;
    ArrayList<Product> products;


    public ProductAdapter(Context context, int resource, int textViewResourceId, ArrayList<Product> products) {
        super(context, resource, textViewResourceId, products);
        this.context = context;
        this.products = products;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater layoutInflater = ((Activity)context).getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.product_list, parent, false);
        TextView productName = view.findViewById(R.id.productName);
        TextView productPrice = view.findViewById(R.id.productPrice);
        TextView productAmount = view.findViewById(R.id.quantityProduct);
        TextView productTotal = view.findViewById(R.id.totalProduct);

        Product temp = this.products.get(position);
        productName.setText(temp.getName());
        productPrice.setText(temp.getPrice()+"");
        productAmount.setText(temp.getQuantity()+"");
        productTotal.setText(temp.getTotal()+"");
        return view;
    }
}
