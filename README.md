## DEMO: SPRING BOOT + MYBATIS + ORACLE DATABASE

#### TECH STACK:

- Spring boot 2.5.2
- JDK 1.8.0_291
- Oracle database 12.2.0.1
- Docker 3.5.2
- Dependencies: lombok, ojdbc8, mybatis 1.3.2

#### OBJECTIVES:

- Demo config mybatis with spring boot and oracle database
- Simple api to execute CRUD on single table
- Practice using Store Procedures and PL/SQL
- Unit test setup

#### HOW TO RUN PROJECT

- Setup Docker for desktop
- Pull Oracle Database image
- Deploy Oracle Database container
- Run Container as background
- Create USER table by query in schema.sql file
- Run Project with config on application.properties

#### API END-POINTS

    curl --location --request GET 'localhost:9090/api/v1/users'
    
    curl --location --request GET 'localhost:9090/api/v1/users/Johnny'

    curl --location --request POST 'localhost:9090/api/v1/users' \
    --header 'Content-Type: application/json' \
    --data-raw '{
    "name":"Johnny Teddy"
    }'
