package com.example.customfragnavapplication.constant;

import com.ncapdevi.fragnav.FragNavController;

public interface CustomConstant {
    interface LogConstant {
        String CUS_HOME_FRAG = "custom_home_frag";
        String CUS_MY_YOGIYO_FRAG = "custom_my_yogiyo_frag";
        String CUS_SEARCH_FRAG = "custom_search_frag";
        String CUS_ORDER_FRAG = "custom_order_frag";
        String CUS_MAIN_ACT = "custom_main_act";
    }

    interface FragNavConstant {
        int INDEX_HOME = FragNavController.TAB1;
        int INDEX_SEARCH = FragNavController.TAB2;
        int INDEX_ORDER_HISTORY = FragNavController.TAB3;
        int INDEX_MY_YOGIYO = FragNavController.TAB4;
    }
}
