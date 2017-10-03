
javac -d . Robo.java
jar cvf Robo.jar com/stackroute/java/robo/Robo.class
javac -cp ./Robo.jar Main.java
java Main 