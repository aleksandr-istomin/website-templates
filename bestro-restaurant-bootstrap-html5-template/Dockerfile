# Используем официальный образ Nginx
FROM nginx:alpine

# Копируем статические файлы в директорию Nginx
COPY /home/jenkins/workspace/CD/bestro-restaurant-bootstrap-html5-template/. /usr/share/nginx/html

# Открываем порт 80
EXPOSE 80
