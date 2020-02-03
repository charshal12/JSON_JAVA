package com.qa.NestedJSON.POJO;

public class Topping
{
    @Override
	public String toString() {
		return "Topping [id=" + id + ", type=" + type + "]";
	}
	private String id;

    private String type;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
}
