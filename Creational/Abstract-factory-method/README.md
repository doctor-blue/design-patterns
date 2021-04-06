# Abstract Factory Method

## Khái niệm
- Abstract Factory pattern là một trong những Creational pattern. Nó sẽ tạp ra những Super-Factory để tạo ra những factory khác. Đại loại có thể hiểu nó là loại factory để tạo ra những factory khác :v.
- Nếu thấy khó hiểu bạn có thể tưởng tượng như một tập đoàn hay một công ty lại có nhiều công ty con vậy đó.
## Các thành phần của Abstract Factory Method
- AbstractFactory: Là một Interface hoạc abstract class chứa các phưng thức tạo ra các đối tượng abstract.
- ConcreteFactory (hay mình thường nghĩ nó là Sub factory :v): cài đặt các phương thức để tao ra các đối tượng cụ thể.
- AbstractProduct(hay các supper-class) : Là dạng interface hoặc abstract class để định nghĩa ra đối tượng cha hay đối tượng abstract.
- Product (hay các sub-class): Là các đối tượng cụ thể cài đặt các method từ AbstractProduct.
- Client: Đại diện cho nơi sử dụng AbstractFactory và các AbstractProduct.
## Tại sao nên sử dụng
- Giống như Factory method thông thường thì nó cũng che giấu logic khởi tạo đối tượng. Độc lập hoàn toàn giữa nơi sử dụng và nơi khởi tạo => Hệ thống dễ dàng mở rộng vì việc khởi tạo và sử dụng tách biệt nhau.
- So với Factory method thì khi quá lớn sẽ dễ dàng quản lý và mở rộng hơn.
- Như đã nói thì sẽ dễ dàng xây dựng nên một module hay một hệ thống độc lập để xử dụng trong các module và hệ thống khác.
## Tài liệu các bạn nên tham khảo thêm
- https://sourcemaking.com/design_patterns/abstract_factory
- https://refactoring.guru/design-patterns/abstract-factory