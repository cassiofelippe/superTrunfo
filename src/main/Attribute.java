package main;

import static java.lang.Boolean.FALSE;

public class Attribute{
	public Attribute(){
		this(null, null, null);
	}
	
	public Attribute(String name, Integer value, String um){}

	private final Integer id = Vehicle.generateAttributeId();
	private String name = "";
	private Integer value;
	private Boolean negative = FALSE;
	private String um = "";

	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getValue() {
		return value;
	}
	
	public void setValue(Integer value) {
		this.value = value;
	}
	
	public String getUm() {
		return um;
	}
	
	public void setUm(String um) {
		this.um = um;
	}
	
	public Boolean getNegative() {
		return negative;
	}
	
	public void setNegative(Boolean negative) {
		this.negative = negative;
	}
}
