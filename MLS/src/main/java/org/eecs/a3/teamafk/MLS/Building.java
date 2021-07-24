package org.eecs.a3.teamafk.MLS;

public abstract class Building {
  
  private String type = null;
  private int size = 0;
  private String address = null;
  private String country = null;
  private String schooldistrict = null;
  private int bedrooms = 0;
  private int livingroom = 0;
  private int totalrooms = 0;
  private String expenses = null;
  private int builtdate = 0;
  private int floorlevel = 0;
  private boolean pool = false;
  private boolean cableready = false;
  private boolean furnished = false;
  private boolean hassecurity = false;
  private boolean hasgarden = false;
  private int gardensize = 0;
  private String description = null;
  
  protected void setsize(int size) {
        this.size =  size;
    }
  
  protected int getsize() {
        return enddate;
    }

  protected void settype(String type) {
        this.type =  type;
    }
  
  protected String gettype() {
        return type;
    }
  
  protected void settype(String address) {
        this.address =  address;
    }
  
  protected String getaddress() {
        return address;
    }

  protected void setcountry(String country) {
        this.country =  country;
    }
  
  protected String getcountry() {
        return country;
    } 
  
  protected void setschooldistrict(String schooldistrict) {
        this.schooldistrict =  schooldistrict;
    }
  
  protected String getschooldistrict() {
        return schooldistrict;
    }
  
  protected void setbedrooms(int bedrooms) {
        this.bedrooms =  bedrooms;
    }
  
  protected int getbedrooms() {
        return bedrooms;
    }
  
  protected void setliving room (int livingroom) {
        this.livingroom =  livingroom;
    }
  
  protected int getliving room() {
        return livingroom;
    }

  protected void settotalrooms (int totalrooms) {
        this.totalrooms =  totalrooms;
    }
  
  protected int gettotalrooms() {
        return totalrooms;
    }

  
  protected void setexpenses (String expenses) {
        this.expenses =  expenses;
    }
  
  protected String getexpenses() {
        return expenses;
    }

  protected void settotalrooms (int builtdate) {
        this.builtdate =  builtdate;
    }
  
  protected int getbuiltdate() {
        return builtdate;
    }

  
  protected void setfloorlevel (int floorlevel) {
        this.floorlevel =  floorlevel;
    }
  
  protected int getfloorlevel() {
        return floorlevel;
    }

  protected void setpool  (boolean pool) {
        this.pool  =  pool;
    }
  
  protected boolean getpool () {
        return pool;
    }
  
  protected void cableready  (boolean cableready) {
        this.cableready  =  cableready;
    }
  
  protected boolean getcableready() {
        return cableready;
    }

  protected void furnished  (boolean furnished) {
        this.furnished  =  furnished;
    }
  
  protected boolean getfurnished() {
        return furnished;
    }

  protected void hassecurity  (boolean hassecurity) {
        this.hassecurity  =  hassecurity;
    }
  
  protected boolean gethassecurity() {
        return hassecurity;
    }

  
  protected void hasgarden  (boolean hasgarden) {
        this.hasgarden  =  hasgarden;
    }
  
  protected boolean gethasgarden() {
        return hasgarden;
    }

  protected void setgardensize(int gardensize) {
        this.gardensize =  gardensize;
    }
  
  protected int getgardensize() {
        return gardensize;
    }

  protected void setdescription(String description) {
        this.description =  description;
    }
  
  protected String getdescription() {
        return description;
    }


}
