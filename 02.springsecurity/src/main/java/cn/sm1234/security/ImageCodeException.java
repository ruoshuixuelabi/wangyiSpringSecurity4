package cn.sm1234.security;
import org.springframework.security.core.AuthenticationException;
/**
 * @author admin
 */
public class ImageCodeException extends AuthenticationException {
    public ImageCodeException(String msg, Throwable t) {
        super(msg, t);
    }
    ImageCodeException(String msg) {
        super(msg);
    }
}
