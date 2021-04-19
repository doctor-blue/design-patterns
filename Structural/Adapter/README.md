# Adapter Design pattern

## Khái niệm
- Khi bạn có hai đối tượng có sẵn và chẳng liên quan gì tới nhau vậy làm cách nào để chúng có thể giao tiếp được với nhau? Vậy trong thực tế chẳng hạn chúng ta có nguồn điện 220V và chúng ta có một thiết bị dùng điện 12V vậy chúng ta làm thế nào để thiết bị có thể  chuyển đổi điện 220V về 12V? Có phải chúng ta cần một bộ chuyển đổi đúng không? Tương tự chúng ta cũng có thể tạo ra một bộ chuyển đổi giúp hai đối tượng, class chẳng liên quan gì tới nhau có thể giao tiếp được với nhau.
-   Adapter Pattern giữ vai trò trung gian giữa hai lớp, chuyển đổi interface của một hay nhiều lớp có sẵn thành một interface khác.Như vậy sẽ cho phép các lớp có các class, interface không liên quan tới nhau có thể giao tiếp được với nhau.

## Các thành phần

- Adaptee: định nghĩa interface,class không tương thích, cần được tích hợp vào.
- Adapter: lớp tích hợp, giúp interface,class không tương thích tích hợp được với interface,class đang làm việc. Thực hiện việc chuyển đổi giữa các interface, class không tương thích.
- Target: một interface chứa các chức năng được sử dụng bởi Client.

- Client: lớp sử dụng các đối tượng có interface Target.

## Các loại Adapter
- Object Adapter – Composition : trong loại này, một lớp mới (Adapter) sẽ tham chiếu đến một (hoặc nhiều) đối tượng của lớp có sẵn với. Các bạn có thể hiểu Adaptee sẽ là một thuộc tích của Adapter.

- Class Adapter – Inheritance: Ở dạng Adapter sẽ kế thừa từ cả Adapter và Target và thực hiện cài đặt những interface mà người dùng mong muốn (Target).

## Một số tài liệu tham khảo
- https://sourcemaking.com/design_patterns/adapter
- https://refactoring.guru/design-patterns/adapter