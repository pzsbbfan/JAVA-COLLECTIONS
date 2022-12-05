import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        String[] names = {"Jane","Joe","Ali"};
        List<String> list1 = new ArrayList<>();
        list1.add("Mark");
        List<String> nameList = Arrays.asList(names);
        nameList.forEach(name->{list1.add(name);});



        List<String> list2 = new ArrayList<>();
        list2.add("Reem");
        list2.add("Jim");
        list1.addAll(list2);
        list1.add("John");

        List<List<String>> list3 = new ArrayList<>();
        list3.add(list1);
        list3.add(list2);
        System.out.println(list1);
        System.out.println(list3.get(0).get(0) +'\n');

        list1.forEach(e->{System.out.println(e);});

        int result = Collections.frequency(list1,"John");
        System.out.println("==========================");
        System.out.println(result);
        System.out.println("==========================");


        List<Integer> numbers = new LinkedList<>();
        numbers.add(20);
        numbers.add(120);
        numbers.add(220);

        numbers.forEach(number->System.out.println(number));



        //stack
        System.out.println("=============================");
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        System.out.println(stack.peek());
        System.out.println(stack.pop());


        //Queue
        System.out.println("=============================");
        Queue<Integer> queue = new LinkedList<>();
        queue.add(20);
        queue.add(120);
        queue.add(28);
        queue.add(25);

        System.out.println(queue.remove());

        //Set
        System.out.println("=============================");
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Java");
        set.add("Python");
        set.forEach(e->{System.out.println(e);});
        System.out.println(set.size());


        //hash map
        System.out.println("=============================");
        Map<Integer, String> map = new HashMap<>();
        map.put(100,"Lucas");
        map.put(100,"Jack");
        map.put(200,"Evelyn");
        map.put(300,"Ben");
        System.out.println(map.get(100));
    }


}
