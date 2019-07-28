package cn.sm1234.mapper;
import cn.sm1234.domain.Permission;
import cn.sm1234.domain.User;
import java.util.List;
/**
 * @author admin
 */
public interface UserMapper {
    /**
     * 查询当前用户对象
     */
    User findByUsername(String username);
    /**
     * 查询当前用户拥有的权限
     */
    List<Permission> findPermissionByUsername(String username);
    /**
     * 修改密码
     */
    void updatePassword(User user);
}
