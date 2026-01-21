class AgeNotWithinRangeException extends Exception 
{
AgeNotWithinRangeException(String msg) 
{
super(msg);
}
}

class NameNotValidException extends Exception 
{
NameNotValidException(String msg) 
{
super(msg);
}
}

class Student
 {
int rollNo;
String name;
int age;
String course;

Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException 
{
if (age < 15 || age > 21) {
throw new AgeNotWithinRangeException("Age not between 15 and 21");
}

for (int i = 0; i < name.length(); i++) 
{
char c = name.charAt(i);
if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) 
{
throw new NameNotValidException("Name contains numbers or special symbols");
}
}

// REMOVED 'this' keyword
rollNo = rollNo;
name = name;
age = age;
course = course;
}

void display() {
System.out.println("Roll No: " + rollNo);
System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Course: " + course);
}
}

public class StudentExceptionTest {
public static void main(String[] args) {
try {
Student s1 = new Student(101, "John", 18, "CS");
s1.display();
} catch (Exception e) {
System.out.println(e.getMessage());
}
}
}