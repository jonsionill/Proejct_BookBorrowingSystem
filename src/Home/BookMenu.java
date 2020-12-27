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
class BookMenu {
  private int id, copyright;
  private String title, author, status, location;
  public BookMenu(int id, String title, String author, int copyright , String status, String location)
  {
      this.id=id;
      this.title=title;
      this.author=author;
      this.copyright=copyright;
      this.location=location;
      this.status=status;
  }
  public int getid(){
      return id;
  }
  public String gettitle(){
      return title;
  }
  public String getauthor(){
      return author;
  }
  public int getcopyright(){
      return copyright;
  }
  public String getlocation(){
      return location;
  }
  public String getstatus(){
      return status;
  }
}
