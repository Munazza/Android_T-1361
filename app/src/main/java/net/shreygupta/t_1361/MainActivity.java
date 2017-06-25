package net.shreygupta.t_1361;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout l = new LinearLayout(this);

        ImageView i = new ImageView(this);

        EditText e1 = new EditText(this);
        EditText e2 = new EditText(this);

        Button b1 = new Button(this);
        Button b2 = new Button(this);
        Button b3 = new Button(this);

        LinearLayout.LayoutParams dim = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        l.setLayoutParams(dim);

        LinearLayout.LayoutParams dim_i = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        i.setLayoutParams(dim_i);

        LinearLayout.LayoutParams dim_e1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dim_e1.topMargin = 280;
        dim_e1.leftMargin = 150;
        dim_e1.rightMargin = 150;
        e1.setLayoutParams(dim_e1);

        LinearLayout.LayoutParams dim_e2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dim_e2.topMargin = 40;
        dim_e2.leftMargin = 150;
        dim_e2.rightMargin = 150;
        e2.setLayoutParams(dim_e2);

        LinearLayout.LayoutParams dim_b1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dim_b1.topMargin = 50;
        dim_b1.leftMargin = 150;
        dim_b1.rightMargin = 150;
        b1.setLayoutParams(dim_b1);

        LinearLayout.LayoutParams dim_b2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dim_b2.topMargin = 20;
        dim_b2.leftMargin = 150;
        dim_b2.rightMargin = 150;
        b2.setLayoutParams(dim_b2);

        LinearLayout.LayoutParams dim_b3 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dim_b3.topMargin = 150;
        dim_b3.leftMargin = 150;
        dim_b3.rightMargin = 150;
        b3.setLayoutParams(dim_b3);

        l.setOrientation(LinearLayout.VERTICAL);

        i.setImageResource(R.drawable.res);
        i.setAdjustViewBounds(true);

        e1.setHint("Enter Email or Phone");
        e1.setPadding(30, 0, 0, 50);

        e2.setHint("Enter Password");
        e2.setPadding(30, 0, 0, 50);


        b1.setText("LOG IN");
        b1.setBackgroundColor(0xFF3E5391);
        b1.setTextColor(0xFF8C9BBF);
        b1.setTextSize(17);

        b2.setText("FORGOT PASSWORD?");
        b2.setBackgroundColor(Color.TRANSPARENT);
        b2.setTextColor(0xFF3351A3);
        b2.setTextSize(17);

        b3.setText("CREATE NEW FACEBOOK ACCOUNT");
        b3.setBackgroundColor(0xFF38AD20);
        b3.setTextColor(0xFFFFFFFF);
        b3.setTextSize(17);

        l.addView(i);
        l.addView(e1);
        l.addView(e2);
        l.addView(b1);
        l.addView(b2);
        l.addView(b3);

        setContentView(l);
    }
}