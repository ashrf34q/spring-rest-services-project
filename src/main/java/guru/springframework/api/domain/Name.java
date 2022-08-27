package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Name implements Serializable {

	private static final long serialVersionUID = 420620315591775395L;
	
	private String title;
	private String firstName;
	private String lastName;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
