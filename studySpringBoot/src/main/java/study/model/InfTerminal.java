package study.model;

import lombok.Data;

import java.util.Date;

@Data
public class InfTerminal {
    private String id;

    private String imei;

    private String name;

    private String tel;

    private String certNo;

    private String tagNo;

    private String orgId;

    private String installerUsername;

    private Integer status;

    private Date createDate;

    private Date updateDate;

    private String createUsername;

    private String updateUsername;

    private String terModel;

    private String protocolModel;

    private String deviceModelId;

    private String equipmentModel;

    private String manufacturer;

    private Date installerDate;

    private Date effDate;

    private Date expDate;

    private String voltage;

    private String teName;

    private String addr;

    private String macAddress;

    private String password;

    private String headImage;

    private String remark;

    private Integer onlineStatus;

    private String efenceId;

    private String groupId;

    private String efenceGroupId;

    private String ggaLevel;

    private String cardIccid;

    private String cardNo;

    private String cardNetType;

    private String cardSetMeal;

    private String softwareVersion;

    private String firmwareVersion;

    private String ntripAddr;

    private Integer ntripPort;

    private String ntripUser;

    private String ntripPassword;

    private String ntripMountpoint;

    private String ntripType;

    private Date ntripExpireDate;

    private String jt808Addr;

    private Integer jt808Port;

    private String createUserId;

    private String updateUserId;

    private String versionId;

    private Integer installStatus;

    private Boolean calcMileage;

    private Boolean relayMessage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo == null ? null : certNo.trim();
    }

    public String getTagNo() {
        return tagNo;
    }

    public void setTagNo(String tagNo) {
        this.tagNo = tagNo == null ? null : tagNo.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getInstallerUsername() {
        return installerUsername;
    }

    public void setInstallerUsername(String installerUsername) {
        this.installerUsername = installerUsername == null ? null : installerUsername.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getCreateUsername() {
        return createUsername;
    }

    public void setCreateUsername(String createUsername) {
        this.createUsername = createUsername == null ? null : createUsername.trim();
    }

    public String getUpdateUsername() {
        return updateUsername;
    }

    public void setUpdateUsername(String updateUsername) {
        this.updateUsername = updateUsername == null ? null : updateUsername.trim();
    }

    public String getTerModel() {
        return terModel;
    }

    public void setTerModel(String terModel) {
        this.terModel = terModel == null ? null : terModel.trim();
    }

    public String getProtocolModel() {
        return protocolModel;
    }

    public void setProtocolModel(String protocolModel) {
        this.protocolModel = protocolModel == null ? null : protocolModel.trim();
    }

    public String getDeviceModelId() {
        return deviceModelId;
    }

    public void setDeviceModelId(String deviceModelId) {
        this.deviceModelId = deviceModelId == null ? null : deviceModelId.trim();
    }

    public String getEquipmentModel() {
        return equipmentModel;
    }

    public void setEquipmentModel(String equipmentModel) {
        this.equipmentModel = equipmentModel == null ? null : equipmentModel.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public Date getInstallerDate() {
        return installerDate;
    }

    public void setInstallerDate(Date installerDate) {
        this.installerDate = installerDate;
    }

    public Date getEffDate() {
        return effDate;
    }

    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage == null ? null : voltage.trim();
    }

    public String getTeName() {
        return teName;
    }

    public void setTeName(String teName) {
        this.teName = teName == null ? null : teName.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress == null ? null : macAddress.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage == null ? null : headImage.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(Integer onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public String getEfenceId() {
        return efenceId;
    }

    public void setEfenceId(String efenceId) {
        this.efenceId = efenceId == null ? null : efenceId.trim();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getEfenceGroupId() {
        return efenceGroupId;
    }

    public void setEfenceGroupId(String efenceGroupId) {
        this.efenceGroupId = efenceGroupId == null ? null : efenceGroupId.trim();
    }

    public String getGgaLevel() {
        return ggaLevel;
    }

    public void setGgaLevel(String ggaLevel) {
        this.ggaLevel = ggaLevel == null ? null : ggaLevel.trim();
    }

    public String getCardIccid() {
        return cardIccid;
    }

    public void setCardIccid(String cardIccid) {
        this.cardIccid = cardIccid == null ? null : cardIccid.trim();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public String getCardNetType() {
        return cardNetType;
    }

    public void setCardNetType(String cardNetType) {
        this.cardNetType = cardNetType == null ? null : cardNetType.trim();
    }

    public String getCardSetMeal() {
        return cardSetMeal;
    }

    public void setCardSetMeal(String cardSetMeal) {
        this.cardSetMeal = cardSetMeal == null ? null : cardSetMeal.trim();
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion == null ? null : softwareVersion.trim();
    }

    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion == null ? null : firmwareVersion.trim();
    }

    public String getNtripAddr() {
        return ntripAddr;
    }

    public void setNtripAddr(String ntripAddr) {
        this.ntripAddr = ntripAddr == null ? null : ntripAddr.trim();
    }

    public Integer getNtripPort() {
        return ntripPort;
    }

    public void setNtripPort(Integer ntripPort) {
        this.ntripPort = ntripPort;
    }

    public String getNtripUser() {
        return ntripUser;
    }

    public void setNtripUser(String ntripUser) {
        this.ntripUser = ntripUser == null ? null : ntripUser.trim();
    }

    public String getNtripPassword() {
        return ntripPassword;
    }

    public void setNtripPassword(String ntripPassword) {
        this.ntripPassword = ntripPassword == null ? null : ntripPassword.trim();
    }

    public String getNtripMountpoint() {
        return ntripMountpoint;
    }

    public void setNtripMountpoint(String ntripMountpoint) {
        this.ntripMountpoint = ntripMountpoint == null ? null : ntripMountpoint.trim();
    }

    public String getNtripType() {
        return ntripType;
    }

    public void setNtripType(String ntripType) {
        this.ntripType = ntripType == null ? null : ntripType.trim();
    }

    public Date getNtripExpireDate() {
        return ntripExpireDate;
    }

    public void setNtripExpireDate(Date ntripExpireDate) {
        this.ntripExpireDate = ntripExpireDate;
    }

    public String getJt808Addr() {
        return jt808Addr;
    }

    public void setJt808Addr(String jt808Addr) {
        this.jt808Addr = jt808Addr == null ? null : jt808Addr.trim();
    }

    public Integer getJt808Port() {
        return jt808Port;
    }

    public void setJt808Port(Integer jt808Port) {
        this.jt808Port = jt808Port;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }

    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId == null ? null : versionId.trim();
    }

    public Integer getInstallStatus() {
        return installStatus;
    }

    public void setInstallStatus(Integer installStatus) {
        this.installStatus = installStatus;
    }

    public Boolean getCalcMileage() {
        return calcMileage;
    }

    public void setCalcMileage(Boolean calcMileage) {
        this.calcMileage = calcMileage;
    }

    public Boolean getRelayMessage() {
        return relayMessage;
    }

    public void setRelayMessage(Boolean relayMessage) {
        this.relayMessage = relayMessage;
    }
}