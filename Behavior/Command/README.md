# Command Design pattern

## Khái niệm

- Trong một số trường hợp chúng ta sẽ cần lưu lại một số lệnh ví dụ trong Word chúng ta có các hành động như undo/redo chẳng hạn.

- Đối với Command nó cho phép chúng ta chuyển mệnh lệnh thành một đối tượng độc lập và nhờ đó chúng ta có thể lưu trữ lại những lệnh này và sử dụng nó tuỳ theo trường hợp. ví dụ như trên với lệnh undo/redo chẳng hạn. Nó như một class chung gian lưu trữ lại hành động và trạng thái ở tại một thời điểm nào đó.

## Các thành phần

- Command : là một interface hoặc abstract class, chứa một phương thức trừu tượng thực thi (execute) một hành động (operation). Yêu cầu sẽ được đóng gói lại dưới dạng Command.

- ConcreteCommand : là các implementation của Command. Định nghĩa một sự gắn kết giữa một đối tượng Receiver và một hành động. Thực thi execute() bằng việc gọi operation đang hoãn trên Receiver. Mỗi một ConcreteCommand sẽ phục vụ cho một loại yêu cầu riêng.

- Client : Đại diện cho nơi sử dụng, nơi tiếp nhận yêu cầu của người dùng và đóng gói yêu cầu đó thành ConcreteCommand phù hợp.

- Invoker : tiếp nhận ConcreteCommand từ Client và gọi execute() của ConcreteCommand để thực thi request.

- Receiver : đây là thành phần thực sự xử lý business logic cho các yêu cầu. Trong phương execute() của ConcreteCommand chúng ta sẽ gọi method thích hợp trong Receiver.

## Một số tài liệu các bạn nên tham khảo thêm
- https://sourcemaking.com/design_patterns/command
- https://www.tutorialspoint.com/design_pattern/command_pattern.htm