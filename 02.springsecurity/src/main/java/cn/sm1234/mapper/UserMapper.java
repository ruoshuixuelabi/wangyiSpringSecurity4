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
     * @param username 用户的名字
     * @return 符合条件的用户
     */
    User findByUsername(String username);

    /**
     * 查询当前用户拥有的权限
     * @param username 用户的名字
     * @return 符合条件的用户集合
     */
    List<Permission> findPermissionByUsername(String username);

    /**
     * 修改密码
     * @param user 用户实体类
     */
    void updatePassword(User user);
}
