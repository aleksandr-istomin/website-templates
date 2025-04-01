# Используем официальный образ Nginx
FROM ubuntu/nginx

# Копируем статические файлы в директорию Nginx
COPY . /usr/share/nginx/html/site_template
#
# Открываем порт 80
EXPOSE 3000