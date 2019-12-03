package com.example.tian.service.wechatApi;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SendMessageService {

    //给一群人发消息
    public void sendMessage(List<String> userIdList,String content){
        //todo  调用微信接口，给一群人发消息
    }
}
