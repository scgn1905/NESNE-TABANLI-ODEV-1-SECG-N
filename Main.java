
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Marathon {
    private List<Integer> sureler = new ArrayList<>(); //final yaparsan sonrasında değiştiremeiğin için daha hızlı erişilir
    private List<String> isimler = new ArrayList<>(); //collections.emptylist kullanılabilr


    private int a = 0;
    private int b = 0;
    private int c = 0;

    public void addRacer (int sure, String isim ){
        sureler.add(sure);
        isimler.add(isim);
        sort();
    }

    private void sort(){
        for (int i = 0; i < sureler.size(); i++) {
            for (int j = i+1; j < sureler.size(); j++) {
                if(sureler.get(j)< sureler.get(i)){
                    Integer temp = sureler.get(i);
                    String gecici = isimler.get(i);
                    sureler.set(i,sureler.get(j));
                    sureler.set(j,temp);
                    isimler.set(i,isimler.get(j));
                    isimler.set(j,gecici);
                }
            }
        }
    }

    public void yaz(){
        System.out.println(sureler.toString());
        System.out.println(isimler.toString());
    }
    public void ilkUc(){
        System.out.println("Birinci: "+ isimler.get(0)+" "+ sureler.get(0)+"'");
        System.out.println("Ikinci: "+ isimler.get(1)+" "+ sureler.get(1)+"'");
        System.out.println("Üçüncü: "+ isimler.get(2)+" "+ sureler.get(2)+"'");
    }

    public int findFirst(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min = array[i];
            }
        }

        return min;
    }

    public String isimBul(int sure){
        int index = 0;
        for (int i = 0; i < sureler.size(); i++) {
            if(sure == sureler.get(i)){
                index = i;
            }
        }
        return isimler.get(index);
    }

    public int findSecond(int[] array){
        int min1 = findFirst(array);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min && array[i]>min1){
                min = array[i];
            }
        }

        return min;
    }
    public int findThird(int[] array){
        int min1 = findSecond(array);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min && array[i]>min1){
                min = array[i];
            }
        }

        return min;
    }

    public void abc (){
        for (int i = 0; i < sureler.size(); i++) {
            if (sureler.get(i)<300&&sureler.get(i)>199){
                a++;
            }
            if (sureler.get(i)<400&&sureler.get(i)>299){
                b++;
            }
            if (sureler.get(i)>399){
                c++;
            }
        }
        System.out.println("A->"+a);
        System.out.println("B->"+b);
        System.out.println("C->"+c);
    }

}
