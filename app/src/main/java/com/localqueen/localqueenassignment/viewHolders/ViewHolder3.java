package com.localqueen.localqueenassignment.viewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.localqueen.localqueenassignment.R;

/**
 * Created by haseeb on 17/9/17.
 */

public class ViewHolder3 extends RecyclerView.ViewHolder {


    private ImageView iv_profileic;
    public ViewHolder3(View itemView) {
        super(itemView);
        iv_profileic = (ImageView) itemView.findViewById(R.id.iv_profilepic);
    }

    public ImageView getIv_profileic() {
        return iv_profileic;
    }

    public void setIv_profileic(ImageView iv_profileic) {
        this.iv_profileic = iv_profileic;
    }
}
