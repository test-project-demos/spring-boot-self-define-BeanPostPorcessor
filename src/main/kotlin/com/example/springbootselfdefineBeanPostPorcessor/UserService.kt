package com.example.springbootselfdefineBeanPostPorcessor

import org.springframework.stereotype.Service

/**
 * @author zhixiao.mzx
 * @date 2019-06-16
 */
@Service
class UserService {
    fun getUserName(id: Long): String {
        return id.toString()
    }
}