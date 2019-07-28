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
     * @param username
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //UserDetails: 封装用户数据的接口
        return new User( "eric","123456", true,true,false,true,AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER"));
    }
}
