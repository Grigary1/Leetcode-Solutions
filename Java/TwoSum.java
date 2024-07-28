import java.util.ArrayList;
import java.util.List;

class TwoSum {
    public static void main(String args[]){
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l2.add(3);
        l2.add(4);
        List<Integer> comb=new ArrayList<>(l1);
        comb.addAll(l2);
        System.out.println(comb);
    }
}