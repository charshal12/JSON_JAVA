package com.qa.NestedJSON.POJO;

public class Batter
{
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
	@Override
	public String toString() {
		return "Batter [id=" + id + ", type=" + type + "]";
	}
}
