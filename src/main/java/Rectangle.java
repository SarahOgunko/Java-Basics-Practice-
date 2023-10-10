public class Rectangle {

  private int width;
  private int length;

  public Rectangle(int inputWidth, int inputLength){
  this.width = inputWidth;
  this.length = inputLength;
  }

  public int calculateArea(){
  return this.length * this.width;
 }

  public boolean checkSquare(){
      return this.length == this.width;

  }





}
