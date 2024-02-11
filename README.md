"Endpoints for CRUD Operations"



Add Product
-----------

Endpoint: /Add
Method: POST
Description: Adds a new product to the catalog.


Payload Example:

{
    "productId": 3,
    "name": "Draw pad 2 3",
    "description": "draw pad model 12",
    "price": 6999,
    "quantity": 1
}


Edit Product
-------------

Endpoint: /Edit
Method: POST
Description: Updates product information based on the provided product ID.
Payload Example:

{
    "productId": 3,
    "name": "Updated Draw pad",
    "description": "New draw pad model",
    "price": 7999,
    "quantity": 2
}


Delete Product
---------------

Endpoint: /Delete
Method: POST
Description: Deletes a product from the catalog based on the provided product ID.
Payload Example:

{
    "productId": 3
}


Read Product
--------------

Endpoint: /Read
Method: POST
Description: Retrieves product details based on the provided product ID.


Payload Example:

{
    "productId": 3
}


Get All Products
-------------------

Endpoint: /getAll
Method: GET
Description: Retrieves a list of all products in the catalog.
Endpoint for Applying Discount or Tax
Apply Discount or Tax
Endpoint: /ecom/Apply/discountOrtax
Method: POST
Description: Applies either a discount or tax to a specific product based on the provided product ID, type (discount or tax), and percentage.


Payload Example:

{
    "productId": 3,
    "type": "discount",
    "percentage": 10
}




Payload Structures

Product Model Payload:
---------------------

Represents the payload structure for creating or updating a product.
Example:

{
    "productId": 3,
    "name": "Draw pad 2 3",
    "description": "draw pad model 12",
    "price": 6999,
    "quantity": 1
}


Discount Model Payload:
----------------------
Represents the payload structure for applying a discount or tax to a product.
Example:

{
    "productId": 3,
    "type": "discount",
    "percentage": 10
}


Notes:
-----
The project uses the following conventions for endpoints:
/Add for adding a product
/Edit for editing a product
/Delete for deleting a product
/Read for reading product details
/getAll for retrieving a list of all products and /ecom/Apply/discountOrtax
The payload examples are provided to illustrate the structure of the data expected in the requests.
