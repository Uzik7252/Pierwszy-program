 public class Piekarnia extends Pieczywo{
    void nazwaPiekarni()
    {
        System.out.println("Nazwa Piekarni = Kidziński");
    }

     @Override
     void pachnie() {
         System.out.println("Czuć wspaniały zapach świeżego chleba");
     }

     @Override
     void smakuje() {
         System.out.println("Chleb smakuje wpaniale");
     }
 }
