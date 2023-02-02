package com.guo.security.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guo.security.entity.SysUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService, IService<SysUser> {
}
