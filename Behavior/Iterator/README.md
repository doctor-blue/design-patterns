# Iterator design pattern

## Khái niệm
- Nếu trong project của các bạn có quá nhiều cấu trúc dạng danh sách như cấu trúc cây, mảng, ngăn xếp, hàng đợi.... Và bạn muốn có một quy tắc chung cho chúng như đều có thêm sửa xoá chẳng hạn. Như vậy lúc này chúng ta có thể tìm tới Iterator.

- Như vậy chúng ta có thể hiểu Iterator là mẫu sẽ cung cấp cho chúng ta một cách truy cập tuần tự tới các phần tử của một đối tượng tổng hợp. Chúng ta có thể truy xuất tới các tập hợp theo cùng một cách thức.

## Các thành phần
- Aggregate : là một interface định nghĩa định nghĩa các phương thức để tạo Iterator.
- ConcreteAggregate : cài đặt các phương thức của Aggregate, nó cài đặt interface tạo Iterator để trả về một thể hiện của ConcreteIterator thích hợp.
- Iterator : là một interface hay abstract class, định nghĩa các phương thức để truy cập và duyệt qua các phần tử.

- ConcreteIterator : cài đặt các phương thức của Iterator, giữ index khi duyệt qua các phần tử.

- Client: Đại diện cho nơi sử dụng Iterator nó sẽ yêu cầu duyệt qua các phần tử có trong Iterator cũng như truy xuất tới các phần tử theo quy trình thích hợp.

## Tài liệu các bạn nên tham khảo thêm.
- https://www.tutorialspoint.com/design_pattern/iterator_pattern.htm
- https://sourcemaking.com/design_patterns/iterator
- Một trang web tiếng việt rất hay về Java nói chung cũng như design pattern nói riêng mà các bạn nhất định phải xem: https://gpcoder.com/