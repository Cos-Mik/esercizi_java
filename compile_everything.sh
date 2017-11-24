mkdir -p classes
javac -d classes `find src | grep \.java$`
