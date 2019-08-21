package cn.sm1234.domain;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * 用户对应的实体类
 * @author admin
 */
@Data
public class User implements UserDetails{
    private Integer id;
    private String username;
    private String realName;
    private String password;
    private Date createDate;
    private Date lastLoginTime;
    private boolean enabled;
    private boolean accountNonExpired;
    private boolean accountNonLocked;
    private boolean credentialsNonExpired;
    /**
     * 用户拥有的所有权限
     */
    private List<GrantedAuthority> authorities = new ArrayList<>();

    @Override
    public List<GrantedAuthority> getAuthorities() {
        return authorities;
    }
}
