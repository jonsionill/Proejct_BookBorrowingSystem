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
class CopyBook {
  private int id, copyright;
  private String title, author, isbn, type;
  public CopyBook(int id, String title, String author, int copyright , String isbn, String type)
  {
      this.id=id;
      this.title=title;
      this.author=author;
      this.copyright=copyright;
      this.isbn=isbn;
      this.type=type;
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
  public String getisbn(){
      return isbn;
  }
  public String gettype(){
      return type;
  }
}
