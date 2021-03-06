FROM timbru31/java-node:11-jre-erbium as builder
RUN mkdir -p /app
WORKDIR /app
COPY app-client/package.json /app
COPY app-client/package-lock.json /app
RUN npm install
COPY /app-client /app
RUN npm run generate:api
RUN npm run build-prod

FROM nginx:1.17.5
COPY default.conf.template /etc/nginx/conf.d/default.conf.template
COPY nginx.conf /etc/nginx/nginx.conf
COPY --from=builder /app/dist/app-client /usr/share/nginx/html
CMD /bin/bash -c "envsubst '\$PORT,\$SERVER_URL,\$PROTOCOL' < /etc/nginx/conf.d/default.conf.template > /etc/nginx/conf.d/default.conf" && nginx -g 'daemon off;'
