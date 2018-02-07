# sales-person-service

I)REST end points are -
1) GET sales persons sorted by id
http://localhost:8080/salespersons/id

2) GET sales persons sorted by Name
http://localhost:8080/salespersons/name

3) GET sales persons sorted by product
http://localhost:8080/salespersons/product

4) GET sales persons sorted by location
http://localhost:8080/salespersons/location

II) For the sake of simplicity, I have pushed the log statements to console I/O.
In real world projects, I will configure log4j and push the logs there

III) For the sake of simplicity, I have created a list of sales persons in-memory.
In real world projects, I will Autowire the DAO layer and get the sales persons

IV) Since this was a simple service, I did not provide versioning of the REST endpoints.
In real world projects, I will typically add a /v1 or /v2 in the endpoint URL, so that 
we can maintain separate versions of the APIs for backward compatibility
