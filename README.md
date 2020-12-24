# Car Maintenance Pocketbook application
![Server on Google Cloud](https://github.com/Mrak2017/car-maintenance-pocketbook/workflows/Server%20on%20Google%20Cloud/badge.svg?branch=main)
![Client on Heroku](https://github.com/Mrak2017/car-maintenance-pocketbook/workflows/Client%20on%20Heroku/badge.svg?branch=main)

[Application url (Heroku)](https://car-pocketbook.herokuapp.com/)

[Server url (Google Cloud)](https://car-pocketbook-byh6ubypwq-ew.a.run.app/)

DB hosted in [Heroku](https://www.heroku.com/)


#### For local development

1. Start DB (for example, in the docker)  
`docker-compose up -d`
2. Check db connection url and credentials in `monobackend/src/main/resources/application.prpoperties`
3. Start server  
`gradlew bootRun`
4. Start client (`npm i` before first start)  
`cd app-client && npm run start`
##### Alternative client start
1. Build docker image  
`docker build -t local/app-client .`
2. Run docker container  
`docker run --env PROTOCOL=http --env SERVER_URL=localhost:8080 --env PORT=8001 --name app-client -p 8001:8001 local/app-client`