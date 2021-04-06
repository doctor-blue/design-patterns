# Factory Method

## Khái niệm
-  Factory Pattern là một trong những mẫu thiết kế thuộc nhóm Creational. Nhiệm vụ của nó là quản lý và trả về những đối tượng theo đúng những gì được yêu cầu, sẽ giúp việc khởi tạo đối tượng linh hoạt hơn.
-  Factory (Nhà máy) làm nhiệm vụ sản xuất hàng hóa thì Factory Patterns cũng vậy nhưng giúp chúng ta sản xuất đối tượng. Nó sẽ che giấu đi logic tạo ra những đối tượng đó giống như việc chúng ta chỉ có thể nhìn thấy nguyên liệu đi vào và sản phẩm đi ra từ nhà máy mà không thể biết sản phẩm phải trải qua những quy trình ra sao.
## Sử dụng Factory Pattern trong trường hợp nào ?
- Được sử dụng trong trường hợp có một class cha với nhiều class con kế thừa và chúng ta cần tùy theo trường hợp mà khởi tạo một trong những class con đó.
## Các thành phần tạo nên một Factory Pattern
- Super Class: môt supper class trong Factory Pattern có thể là một interface, abstract class hoặc cũng có thể là một class thông thường.
- Sub Classes: các class con sẽ kế thừa từ class cha theo nghiệp vụ riêng của nó.
- Factory Class: một class chịu tránh nhiệm khởi tạo các đối tượng class con dựa theo tham số đầu vào. (Lớp này là Singleton hoặc cung cấp một public static method cho việc truy xuất và khởi tạo đối tượng. Factory class sử dụng if-else hoặc switch-case để xác định class con đầu ra.)

## Tài liệu các bạn nên tham khảo thêm
- https://refactoring.guru/design-patterns/factory-method
- https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
## Note: 
- Bên trên là phần lý thuyết ví dụ và thực hành các bạn có thể  thấy ở [đây](https://youtu.be/HjBPCCdDHPo)