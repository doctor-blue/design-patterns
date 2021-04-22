# Facade Design Pattern

## Khái niệm
- Trong trường hợp bạn có nhiều hệ thống con và mỗi lần gọi tới những hệ thống này lại quá sức phức tạp và tốn nhiều thời gian. Vậy Facade sẽ giúp đỡ bạn trong việc này. Cũng giống như [Adapter](https://github.com/doctor-blue/design-patterns/tree/master/Structural/Adapter) Facade cung cấp cho chúng ta một lớp để làm chung gian giữa hai thành phần, nhưng khác nhau ở chỗ Adapter thì giúp chúng ta làm việc giữa hai mã nguồn, còn đối với Facade thì thì sẽ là thành phần bao bọc che giấu đi các hệ thống con để giúp giao tiếp với thành phần khác dễ dàng hơn.
- Như vậy ta có thể hiệu Facade sẽ cung cấp một giao diện cho việc giao tiếp giữa các hệ thống con, giúp người dùng có thể giao tiếp với chúng một cách dễ dàng. Facade giúp che dấu đi xử lý logic phức tạp bên trong hệ thống con.

## Các thành phần
- Facade: Là thành phần chung gian biết rõ chức năng của nhưng subsystems có thể thực hiện yêu cầu của client.
- Subsystems: cài đặt các chức năng của hệ thống con, xử lý công việc được gọi bởi Facade. Các lớp này không cần biết Facade và không tham chiếu đến nó.
- Client: đại diện cho nơi gọi tới và sử dụng Facade.

## Tài liệu các bạn cần tham khảo thêm
- https://refactoring.guru/design-patterns/facade
- https://sourcemaking.com/design_patterns/facade