package cn.sm1234.security;
import cn.sm1234.domain.Permission;
import cn.sm1234.domain.User;
import cn.sm1234.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import java.util.ArrayList;
import java.util.List;
/**
 * @author admin
 */
public class MyUserDetailServiceImpl implements UserDetailsService {
    private Logger logger = Logger.getLogger(MyUserDetailServiceImpl.class);
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //根据用户名查询用户信息
        User user = userMapper.findByUsername(username);
        if(user!=null) {
            //根据用户名查询当前用户所有权限
            List<Permission> permList = userMapper.findPermissionByUsername(username);
            //authorities:存放所有用户权限
            List<GrantedAuthority> authorities = new ArrayList<>();
            for (Permission perm : permList) {
                GrantedAuthority authority = new SimpleGrantedAuthority(perm.getPermTag());
                authorities.add(authority);
            }
            //把所有权限赋值给user
            user.setAuthorities(authorities);
            logger.info("当前用户：" + user);
        }
        return user;
    }
}
