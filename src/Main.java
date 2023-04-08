public class Main {
    public static void main(String[] args) {

        OneLinkList <Integer> list1 = new OneLinkList<>();
        list1.add(1);
        list1.add(20);
        list1.add(125);
        list1.add(4+8);

        for (Object item: list1)
              {
                  System.out.println(item);
        }
        System.out.println();
        System.out.println(list1.size());


        OneLinkList <String> list2 = new OneLinkList<>();
        list2.add("Шла ");
        list2.add("Саша ");
        list2.add("по ");
        list2.add("шоссе");

        for (Object item: list2)
        {
            System.out.print(item);
        }
        System.out.println();

        System.out.println(list2.inList("Саша "));
        System.out.println(list2.inList("саша "));

        list1.remove(20);






    }
}