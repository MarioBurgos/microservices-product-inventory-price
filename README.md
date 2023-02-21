# SPRINGBOOT MICROSERVICES:  Products #

### _Spring-web_ | _Spring Data JPA_ | _MySQL Driver_ | _Eureka_ | _OpenFeign_

<br>

This GitHub repository contains:

1. __eureka-service (server)__: This is the eureka server service.  Each microservice register on it.
2. __price-service (proxy)__:  This service connects to a database and retrieves information about the product itself and its price.
3. __inventory-service (proxy)__: Another service that connects to a database and retrieves the availability of the products.
4. __product-service (edge)__: This service creates 2 clients for both proxy services and  by using _OpenFeign_ library.  