This is a JPA example of using composite primary key.

There are three tables in this example - Product, Basket, and BasketItem. 
The table of Product stores all the product information. 

The table of Basket stores the information about who is the receiver and
where is this basket shipping to. 

The table of BasketItem links the tables of product and basket together, it stores information about which
basket is currently holding which products and the quantity of each product.

The ER diagram/class diagram are provided!

The suggested procedure of building a website like this:
1. draw your ER diagram!!!
2. build the models (product, basket, basketItem) and make them run using a main method to ensure they are built correctly;
3. when you are trying to build composite primary key, make sure you have created another class that "implements Serializable" and overrides the hashcode and equal methods;
4. link these models together and build your data access object to connect to the database, so that you can see those models are connected successfully and correctly.
5. once the configuration of your models and DAO has been completed, you can start creating your servlets to handle the logic.

I hope this example would help.  Thank you!


