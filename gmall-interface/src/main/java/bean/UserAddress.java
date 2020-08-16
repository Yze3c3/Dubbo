package bean;

import java.io.Serializable;

public class UserAddress implements Serializable {
    private Integer id;
    private String userAddress; //用户地址
    private String userId;     //用户id
    private String consigness; //收货人
    private String phoneNum; //电话号码
    private String isDefault; //是否为默认收货地址 Y:是 N:否

    public UserAddress() {
        super();
    }

    public UserAddress(Integer id, String userAddress, String userId, String consigness, String phoneNum, String isDefault) {
        this.id = id;
        this.userAddress = userAddress;
        this.userId = userId;
        this.consigness = consigness;
        this.phoneNum = phoneNum;
        this.isDefault = isDefault;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getConsigness() {
        return consigness;
    }

    public void setConsigness(String consigness) {
        this.consigness = consigness;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }
}
