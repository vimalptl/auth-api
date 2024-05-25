package com.vp.auth_api.payload;

public class RegisterRequest extends LoginRequest {
private String fullName;
public String getFullName() {
    return fullName;
}
public void setFullName(String fullName) {
    this.fullName = fullName;
}

}
