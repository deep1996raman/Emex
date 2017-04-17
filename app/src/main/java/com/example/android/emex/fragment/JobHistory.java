package com.example.android.emex.fragment;

import android.os.Bundle;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.emex.Constants.constants;
import com.example.android.emex.R;

import java.util.ArrayList;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

/**
 * Created by abc on 14-Apr-17.
 */

public class JobHistory extends Fragment implements constants {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.job_history,container,false);
        init();
return view;

    }
    private void init(){


    }
}
