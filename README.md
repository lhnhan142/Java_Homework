#1. Class HinhChuNhat — Lớp và đối tượng cơ bản Cơ bản
Viết class HinhChuNhat có hai thuộc tính chieuDai và chieuRong (kiểu double). Yêu cầu:

    Khai báo thuộc tính private.
    Viết constructor có tham số để khởi tạo giá trị.
    Viết getter cho cả hai thuộc tính.
    Viết phương thức tinhDienTich() và tinhChuVi().
    Override toString() để in thông tin dạng:
    HinhChuNhat[dài=5.0, rộng=3.0, S=15.0, C=16.0]
    Trong main: tạo 2 đối tượng, in thông tin và cho biết hình nào có diện tích lớn hơn.

2. Class TaiKhoanNganHang — Thuộc tính & phương thức Trung bình
Viết class TaiKhoanNganHang mô phỏng một tài khoản ngân hàng đơn giản. Yêu cầu:

    Thuộc tính private: soTaiKhoan (String), chuTaiKhoan (String), soDu (double).
    Constructor khởi tạo đầy đủ; soDu ban đầu mặc định là 0 nếu không truyền vào.
    Phương thức napTien(double soTien): cộng tiền vào, in thông báo thành công.
    Phương thức rutTien(double soTien): trừ tiền nếu đủ số dư, ngược lại in "Số dư không đủ!".
    Phương thức xemSoDu(): in số dư hiện tại.
    Trong main: tạo tài khoản, nạp 500000đ, rút 200000đ, rút thêm 400000đ, in số dư cuối.

3. Kế thừa cơ bản — Lớp DongVat và các lớp con Nâng cao nhẹ
Xây dựng hệ thống lớp đơn giản theo mô tả sau:

    Class cha DongVat: thuộc tính ten (String), tuoi (int); phương thức anUong() in "[tên] đang ăn"; phương thức kedChu() in "..." (để lớp con ghi đè).
    Class Cho kế thừa DongVat: thêm thuộc tính giong (String); ghi đè kedChu() in "Gâu gâu!".
    Class Meo kế thừa DongVat: thêm thuộc tính mauLong (String); ghi đè kedChu() in "Meo meo!".
    Cả hai lớp con đều override toString() để in đầy đủ thông tin riêng.
    Trong main: tạo một Cho và một Meo, gọi anUong() và kedChu() của cả hai, in thông tin bằng toString().
