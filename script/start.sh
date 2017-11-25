rm -rf /etc/init.d/api
ln -s /opt/git/server/api/target/api-0.0.1-SNAPSHOT.jar /etc/init.d/api
nohup java -jar api &