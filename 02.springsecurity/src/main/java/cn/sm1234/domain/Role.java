package cn.sm1234.domain;
import lombok.Data;
/**
 * 角色对应的实体类
 * @author admin
 */
@Data
public class Role {
    private Integer id;
    private String roleName;
    private String roleDesc;
}
