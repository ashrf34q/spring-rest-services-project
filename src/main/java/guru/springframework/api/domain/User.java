package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User implements Serializable {

	private String gender;
    private Name name;
    private Location location;
    private String email;
    private Login login;
    private String phone;
    private Job job;
    private Billing billing;
    private String language;
    private String currency;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    private static final long serialVersionUID = 270727596527329664L;
}
