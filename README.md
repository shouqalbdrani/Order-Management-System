# Order-Management-System
This project Implement OOP principles:
1- Abstraction 
Product Class : The Product Class is abstract which mean hides implemetion details and only present essential features like productID, name, price, stockQuantity and methods reduceStock(), calculateDiscount() that shared in both Electronics and Clothing.

2- Inhertance 
Electronics and Clothing Classes : Both Electronics and Clothing are subclasses of the Product class, inheriting its properties and methods . Each supclass extends the Product Class with its own specific attributes like brand for Electronics and color & material for Clothing.
And Implement calculateDiscount() with 20% discaount in Clothing and Electronics.

3- Encapsulation
Each class encapsulates its own state (fields) and behavior (methods). For example in Order class the fields like orderID, userID, and totalAmount are private and use Getters and Setters: Methods.

4- Polymorphism
The calculateDiscount() method is an example of polymorphism . Because each Clothing and Electronics object of type Product they both can use the function in differnt way 

