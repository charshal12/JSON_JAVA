package com.qa.NestedJSON.POJO;

import java.util.ArrayList;
import java.util.List;
public class Batters
{
    private List<Batter> batter;

    public void setBatter(List<Batter> batter){
        this.batter = batter;
    }
    public List<Batter> getBatter(){
        return this.batter;
    }
	@Override
	public String toString() {
		return "Batters [batter=" + batter + "]";
	}
}
