package org.luoyu.dubbo.infrastructure.mysql.user.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.Version;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author LuoYu
 * @since 2023-02-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CoreAccount extends Model<CoreAccount> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @TableField(value = "createTime", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField("isDeleted")
    @TableLogic
    private Boolean isDeleted;

    @TableField("deleteTime")
    private LocalDateTime deleteTime;

    @TableField(value = "updateTime", fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

    @TableField("createUserId")
    private Long createUserId;

    @TableField(value = "updateUserId", fill = FieldFill.UPDATE)
    private Long updateUserId;

    private Integer status;

    private String notes;

    @TableField("versionNum")
    @Version
    private Long versionNum;

    @TableField("tenantId")
    private Long tenantId;

    @TableField("orgId")
    private Long orgId;

    @TableField("userName")
    private String userName;

    private String password;

    private String phone;

    private String email;

    @TableField("phoneVerify")
    private Boolean phoneVerify;

    @TableField("emailVerify")
    private Boolean emailVerify;

    private Boolean locked;

    @TableField("retryCount")
    private Integer retryCount;

    @TableField("userInfoId")
    private Long userInfoId;

    @TableField("mustResetPwd")
    private Boolean mustResetPwd;

    @TableField("defaultAdmin")
    private Boolean defaultAdmin;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
