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
class UserDetails {
  private int id;
  private String username, contactno, address, email;
  public UserDetails(int id, String username, String contactno, String address , String email)
  {
      this.id=id;
      this.username=username;
      this.contactno=contactno;
      this.address=address;
      this.email=email;
  }
  public int getid(){
      return id;
  }
  public String getname(){
      return username;
  }
  public String getcontact(){
      return contactno;
  }
  public String getaddress(){
      return address;
  }
  public String getemail(){
      return email;
  }
}
