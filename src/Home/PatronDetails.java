/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

/**
 *
 * @author Eon_kun
 */
class PatronDetails {
  private int id;
  private String username, address, birthdate, contact ,email;
  public PatronDetails(int id, String username, String address, String birthdate, String contact, String email)
  {
      this.id=id;
      this.username=username;
      this.address=address;
      this.birthdate=birthdate;
      this.contact=contact;
      this.email=email;
  }
  public int getid(){
      return id;
  }
  public String getname(){
      return username;
  }
   public String getaddress(){
      return address;
  }
   public String getbirthdate(){
       return birthdate;
   }
  public String getcontact(){
      return contact;
  }
  public String getemail(){
      return email;
  }
}
