package com.openclassrooms.myamazingviewpager.Controllers.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.openclassrooms.myamazingviewpager.R;


public class ParamPageFragment extends Fragment {


    public ParamPageFragment() { }


     public static ParamPageFragment newInstance() {
        return (new ParamPageFragment());
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_param_page, container, false);
    }
}