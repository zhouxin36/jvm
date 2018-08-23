package base;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class User {

    private String userId;

    private String email;

    private String userName;

    private String pwd;

    private String emailToken;

    private LocalDateTime emailActiveDate;

    private String realName;

    private String identityCard;

    private Boolean authenticationState;

    private String problemOne;

    private String answerOne;

    private String problemTwo;

    private String answerTwo;

    private String telNo;

    private String telAuthenCode;

    private LocalDateTime telAuthenDate;

    private Integer level;

    private LocalDateTime levelBeginDate;

    private LocalDateTime levelEndDate;

    private String headImage;

    private LocalDateTime addDate;

    private Boolean longAutoSetting;

    private Boolean shortAutoSetting;

    private Boolean flowAutoSetting;

    private String bankAccountNo;

    private Integer bankType;

    private String bankProvice;

    private String bankCity;

    private String openBankName;

    private Integer authenState;

    private BigDecimal creditGrantingAmount;

    private BigDecimal usedCreditGrantingAmount;

    private Integer creditGrantingStatus;

    private String auditRecordId;

    private BigDecimal checkingUsedCreditGrantingAmount;

    private BigDecimal aviCreditGrantingAmount;

    private Integer sex;

    private String otherBankName;

    private Integer uStatus;

    private Boolean oldPwdStatus;

    private String thirdPartyId;

    private Integer thirdPartyType;

    private String extendKey;

    private String extenderKey;

    private Boolean extendUsed;

    private Integer failedPasswordCount;

    private LocalDateTime failedPasswordDate;

    private Integer type;

    private BigDecimal netWorth;

    private String payPwd;

    private String nickName;

    private Boolean is_Edit;

    private Boolean isTuandaiBao;

    private LocalDateTime lastLoginDate;

    private LocalDateTime birthday;

    private Integer credTypeId;

    private Integer userTypeId;

    private Integer creditRating;

    private String creditRatingName;

    private BigDecimal ratingParam;

    private Integer topNetWorth;

    private Boolean isShareholder;

    private Integer numberOfShares;

    private Boolean isValidateEmail;

    private Boolean isValidateMobile;

    private Boolean isValidateIdentity;

    private Boolean isSafeQuestion;

    private String openId;

    private Boolean isBindOpenId;

    private String insiderCode;

    private BigDecimal registerBonus;

    private BigDecimal penaltyRate;

    private Integer status1;

    private Integer status2;

    private Integer status3;

    private Integer status4;

    private Integer status5;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmailToken() {
        return emailToken;
    }

    public void setEmailToken(String emailToken) {
        this.emailToken = emailToken;
    }

    public LocalDateTime getEmailActiveDate() {
        return emailActiveDate;
    }

    public void setEmailActiveDate(LocalDateTime emailActiveDate) {
        this.emailActiveDate = emailActiveDate;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public Boolean getAuthenticationState() {
        return authenticationState;
    }

    public void setAuthenticationState(Boolean authenticationState) {
        this.authenticationState = authenticationState;
    }

    public String getProblemOne() {
        return problemOne;
    }

    public void setProblemOne(String problemOne) {
        this.problemOne = problemOne;
    }

    public String getAnswerOne() {
        return answerOne;
    }

    public void setAnswerOne(String answerOne) {
        this.answerOne = answerOne;
    }

    public String getProblemTwo() {
        return problemTwo;
    }

    public void setProblemTwo(String problemTwo) {
        this.problemTwo = problemTwo;
    }

    public String getAnswerTwo() {
        return answerTwo;
    }

    public void setAnswerTwo(String answerTwo) {
        this.answerTwo = answerTwo;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getTelAuthenCode() {
        return telAuthenCode;
    }

    public void setTelAuthenCode(String telAuthenCode) {
        this.telAuthenCode = telAuthenCode;
    }

    public LocalDateTime getTelAuthenDate() {
        return telAuthenDate;
    }

    public void setTelAuthenDate(LocalDateTime telAuthenDate) {
        this.telAuthenDate = telAuthenDate;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public LocalDateTime getLevelBeginDate() {
        return levelBeginDate;
    }

    public void setLevelBeginDate(LocalDateTime levelBeginDate) {
        this.levelBeginDate = levelBeginDate;
    }

    public LocalDateTime getLevelEndDate() {
        return levelEndDate;
    }

    public void setLevelEndDate(LocalDateTime levelEndDate) {
        this.levelEndDate = levelEndDate;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public LocalDateTime getAddDate() {
        return addDate;
    }

    public void setAddDate(LocalDateTime addDate) {
        this.addDate = addDate;
    }

    public Boolean getLongAutoSetting() {
        return longAutoSetting;
    }

    public void setLongAutoSetting(Boolean longAutoSetting) {
        this.longAutoSetting = longAutoSetting;
    }

    public Boolean getShortAutoSetting() {
        return shortAutoSetting;
    }

    public void setShortAutoSetting(Boolean shortAutoSetting) {
        this.shortAutoSetting = shortAutoSetting;
    }

    public Boolean getFlowAutoSetting() {
        return flowAutoSetting;
    }

    public void setFlowAutoSetting(Boolean flowAutoSetting) {
        this.flowAutoSetting = flowAutoSetting;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public Integer getBankType() {
        return bankType;
    }

    public void setBankType(Integer bankType) {
        this.bankType = bankType;
    }

    public String getBankProvice() {
        return bankProvice;
    }

    public void setBankProvice(String bankProvice) {
        this.bankProvice = bankProvice;
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity;
    }

    public String getOpenBankName() {
        return openBankName;
    }

    public void setOpenBankName(String openBankName) {
        this.openBankName = openBankName;
    }

    public Integer getAuthenState() {
        return authenState;
    }

    public void setAuthenState(Integer authenState) {
        this.authenState = authenState;
    }

    public BigDecimal getCreditGrantingAmount() {
        return creditGrantingAmount;
    }

    public void setCreditGrantingAmount(BigDecimal creditGrantingAmount) {
        this.creditGrantingAmount = creditGrantingAmount;
    }

    public BigDecimal getUsedCreditGrantingAmount() {
        return usedCreditGrantingAmount;
    }

    public void setUsedCreditGrantingAmount(BigDecimal usedCreditGrantingAmount) {
        this.usedCreditGrantingAmount = usedCreditGrantingAmount;
    }

    public Integer getCreditGrantingStatus() {
        return creditGrantingStatus;
    }

    public void setCreditGrantingStatus(Integer creditGrantingStatus) {
        this.creditGrantingStatus = creditGrantingStatus;
    }

    public String getAuditRecordId() {
        return auditRecordId;
    }

    public void setAuditRecordId(String auditRecordId) {
        this.auditRecordId = auditRecordId;
    }

    public BigDecimal getCheckingUsedCreditGrantingAmount() {
        return checkingUsedCreditGrantingAmount;
    }

    public void setCheckingUsedCreditGrantingAmount(BigDecimal checkingUsedCreditGrantingAmount) {
        this.checkingUsedCreditGrantingAmount = checkingUsedCreditGrantingAmount;
    }

    public BigDecimal getAviCreditGrantingAmount() {
        return aviCreditGrantingAmount;
    }

    public void setAviCreditGrantingAmount(BigDecimal aviCreditGrantingAmount) {
        this.aviCreditGrantingAmount = aviCreditGrantingAmount;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getOtherBankName() {
        return otherBankName;
    }

    public void setOtherBankName(String otherBankName) {
        this.otherBankName = otherBankName;
    }

    public Integer getuStatus() {
        return uStatus;
    }

    public void setuStatus(Integer uStatus) {
        this.uStatus = uStatus;
    }

    public Boolean getOldPwdStatus() {
        return oldPwdStatus;
    }

    public void setOldPwdStatus(Boolean oldPwdStatus) {
        this.oldPwdStatus = oldPwdStatus;
    }

    public String getThirdPartyId() {
        return thirdPartyId;
    }

    public void setThirdPartyId(String thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
    }

    public Integer getThirdPartyType() {
        return thirdPartyType;
    }

    public void setThirdPartyType(Integer thirdPartyType) {
        this.thirdPartyType = thirdPartyType;
    }

    public String getExtendKey() {
        return extendKey;
    }

    public void setExtendKey(String extendKey) {
        this.extendKey = extendKey;
    }

    public String getExtenderKey() {
        return extenderKey;
    }

    public void setExtenderKey(String extenderKey) {
        this.extenderKey = extenderKey;
    }

    public Boolean getExtendUsed() {
        return extendUsed;
    }

    public void setExtendUsed(Boolean extendUsed) {
        this.extendUsed = extendUsed;
    }

    public Integer getFailedPasswordCount() {
        return failedPasswordCount;
    }

    public void setFailedPasswordCount(Integer failedPasswordCount) {
        this.failedPasswordCount = failedPasswordCount;
    }

    public LocalDateTime getFailedPasswordDate() {
        return failedPasswordDate;
    }

    public void setFailedPasswordDate(LocalDateTime failedPasswordDate) {
        this.failedPasswordDate = failedPasswordDate;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BigDecimal getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(BigDecimal netWorth) {
        this.netWorth = netWorth;
    }

    public String getPayPwd() {
        return payPwd;
    }

    public void setPayPwd(String payPwd) {
        this.payPwd = payPwd;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Boolean getIs_Edit() {
        return is_Edit;
    }

    public void setIs_Edit(Boolean is_Edit) {
        this.is_Edit = is_Edit;
    }

    public Boolean getTuandaiBao() {
        return isTuandaiBao;
    }

    public void setTuandaiBao(Boolean tuandaiBao) {
        isTuandaiBao = tuandaiBao;
    }

    public LocalDateTime getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(LocalDateTime lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public Integer getCredTypeId() {
        return credTypeId;
    }

    public void setCredTypeId(Integer credTypeId) {
        this.credTypeId = credTypeId;
    }

    public Integer getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    public Integer getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(Integer creditRating) {
        this.creditRating = creditRating;
    }

    public String getCreditRatingName() {
        return creditRatingName;
    }

    public void setCreditRatingName(String creditRatingName) {
        this.creditRatingName = creditRatingName;
    }

    public BigDecimal getRatingParam() {
        return ratingParam;
    }

    public void setRatingParam(BigDecimal ratingParam) {
        this.ratingParam = ratingParam;
    }

    public Integer getTopNetWorth() {
        return topNetWorth;
    }

    public void setTopNetWorth(Integer topNetWorth) {
        this.topNetWorth = topNetWorth;
    }

    public Boolean getShareholder() {
        return isShareholder;
    }

    public void setShareholder(Boolean shareholder) {
        isShareholder = shareholder;
    }

    public Integer getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(Integer numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public Boolean getValidateEmail() {
        return isValidateEmail;
    }

    public void setValidateEmail(Boolean validateEmail) {
        isValidateEmail = validateEmail;
    }

    public Boolean getValidateMobile() {
        return isValidateMobile;
    }

    public void setValidateMobile(Boolean validateMobile) {
        isValidateMobile = validateMobile;
    }

    public Boolean getValidateIdentity() {
        return isValidateIdentity;
    }

    public void setValidateIdentity(Boolean validateIdentity) {
        isValidateIdentity = validateIdentity;
    }

    public Boolean getSafeQuestion() {
        return isSafeQuestion;
    }

    public void setSafeQuestion(Boolean safeQuestion) {
        isSafeQuestion = safeQuestion;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Boolean getBindOpenId() {
        return isBindOpenId;
    }

    public void setBindOpenId(Boolean bindOpenId) {
        isBindOpenId = bindOpenId;
    }

    public String getInsiderCode() {
        return insiderCode;
    }

    public void setInsiderCode(String insiderCode) {
        this.insiderCode = insiderCode;
    }

    public BigDecimal getRegisterBonus() {
        return registerBonus;
    }

    public void setRegisterBonus(BigDecimal registerBonus) {
        this.registerBonus = registerBonus;
    }

    public BigDecimal getPenaltyRate() {
        return penaltyRate;
    }

    public void setPenaltyRate(BigDecimal penaltyRate) {
        this.penaltyRate = penaltyRate;
    }

    public Integer getStatus1() {
        return status1;
    }

    public void setStatus1(Integer status1) {
        this.status1 = status1;
    }

    public Integer getStatus2() {
        return status2;
    }

    public void setStatus2(Integer status2) {
        this.status2 = status2;
    }

    public Integer getStatus3() {
        return status3;
    }

    public void setStatus3(Integer status3) {
        this.status3 = status3;
    }

    public Integer getStatus4() {
        return status4;
    }

    public void setStatus4(Integer status4) {
        this.status4 = status4;
    }

    public Integer getStatus5() {
        return status5;
    }

    public void setStatus5(Integer status5) {
        this.status5 = status5;
    }

    public String toString1() {
        return ReflectionToStringBuilder.toString(this,ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String toString2() {
        return new ToStringBuilder(this)
                .append("userId", userId)
                .append("email", email)
                .append("userName", userName)
                .append("pwd", pwd)
                .append("emailToken", emailToken)
                .append("emailActiveDate", emailActiveDate)
                .append("realName", realName)
                .append("identityCard", identityCard)
                .append("authenticationState", authenticationState)
                .append("problemOne", problemOne)
                .append("answerOne", answerOne)
                .append("problemTwo", problemTwo)
                .append("answerTwo", answerTwo)
                .append("telNo", telNo)
                .append("telAuthenCode", telAuthenCode)
                .append("telAuthenDate", telAuthenDate)
                .append("level", level)
                .append("levelBeginDate", levelBeginDate)
                .append("levelEndDate", levelEndDate)
                .append("headImage", headImage)
                .append("addDate", addDate)
                .append("longAutoSetting", longAutoSetting)
                .append("shortAutoSetting", shortAutoSetting)
                .append("flowAutoSetting", flowAutoSetting)
                .append("bankAccountNo", bankAccountNo)
                .append("bankType", bankType)
                .append("bankProvice", bankProvice)
                .append("bankCity", bankCity)
                .append("openBankName", openBankName)
                .append("authenState", authenState)
                .append("creditGrantingAmount", creditGrantingAmount)
                .append("usedCreditGrantingAmount", usedCreditGrantingAmount)
                .append("creditGrantingStatus", creditGrantingStatus)
                .append("auditRecordId", auditRecordId)
                .append("checkingUsedCreditGrantingAmount", checkingUsedCreditGrantingAmount)
                .append("aviCreditGrantingAmount", aviCreditGrantingAmount)
                .append("sex", sex)
                .append("otherBankName", otherBankName)
                .append("uStatus", uStatus)
                .append("oldPwdStatus", oldPwdStatus)
                .append("thirdPartyId", thirdPartyId)
                .append("thirdPartyType", thirdPartyType)
                .append("extendKey", extendKey)
                .append("extenderKey", extenderKey)
                .append("extendUsed", extendUsed)
                .append("failedPasswordCount", failedPasswordCount)
                .append("failedPasswordDate", failedPasswordDate)
                .append("type", type)
                .append("netWorth", netWorth)
                .append("payPwd", payPwd)
                .append("nickName", nickName)
                .append("is_Edit", is_Edit)
                .append("isTuandaiBao", isTuandaiBao)
                .append("lastLoginDate", lastLoginDate)
                .append("birthday", birthday)
                .append("credTypeId", credTypeId)
                .append("userTypeId", userTypeId)
                .append("creditRating", creditRating)
                .append("creditRatingName", creditRatingName)
                .append("ratingParam", ratingParam)
                .append("topNetWorth", topNetWorth)
                .append("isShareholder", isShareholder)
                .append("numberOfShares", numberOfShares)
                .append("isValidateEmail", isValidateEmail)
                .append("isValidateMobile", isValidateMobile)
                .append("isValidateIdentity", isValidateIdentity)
                .append("isSafeQuestion", isSafeQuestion)
                .append("openId", openId)
                .append("isBindOpenId", isBindOpenId)
                .append("insiderCode", insiderCode)
                .append("registerBonus", registerBonus)
                .append("penaltyRate", penaltyRate)
                .append("status1", status1)
                .append("status2", status2)
                .append("status3", status3)
                .append("status4", status4)
                .append("status5", status5)
                .toString();
    }

    public String toString3() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                ", emailToken='" + emailToken + '\'' +
                ", emailActiveDate=" + emailActiveDate +
                ", realName='" + realName + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", authenticationState=" + authenticationState +
                ", problemOne='" + problemOne + '\'' +
                ", answerOne='" + answerOne + '\'' +
                ", problemTwo='" + problemTwo + '\'' +
                ", answerTwo='" + answerTwo + '\'' +
                ", telNo='" + telNo + '\'' +
                ", telAuthenCode='" + telAuthenCode + '\'' +
                ", telAuthenDate=" + telAuthenDate +
                ", level=" + level +
                ", levelBeginDate=" + levelBeginDate +
                ", levelEndDate=" + levelEndDate +
                ", headImage='" + headImage + '\'' +
                ", addDate=" + addDate +
                ", longAutoSetting=" + longAutoSetting +
                ", shortAutoSetting=" + shortAutoSetting +
                ", flowAutoSetting=" + flowAutoSetting +
                ", bankAccountNo='" + bankAccountNo + '\'' +
                ", bankType=" + bankType +
                ", bankProvice='" + bankProvice + '\'' +
                ", bankCity='" + bankCity + '\'' +
                ", openBankName='" + openBankName + '\'' +
                ", authenState=" + authenState +
                ", creditGrantingAmount=" + creditGrantingAmount +
                ", usedCreditGrantingAmount=" + usedCreditGrantingAmount +
                ", creditGrantingStatus=" + creditGrantingStatus +
                ", auditRecordId='" + auditRecordId + '\'' +
                ", checkingUsedCreditGrantingAmount=" + checkingUsedCreditGrantingAmount +
                ", aviCreditGrantingAmount=" + aviCreditGrantingAmount +
                ", sex=" + sex +
                ", otherBankName='" + otherBankName + '\'' +
                ", uStatus=" + uStatus +
                ", oldPwdStatus=" + oldPwdStatus +
                ", thirdPartyId='" + thirdPartyId + '\'' +
                ", thirdPartyType=" + thirdPartyType +
                ", extendKey='" + extendKey + '\'' +
                ", extenderKey='" + extenderKey + '\'' +
                ", extendUsed=" + extendUsed +
                ", failedPasswordCount=" + failedPasswordCount +
                ", failedPasswordDate=" + failedPasswordDate +
                ", type=" + type +
                ", netWorth=" + netWorth +
                ", payPwd='" + payPwd + '\'' +
                ", nickName='" + nickName + '\'' +
                ", is_Edit=" + is_Edit +
                ", isTuandaiBao=" + isTuandaiBao +
                ", lastLoginDate=" + lastLoginDate +
                ", birthday=" + birthday +
                ", credTypeId=" + credTypeId +
                ", userTypeId=" + userTypeId +
                ", creditRating=" + creditRating +
                ", creditRatingName='" + creditRatingName + '\'' +
                ", ratingParam=" + ratingParam +
                ", topNetWorth=" + topNetWorth +
                ", isShareholder=" + isShareholder +
                ", numberOfShares=" + numberOfShares +
                ", isValidateEmail=" + isValidateEmail +
                ", isValidateMobile=" + isValidateMobile +
                ", isValidateIdentity=" + isValidateIdentity +
                ", isSafeQuestion=" + isSafeQuestion +
                ", openId='" + openId + '\'' +
                ", isBindOpenId=" + isBindOpenId +
                ", insiderCode='" + insiderCode + '\'' +
                ", registerBonus=" + registerBonus +
                ", penaltyRate=" + penaltyRate +
                ", status1=" + status1 +
                ", status2=" + status2 +
                ", status3=" + status3 +
                ", status4=" + status4 +
                ", status5=" + status5 +
                '}';
    }
}

