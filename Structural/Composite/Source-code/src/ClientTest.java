public class ClientTest {
    public static void main(String[] args) {
        Developer dev1 = new Developer(30,"John",2000);
        Developer dev2 = new Developer(25,"Ana",1800);

        Leader leader = new Leader(45,"Sam",5000);
        leader.add(dev1);
        leader.add(dev2);

        BusinessAnalyst ba = new BusinessAnalyst(27,"Jame",2100);

        Boss boss = new Boss(60,"Tom",8000);
        boss.add(leader);
        boss.add(ba);
        boss.print();

    }
}
