To launch:

Database - navigate to mariadb folder in programme files x86
use a command line in admin mode to run ./mysqld.exe

Run back end from intelliJ once db is running

Front end - navigate to client folder
set HOST=0.0.0.0
npm run start

docker commands (not working currently)
winpty docker run -it -d --rm --name=prometheus -p 9090:9090 -v "/C:/Users/$(whoami)/Documents/docker/prometheus/config":/etc/prometheus -v "/C:/Users/$(whoami)/Documents/docker/prometheus/data":/prometheus prom/prometheus

winpty docker run -it -d --rm -p 3001:3000 --name=grafana -v "/C:/Users/$(whoami)/Documents/docker/grafana/storage":/var/lib/grafana grafana/grafana
