FROM node:10-alpine as builder
RUN mkdir -p /app
WORKDIR /app
COPY package.json /app
COPY package-lock.json /app
RUN npm install
COPY . /app
RUN npm run build --prod

#FROM nginx
#COPY nginx.conf /etc/nginx/nginx.conf
#COPY --from=builder /app/dist/app-client /usr/share/nginx/html

FROM nginx:1.17.5
COPY default.conf.template /etc/nginx/conf.d/default.conf.template
COPY nginx.conf /etc/nginx/nginx.conf
COPY --from=builder  /app/dist/app-client /usr/share/nginx/html
CMD /bin/bash -c "envsubst '\$PORT' < /etc/nginx/conf.d/default.conf.template > /etc/nginx/conf.d/default.conf" && nginx -g 'daemon off;'
