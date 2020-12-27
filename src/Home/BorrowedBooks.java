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
class BorrowedBooks {
  private int id;
  private String name, title, author, dateborrowed, duedate, datereturned;
  public BorrowedBooks(int id,String name, String title, String author, String dateborrowed, String duedate, String datereturned)
  {
      this.id=id;
      this.name=name;
      this.title=title;
      this.author=author;
      this.dateborrowed=dateborrowed;
      this.duedate=duedate;
      this.datereturned=datereturned;
  }
  public int getid(){
      return id;
  }
  public String getname(){
      return name;
  }
  public String gettitle(){
      return title;
  }
  public String getauthor(){
      return author;
  }
  public String getdateborrowed(){
      return dateborrowed;
  }
  public String getduedate(){
      return duedate;
  }
  public String getdatereturned(){
      return datereturned;
  }
}
