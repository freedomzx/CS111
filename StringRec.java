public class StringRec
{
  public static String decompress(String compressedText)
  {
    if(compressedText.length()<=1) return compressedText;
    char first = compressedText.charAt(0);
    char second = compressedText.charAt(1);
    if(Character.isLetter(first)){
      return first + decompress(compressedText.substring(1));
    }
    else{
      first--;
      if(first != '0'){
      return second + decompress(first + compressedText.substring(1));}
      return second + decompress(compressedText.substring(2));
    }
  }
  public static void main(String[] args)
  {
    System.out.println(decompress("9a9a9a0a"));
  }
}
