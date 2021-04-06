public class ClientTest {
    public static void main(String[] args) {
        ElectronicDeviceAbstractFactory highEndDeviceFactory = ElectronicDeviceFactory.getFactory(Segment.HIGH_END);
        Laptop highEndLap = highEndDeviceFactory.createLaptop();
        Phone highEndPhone = highEndDeviceFactory.createPhone();

        System.out.println(highEndLap.getSegment());
        System.out.println(highEndPhone.getSegment());

        System.out.println("=========================");

        ElectronicDeviceAbstractFactory midRangeDeviceFactory = ElectronicDeviceFactory.getFactory(Segment.MID_RANGE);
        Laptop midRangeLap = midRangeDeviceFactory.createLaptop();
        Phone midRangePhone = midRangeDeviceFactory.createPhone();

        System.out.println(midRangeLap.getSegment());
        System.out.println(midRangePhone.getSegment());
    }
}
