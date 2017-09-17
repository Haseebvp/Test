package com.localqueen.localqueenassignment.viewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.localqueen.localqueenassignment.R;
import com.localqueen.localqueenassignment.utils.CircleImageView;

/**
 * Created by haseeb on 16/9/17.
 */

public class ViewHolder2 extends RecyclerView.ViewHolder {

    private TextView tv_sellername, tv_sellerlocation, tv_storeDescription,
            tv_follow, tv_userDescription, tv_premium_extra_count,
    tv_like;
    private ImageView iv_stoke_image_1,iv_stock_image_2, iv_stock_image_3,
    iv_comment, iv_share, iv_menu, iv_sellerpic;
    private LinearLayout lv_moreitems_placeholder, lv_commentholder, lv_sendcomment;

    private CircleImageView cv_comment_user_prof_pic;
    private EditText et_comment;

    private GridView gv_more;

    public GridView getGv_more() {
        return gv_more;
    }

    public void setGv_more(GridView gv_more) {
        this.gv_more = gv_more;
    }

    public ImageView getIv_sellerpic() {
        return iv_sellerpic;
    }

    public void setIv_sellerpic(ImageView iv_sellerpic) {
        this.iv_sellerpic = iv_sellerpic;
    }

    public ViewHolder2(View itemView) {
        super(itemView);

        tv_sellername = (TextView) itemView.findViewById(R.id.tv_sellername);
        tv_follow = (TextView) itemView.findViewById(R.id.tv_follow);
        tv_like = (TextView) itemView.findViewById(R.id.tv_like);
        tv_premium_extra_count = (TextView) itemView.findViewById(R.id.tv_premiumextracount);
        tv_sellerlocation = (TextView) itemView.findViewById(R.id.tv_sellerlocation);
        tv_storeDescription = (TextView) itemView.findViewById(R.id.tv_storeDescription);
        tv_userDescription = (TextView) itemView.findViewById(R.id.tv_sellerDescription);

        iv_comment = (ImageView) itemView.findViewById(R.id.iv_comment);
        iv_menu = (ImageView) itemView.findViewById(R.id.iv_menu);
        iv_share = (ImageView) itemView.findViewById(R.id.iv_share);
        iv_stoke_image_1 = (ImageView) itemView.findViewById(R.id.iv_stokeimage1);
        iv_stock_image_2 = (ImageView) itemView.findViewById(R.id.iv_stokeimage2);
        iv_stock_image_3 = (ImageView) itemView.findViewById(R.id.iv_stokeimage3);
        iv_sellerpic = (ImageView) itemView.findViewById(R.id.iv_sellerpic);

        lv_commentholder = (LinearLayout) itemView.findViewById(R.id.lv_commentholder);
        lv_moreitems_placeholder = (LinearLayout) itemView.findViewById(R.id.lv_moreitems_placeholder);
        lv_sendcomment = (LinearLayout) itemView.findViewById(R.id.lv_send_comment);

        cv_comment_user_prof_pic = (CircleImageView) itemView.findViewById(R.id.cv_comment_user_prof_pic);
        et_comment = (EditText) itemView.findViewById(R.id.et_comment);

        gv_more = (GridView) itemView.findViewById(R.id.gv_more);

    }

    public TextView getTv_sellername() {
        return tv_sellername;
    }

    public void setTv_sellername(TextView tv_sellername) {
        this.tv_sellername = tv_sellername;
    }

    public TextView getTv_sellerlocation() {
        return tv_sellerlocation;
    }

    public void setTv_sellerlocation(TextView tv_sellerlocation) {
        this.tv_sellerlocation = tv_sellerlocation;
    }

    public TextView getTv_storeDescription() {
        return tv_storeDescription;
    }

    public void setTv_storeDescription(TextView tv_storeDescription) {
        this.tv_storeDescription = tv_storeDescription;
    }

    public TextView getTv_follow() {
        return tv_follow;
    }

    public void setTv_follow(TextView tv_follow) {
        this.tv_follow = tv_follow;
    }

    public TextView getTv_userDescription() {
        return tv_userDescription;
    }

    public void setTv_userDescription(TextView tv_userDescription) {
        this.tv_userDescription = tv_userDescription;
    }

    public TextView getTv_premium_extra_count() {
        return tv_premium_extra_count;
    }

    public void setTv_premium_extra_count(TextView tv_premium_extra_count) {
        this.tv_premium_extra_count = tv_premium_extra_count;
    }

    public TextView getTv_like() {
        return tv_like;
    }

    public void setTv_like(TextView tv_like) {
        this.tv_like = tv_like;
    }

    public ImageView getIv_stoke_image_1() {
        return iv_stoke_image_1;
    }

    public void setIv_stoke_image_1(ImageView iv_stoke_image_1) {
        this.iv_stoke_image_1 = iv_stoke_image_1;
    }

    public ImageView getIv_stock_image_2() {
        return iv_stock_image_2;
    }

    public void setIv_stock_image_2(ImageView iv_stock_image_2) {
        this.iv_stock_image_2 = iv_stock_image_2;
    }

    public ImageView getIv_stock_image_3() {
        return iv_stock_image_3;
    }

    public void setIv_stock_image_3(ImageView iv_stock_image_3) {
        this.iv_stock_image_3 = iv_stock_image_3;
    }

    public ImageView getIv_comment() {
        return iv_comment;
    }

    public void setIv_comment(ImageView iv_comment) {
        this.iv_comment = iv_comment;
    }

    public ImageView getIv_share() {
        return iv_share;
    }

    public void setIv_share(ImageView iv_share) {
        this.iv_share = iv_share;
    }

    public ImageView getIv_menu() {
        return iv_menu;
    }

    public void setIv_menu(ImageView iv_menu) {
        this.iv_menu = iv_menu;
    }

    public LinearLayout getLv_moreitems_placeholder() {
        return lv_moreitems_placeholder;
    }

    public void setLv_moreitems_placeholder(LinearLayout lv_moreitems_placeholder) {
        this.lv_moreitems_placeholder = lv_moreitems_placeholder;
    }

    public LinearLayout getLv_commentholder() {
        return lv_commentholder;
    }

    public void setLv_commentholder(LinearLayout lv_commentholder) {
        this.lv_commentholder = lv_commentholder;
    }

    public LinearLayout getLv_sendcomment() {
        return lv_sendcomment;
    }

    public void setLv_sendcomment(LinearLayout lv_sendcomment) {
        this.lv_sendcomment = lv_sendcomment;
    }

    public CircleImageView getCv_comment_user_prof_pic() {
        return cv_comment_user_prof_pic;
    }

    public void setCv_comment_user_prof_pic(CircleImageView cv_comment_user_prof_pic) {
        this.cv_comment_user_prof_pic = cv_comment_user_prof_pic;
    }

    public EditText getEt_comment() {
        return et_comment;
    }

    public void setEt_comment(EditText et_comment) {
        this.et_comment = et_comment;
    }
}
