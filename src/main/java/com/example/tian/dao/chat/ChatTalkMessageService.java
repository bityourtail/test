package com.example.tian.dao.chat;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ChatTalkMessageService {
    @Resource
    private ChatTalkMessageMapper chatTalkMessageMapper;
}
