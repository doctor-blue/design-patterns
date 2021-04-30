public class ClientTest {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.add(new Item("Structural","/struc"));
        menu.add(new Item("Creational","/create"));
        menu.add(new Item("Behavior","/behavior"));

        ItemIterator<Item> iterator = menu.iterator();
        while (iterator.hasNext()){
            Item item = iterator.next();
            System.out.println(item.getTitle());
        }
    }
}
