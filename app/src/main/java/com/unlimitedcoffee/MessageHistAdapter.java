package com.unlimitedcoffee;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MessageHistAdapter extends BaseAdapter {

    LayoutInflater mInflater;   // adapts the layout to the
    //data array information
    ArrayList<String> phoneNumbers;
    ArrayList<String> messages;

    public MessageHistAdapter(Context c, ArrayList<String> s1, ArrayList<String> s2 ){
        phoneNumbers = s1;
        messages = s2;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return phoneNumbers.size();    // returns the number of items in the string array provided
    }

    @Override
    public Object getItem(int position) {   // returns the items at the index provided
        return phoneNumbers.get(position);
    }

    @Override
    public long getItemId(int position) {   //
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = mInflater.inflate(R.layout.messagelvdetail, null); // passing the mylistview to inflater
        //assign new text views to listviewdetail textviews
        TextView phoneNumTextView = (TextView) v.findViewById(R.id.phoneNumTextView);
        TextView messageTextView = (TextView) v.findViewById(R.id.messageTextView);

        //fields to hold indexed data from the string array
        String phoneNum = phoneNumbers.get(position);
        String msg = messages.get(position);

        // set the textviews with the string data
        phoneNumTextView.setText(phoneNum);
        messageTextView.setText(msg);

        return v; // returns the view
    }


}
