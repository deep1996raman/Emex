package com.example.android.emex;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.emex.fragment.JobHistory;
import com.example.android.emex.fragment.Map;

//import fragment.*;

import org.w3c.dom.Text;

import static android.R.attr.fragment;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{
    private DrawerLayout mdrawerLayout;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private TextView tvJobhistory;
    private Map map;


    @Override
    /**
     * drawer setting up
     */
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
        map = new Map();

        fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.content_frame,map);
        fragmentTransaction.commit();
        tvJobhistory.setOnClickListener(this);

    }

    @Override
    public void onClick(final View v) {
        int id;
        id=v.getId();
        switch (id){
            case R.id.tvJobHistory:
                JobHistory jobHistory = new JobHistory();
                fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.content_frame,jobHistory);
                fragmentTransaction.commit();
                break;
            default:
                break;
        }

    }
    private  void  init(){
        mdrawerLayout=(DrawerLayout)findViewById(R.id.drawer);
        tvJobhistory=(TextView)findViewById(R.id.tvJobHistory);
        fragmentManager=getSupportFragmentManager();

    }
}
