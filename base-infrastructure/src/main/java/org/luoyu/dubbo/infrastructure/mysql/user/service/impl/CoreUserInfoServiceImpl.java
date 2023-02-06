package org.luoyu.dubbo.infrastructure.mysql.user.service.impl;

import org.luoyu.dubbo.infrastructure.mysql.user.model.CoreUserInfo;
import org.luoyu.dubbo.infrastructure.mysql.user.mapper.CoreUserInfoMapper;
import org.luoyu.dubbo.infrastructure.mysql.user.service.ICoreUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author LuoYu
 * @since 2023-02-06
 */
@Service
public class CoreUserInfoServiceImpl extends ServiceImpl<CoreUserInfoMapper, CoreUserInfo> implements ICoreUserInfoService {

}
