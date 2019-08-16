
# Configure Application
config files are in src/main/resources folder:
        
        application.yml
        application-prod.yml
        application-test.yml

All configurations that are related to spring, postgres, aws, elk are in 

        application.yml file.

#   Run Application

## PostgreSql
        
        You need PostgreSQL v9.4 installed, user and database created. Then change application.yml datasource config accordingly
        

## Maven

        mvn spring-bot:run
           
## More about running a spring-boot application
    
    https://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-running-your-application.html
    
