import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random= new Random();

        List<Integer> number = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            number.add(random.nextInt(1,100));

            ArrayList<Integer>jupSsan=new ArrayList<>();
            ArrayList<Integer>tacSandar=new ArrayList<>();
            for (int j = 0; j < number.size(); j++) {
                if (number.get(i)% 2==0){
                    jupSsan.add(number.get(i));
                }else {
                    tacSandar.add(number.get(i));
                }
                    System.out.println(tacSandar);

                }
                    System.out.println(jupSsan);

                }
            }


        }








