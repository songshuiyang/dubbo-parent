package com.songsy.provider.service.impl;

import com.songsy.api.service.UserService;

/**
 * 服务提供者接口的实现
 * @author songshuiyang
 * @date 2018/7/23 12:02
 */
public class UserServiceImpl implements UserService {

    @Override
    public String getName(String userId) {
        return "songsy" + userId;
    }
}
