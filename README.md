# CRUD_SERVLET_JSP
Đây là phiên bản làm lại theo hướng dẫn của thầy lộc
sau khi làm xong prút ra một số nhận xét:

1. Ko nên từ một trang jsp request A trực tiếp đến một trang jsp B mặc dù trang jsp B ko cần bất kỳ thông tin đính kèm nào từ trang JSPA. Thay vào đó nên cho qua một servlet trung gian rồi redirect qua trang JSP B

2.Bản chất khi redirrect là một HTTP GET method nên khi redirect thới một servlet thì nó sẽ luôn đi vào doPOST

3.Các business rule như kiểm tra đăng nhập chỉ khai báo ở tầng service mà thôi. 