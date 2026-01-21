class Table3 extends Thread {
public void run() {
for (int i = 1; i <= 10; i++) {
System.out.println("3 x " + i + " = " + (3 * i));
try {
Thread.sleep(500);
} catch (Exception e) {
System.out.println(e);
}
}
}
}

class Table7 extends Thread {
public void run() {
for (int i = 1; i <= 10; i++) {
System.out.println("7 x " + i + " = " + (7 * i));
try {
Thread.sleep(500);
} catch (Exception e) {
System.out.println(e);
}
}
}
}

class Table9 extends Thread {
public void run() {
for (int i = 1; i <= 10; i++) {
System.out.println("9 x " + i + " = " + (9 * i));
try {
Thread.sleep(500);
} catch (Exception e) {
System.out.println(e);
}
}
}
}
 class MultiplicationTableThreads {
public static void main(String[] args) {
Table3 t1 = new Table3();
Table7 t2 = new Table7();
Table9 t3 = new Table9();

t1.start();
t2.start();
t3.start();
}
}