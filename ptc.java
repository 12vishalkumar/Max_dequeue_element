import java.util.*;
public class ptc 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        HashSet<Integer> hash = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int n = in.nextInt();
        int m = in.nextInt();
       for(int i = 0; i < n; i++) 
       {
            int num = in.nextInt();
            deque.add(num);
            hash.add(num);
            if(deque.size() == m)
            {
                if(hash.size() > max)
                    max = hash.size();
                int begin = (int)deque.remove();
                if(!deque.contains(begin))
                    hash.remove(begin);
            }     
        }
        System.out.println(max);  
    }
}
