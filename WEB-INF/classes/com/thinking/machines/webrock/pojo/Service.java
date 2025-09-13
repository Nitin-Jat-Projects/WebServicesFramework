package com.thinking.machines.webrock.pojo;

public class Service
{
//Siddharth has to work in this particular module
private boolean isGetAllowed;


//constructor
public Service()
{
this.isGetAllowed=false;
}

//setter and getter for isGetAllowed (please follow camelcase)
public void setIsGetAllowed(boolean isGetAllowed)
{
this.isGetAllowed=isGetAllowed;
}
public boolean getIsGetAllowed()
{
return this.isGetAllowed;
}


}