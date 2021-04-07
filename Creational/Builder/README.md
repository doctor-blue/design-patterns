# Builder Design Pattern

## Khái niệm
- Bạn có cảm thấy khó chịu khi một class có quá nhiều thuộc tính mà trong số đó có những thuộc tính bắt buộc cần phải có còn một số thì không, trong trường hợp này chúng ta thường làm gì? Có phải chúng ta sẽ tạo nhiều constructor tùy theo từng trường hợp không? Nếu như vậy có phải nó sẽ cực kì nhiều constructor và code trở nên rắc rối dài dòng đến mức phát bực đúng không? Nếu vậy chúng ta sẽ cần dùng tới Builder.
- Builder design pattern sẽ giúp chúng ta tạo những đối tượng phức tạp mà có nhiều thuộc tính một số trong số đó là bắt buộc còn một số lại không. Đối tượng sẽ được xây dựng từng bước từng bước một. Và sẽ khắc phục một số nhược điểm mà Factory method và Abstract Factory method khi có quá nhiều thuộc tính.
## Các thành phần của Builder
- Product : chính là đối tượng chúng ta cần tạo, có nhiều thuộc tính phức tạp.
- Builder : là abstract class hoặc interface khai báo phương thức dùng để tạo đối tượng.
- ConcreteBuilder : kế thừa Builder và cài đặt chi tiết cách tạo ra đối tượng. Nó sẽ xác định và nắm giữ các thể hiện mà nó tạo ra, đồng thời nó cũng cung cấp phương thức để trả các các thể hiện mà nó đã tạo ra trước đó.
- Client : Đại diện cho nơi mà chúng ta sẽ khởi tạo ra đối tượng.

## Tài liệu các bạn nên tham khảo thêm
- https://sourcemaking.com/design_patterns/builder
- https://refactoring.guru/design-patterns/builder