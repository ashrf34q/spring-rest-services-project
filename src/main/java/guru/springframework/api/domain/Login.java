package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Login implements Serializable {

	private String username;
    private String password;
    private String md5;
    private String sha1;
    private String sha256;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1041720428871730372L;
}
  