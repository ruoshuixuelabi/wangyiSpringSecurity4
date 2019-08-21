package cn.sm1234.domain;
import lombok.Data;
/**
 * 权限对应的实体类
 * @author admin
 */
@Data
public class Permission {
    private Integer id;
    private String permName;
    private String permTag;
}
