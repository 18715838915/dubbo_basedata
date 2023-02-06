-- ys_base_db.core_user_Infos definition

CREATE TABLE `core_user_Info` (
  `id` bigint(20) NOT NULL DEFAULT '0',
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `isDeleted` bit(1) NOT NULL DEFAULT b'0',
  `deleteTime` timestamp NULL DEFAULT NULL,
  `updateTime` timestamp NULL DEFAULT NULL,
  `createUserId` bigint(20) DEFAULT NULL,
  `updateUserId` bigint(20) DEFAULT NULL,
  `status` int(11) NOT NULL DEFAULT '0',
  `notes` varchar(512) DEFAULT NULL,
  `versionNum` bigint(20) NOT NULL DEFAULT '0',
  `tenantId` bigint(20) NOT NULL DEFAULT '0',
  `orgId` bigint(20) NOT NULL DEFAULT '0',
  `userName` varchar(60) NOT NULL,
  `workId` varchar(128) DEFAULT NULL,
  `userCode` varchar(128) DEFAULT NULL,
  `sex` int(11) NOT NULL DEFAULT '0',
  `age` int(11) NOT NULL DEFAULT '0',
  `nationality` bigint(20) NOT NULL DEFAULT '0',
  `birthday` date DEFAULT NULL,
  `idCard` varchar(20) DEFAULT NULL,
  `userType` int(11) NOT NULL DEFAULT '0',
  `phone` varchar(20) DEFAULT NULL,
  `securityLevel` int(11) NOT NULL DEFAULT '0',
  `email` varchar(50) DEFAULT NULL,
  `weChat` varchar(50) DEFAULT NULL,
  `qq` varchar(20) DEFAULT NULL,
  `isMarried` int(11) NOT NULL DEFAULT '0',
  `politicalAttitudes` bigint(20) NOT NULL DEFAULT '0',
  `joinTime` date DEFAULT NULL,
  `education` bigint(20) DEFAULT NULL,
  `academicDegree` bigint(20) DEFAULT NULL,
  `registeredPermanentAddressLocusId` bigint(20) DEFAULT NULL,
  `registeredPermanentAddressLocusDetail` varchar(255) DEFAULT NULL,
  `registeredPermanentAddressLocusFull` varchar(255) DEFAULT NULL,
  `addressAreaId` bigint(20) DEFAULT NULL,
  `detailedAddress` varchar(255) DEFAULT NULL,
  `addressFull` varchar(255) DEFAULT NULL,
  `userAvatarUri` varchar(1024) DEFAULT NULL,
  `reason` varchar(255) DEFAULT NULL,
  `accountId` bigint(20) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `IX_core_user_Info_email` (`email`),
  KEY `IX_core_user_Info_idCard` (`idCard`),
  KEY `IX_core_user_Info_orgId` (`orgId`),
  KEY `IX_core_user_Info_phone` (`phone`),
  KEY `IX_core_user_Info_tenantId` (`tenantId`),
  KEY `IX_core_user_Info_userCode` (`userCode`),
  KEY `IX_core_user_Info_workId` (`workId`),
  KEY `IX_core_user_Info_accountId` (`accountId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



-- ys_base_db.core_accounts definition

CREATE TABLE `core_account` (
  `id` bigint(20) NOT NULL DEFAULT '0',
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `isDeleted` bit(1) NOT NULL DEFAULT b'0',
  `deleteTime` timestamp NULL DEFAULT NULL,
  `updateTime` timestamp NULL DEFAULT NULL,
  `createUserId` bigint(20) DEFAULT NULL,
  `updateUserId` bigint(20) DEFAULT NULL,
  `status` int(11) NOT NULL DEFAULT '0',
  `notes` varchar(512) DEFAULT NULL,
  `versionNum` bigint(20) NOT NULL DEFAULT '0',
  `tenantId` bigint(20) NOT NULL DEFAULT '0',
  `orgId` bigint(20) NOT NULL DEFAULT '0',
  `userName` varchar(30) NOT NULL,
  `password` varchar(128) NOT NULL,
  `phone` varchar(30) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phoneVerify` bit(1) NOT NULL DEFAULT b'0',
  `emailVerify` bit(1) NOT NULL DEFAULT b'0',
  `locked` bit(1) NOT NULL DEFAULT b'0',
  `retryCount` int(11) NOT NULL DEFAULT '3',
  `userInfoId` bigint(20) NOT NULL DEFAULT '0',
  `mustResetPwd` bit(1) NOT NULL DEFAULT b'0',
  `defaultAdmin` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`id`),
  KEY `IX_core_account_email` (`email`),
  KEY `IX_core_account_orgId` (`orgId`),
  KEY `IX_core_account_phone` (`phone`),
  KEY `IX_core_account_tenantId` (`tenantId`),
  KEY `IX_core_account_userInfoId` (`userInfoId`),
  KEY `IX_core_account_userName` (`userName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
















