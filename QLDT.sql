create database QLDT

--- Tạo Bản Loại
create table Loai
(
MaLoai nvarchar(10),
TenLoai nvarchar(30),
primary key(MaLoai)
)

---Tạo Bản Sản Phẩm
create table SanPham
(
MaSP nvarchar(10),
TenSP nvarchar(30),
GiaSP money,
SoLuong int,
MaLoai nvarchar(10),
primary key(MaSP)
)

-- tạo Liên Kết khóa ngoại
alter table SanPham
add constraint MaLoai
foreign key (MaLoai)
references Loai(MaLoai)

-- insert into
insert into Loai(MaLoai,TenLoai) values('01','Apple')
insert into Loai(MaLoai,TenLoai) values('02','SamSung')
insert into Loai(MaLoai,TenLoai) values('03','Oppo')

insert into SanPham(MaSP,TenSP,GiaSP,SoLuong,MaLoai) values('001','IPhone 14','30000000',10,'01')
insert into SanPham(MaSP,TenSP,GiaSP,SoLuong,MaLoai) values('002','IPhone 14 Pluse','26000000',10,'01')
insert into SanPham(MaSP,TenSP,GiaSP,SoLuong,MaLoai) values('003','IPhone 14 Pro','35000000',10,'01')