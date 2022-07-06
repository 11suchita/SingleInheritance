class Bright_path
{
 void parent()
 {
  System.out.println("Welcome to bright path");
 }
};
class Language extends Bright_path
{
 void child()
 {
  System.out.println("Learn java Language");
 }
};
class Single_inheritance
{
 public static void main(String args[])
 {
  Language l=new Language();
  l.parent();
  l.child();
 }
}