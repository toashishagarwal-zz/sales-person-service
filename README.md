# sales-person-service

I)REST end points are -
1) GET sales persons sorted by id
http://localhost:8080/salespersons/v1?sortBy=id

2) GET sales persons sorted by Name
http://localhost:8080/salespersons/v1?sortBy=name

3) GET sales persons sorted by product
http://localhost:8080/salespersons/v1?sortBy=product

4) GET sales persons sorted by location
http://localhost:8080/salespersons/v1?sortBy=location

II) For the sake of simplicity, I have created a list of sales persons in-memory.
In real world projects, I will Autowire the DAO layer and get the sales persons

III) I have provided versioning of the REST endpoints, so that 
we can maintain separate versions of the APIs for backward compatibility
