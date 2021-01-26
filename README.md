# Car Maintenance Pocketbook application
![Server on Google Cloud](https://github.com/Mrak2017/car-maintenance-pocketbook/workflows/Server%20on%20Google%20Cloud/badge.svg?branch=main)
![Client on Heroku](https://github.com/Mrak2017/car-maintenance-pocketbook/workflows/Client%20on%20Heroku/badge.svg?branch=main)

Main application [url](https://car-pocketbook.herokuapp.com/)
### Application content:
- Client (Angular 9, nginx) hosted on Heroku
- Database (Postgres 13.1) hosted on Heroku
- Mono-backend (Spring Boot 2.4.0) hosted on [Google Cloud](https://car-pocketbook-byh6ubypwq-ew.a.run.app/)

#### For local development

1. Start DB (for example, in the docker)  
`docker-compose up -d`
2. Check db connection url and credentials in `monobackend/src/main/resources/application.prpoperties`
3. Start server  
`gradlew bootRun`
4. Start client (`npm i` before first start)  
`cd app-client && npm run start`

##### Local application start (old)
1. Build client docker image  
`docker build -t local/app-client .`

2. Build server docker image   
`gradlew bootBuildImage --imageName local/monobackend`
   
3. Run docker-compose  
`docker compose up`
   
4. Application available at  
`http://localhost:8001`



##### Local application start
1. Build client docker image  
   `docker build -t local/app-client .`

2. Build server docker image   
   `gradlew monobackend:bootBuildImage --imageName local/monobackend`

3. Build gateway docker image   
   `gradlew gateway:bootBuildImage --imageName local/gateway`
   
4. Run docker-compose  
   `docker compose up`

5. Application available at  
   `http://localhost:8001`
