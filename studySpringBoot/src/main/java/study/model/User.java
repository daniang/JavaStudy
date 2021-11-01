package study.model;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;

    private String phone;

    private Boolean deleted;

    private Date createTime;

    private Date updateTime;

    private String username;

    private String password;

    public String getToken(User user){
        String token = "";
        token = JWT.create().withAudience(user.getId().toString()).sign(Algorithm.HMAC256(user.getPassword()));
        return token;

    }

}