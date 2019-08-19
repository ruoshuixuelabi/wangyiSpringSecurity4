package cn.sm1234.security;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
/**
 * @author admin
 */
public class MyUserDetailService implements UserDetailsService {
    /**
     * loadUserByUsername: 读取用户信息
     * @param username 用户名
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //UserDetails: 封装用户数据的接口,其中 User 类就是 UserDetail 实现类,用于封装数据库账户信息
        return new User( "eric","123456", true,true,false,true,AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER"));
    }
}
