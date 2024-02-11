class Main {
    public static void main(String[] args) {
        SanjarList<Object> list = new SanjarList<>();
        list.add(1);
        list.add("a");
        list.add(2);
        list.add("b");
        list.add(3);
        list.add("c");
        list.add(4);
        list.add("d");
        System.out.println(list);
        System.out.println(list.size());
        list.add(4, "Salom");
        System.out.println(list);
        System.out.println(list.size());
        list.remove(3);
        System.out.println(list);
        System.out.println(list.size());

        System.out.println("------------------");

        SanjarList<Object> list1 = new SanjarList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list.addAll(list1);
        System.out.println(list);
        System.out.println(list.size());
    }
}