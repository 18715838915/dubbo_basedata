package org.luoyu.dubbo.infrastructure.mysql.user.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
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
@TableName("core_user_Info")
public class CoreUserInfo extends Model<CoreUserInfo> {

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

    @TableField("workId")
    private String workId;

    @TableField("userCode")
    private String userCode;

    private Integer sex;

    private Integer age;

    private Long nationality;

    private LocalDate birthday;

    @TableField("idCard")
    private String idCard;

    @TableField("userType")
    private Integer userType;

    private String phone;

    @TableField("securityLevel")
    private Integer securityLevel;

    private String email;

    @TableField("weChat")
    private String weChat;

    private String qq;

    @TableField("isMarried")
    private Integer isMarried;

    @TableField("politicalAttitudes")
    private Long politicalAttitudes;

    @TableField("joinTime")
    private LocalDate joinTime;

    private Long education;

    @TableField("academicDegree")
    private Long academicDegree;

    @TableField("registeredPermanentAddressLocusId")
    private Long registeredPermanentAddressLocusId;

    @TableField("registeredPermanentAddressLocusDetail")
    private String registeredPermanentAddressLocusDetail;

    @TableField("registeredPermanentAddressLocusFull")
    private String registeredPermanentAddressLocusFull;

    @TableField("addressAreaId")
    private Long addressAreaId;

    @TableField("detailedAddress")
    private String detailedAddress;

    @TableField("addressFull")
    private String addressFull;

    @TableField("userAvatarUri")
    private String userAvatarUri;

    private String reason;

    @TableField("accountId")
    private Long accountId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
