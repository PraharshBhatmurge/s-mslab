package com.example.user.VO;

import com.example.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private User user;
    private Visa visa;

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Visa getVisa() {
        return this.visa;
    }

    public void setVisa(Visa visa) {
        this.visa = visa;
    }
}