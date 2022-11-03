SELECT ContactName Adi,CompanyName SirketAdi ,City Sehir from Customers

SELECT * from Customers where City = 'Berlin'

SELECT * from Products where CategoryID=1 or CategoryID=3


SELECT * from Products where CategoryID=1 and UnitPrice>=10

select * from Products where CategoryID=1 order by UnitPrice desc

Select count(*) Piece from Products

select categoryID,count(*) from Products where UnitPrice>20 group by CategoryID having count(*)<10 


select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName from Products inner join Categories
on products.categoryID = categories.categoryID
where Products.UnitPrice>10

select * from Products p left join [Order Details] od
on p.ProductID = od.ProductID

select * from Customers c right join Orders o
on c.CustomerID = o.CustomerID
where o.CustomerID is null
