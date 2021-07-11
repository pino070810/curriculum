package test;

//utilパッケージのArrayListクラスをimport
import java.util.ArrayList;
//utilパッケージのListクラスをimport
import java.util.List;

public class Main {

  public static void main(String args[]) {
      // LinkedListを使用する場合は以下のように書きます
      // List<String> sampleList = new LinkedList<String>(); 
      
      // パターン1
      List<String> sampleListA = new ArrayList<String>();
      sampleListA.add("ABC");
      sampleListA.add("DEF");

      // パターン2
      sampleListA = new ArrayList<String>() {
          {
              add("ABC");
              add("DEF");
              add("123");         }
      };

      // リストに格納した全要素を順番に出力
      for (int i = 0; i < sampleListA.size(); i++) {
          System.out.println(sampleListA.get(i));
      }
  }
}
