class FormatSpecifiers {
   public static void main(String args[]) {
      int a = 123;
      float b = 12.2f;
      System.out.printf("%010d\n",a); // flag -> 0, width -> 10, 
      System.out.printf("%10d\n",a); 
      System.out.printf("%010.2f",b); // .precisionf .2f
   }
}