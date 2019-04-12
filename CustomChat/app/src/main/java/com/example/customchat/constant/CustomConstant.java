package com.example.customchat.constant;

import com.ncapdevi.fragnav.FragNavController;

public interface CustomConstant {
    interface LogConstant {
        String CUS_MAIN_ACTIVITY = "custom_main_act";
        String CUS_CHATTING_ACTIVITY = "custom_chatting_act";
        String CUS_MY_FCM_SERVICE = "custom_my_fcm_serv";
        String CUS_MY_FIREBASE_SERV = "custom_my_fb_serv";
        String CUS_ASYNC_TASK = "custom_async_task";
        String CUS_LOGIN_ACTIVITY = "custom_login_act";
    }

    interface ConfigConstant {
        String LOGIN_SERVER_URL = "";
        String CHATTING_SERVER_URL = "";
    }

    interface CommunicatingType {
        String TYPE_SIGNIN = "signin";
        String TYPE_SIGNUP = "signup";
        String TYPE_SEND_MESSAGE = "sendmessage";
    }

    interface CommunicatingCodeResult {
        String CODE_SUCCESS = "200";
        String CODE_FAIL = "404";
    }

    interface FragNavRootIndex {
        int INDEX_FRIENDS = FragNavController.TAB1;
        int INDEX_CHATTINGS = FragNavController.TAB2;
        int INDEX_SEARCH = FragNavController.TAB3;
        int INDEX_MY_SETTINGS = FragNavController.TAB4;
    }
}
