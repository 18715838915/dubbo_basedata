package org.luoyu.dubbo.infrastructure.mysql.user.service.impl;

import org.luoyu.dubbo.infrastructure.mysql.user.model.CoreAccount;
import org.luoyu.dubbo.infrastructure.mysql.user.mapper.CoreAccountMapper;
import org.luoyu.dubbo.infrastructure.mysql.user.service.ICoreAccountService;
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
public class CoreAccountServiceImpl extends ServiceImpl<CoreAccountMapper, CoreAccount> implements ICoreAccountService {

}
