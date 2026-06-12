package com.example.fragmentscommunicationapplication;

import android.support.v4.app.Fragment;

public interface OnFragmentInteractionListener {
    void setFragment(Fragment fragment);
    String getNowFragmentClassName();
}
