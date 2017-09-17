package com.localqueen.localqueenassignment.viewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.localqueen.localqueenassignment.R;

/**
 * Created by haseeb on 16/9/17.
 */

public class ViewHolder1 extends RecyclerView.ViewHolder {

    private TextView tv_productstosell, tv_browseshops, tv_myproducts, tv_findbuyers;

    public ViewHolder1(View itemView) {
        super(itemView);
        tv_productstosell = (TextView) itemView.findViewById(R.id.tv_productstosell);
        tv_browseshops = (TextView) itemView.findViewById(R.id.tv_browseshops);
        tv_findbuyers = (TextView) itemView.findViewById(R.id.tv_findbuyers);
        tv_myproducts = (TextView) itemView.findViewById(R.id.tv_myproducts);
    }
}
