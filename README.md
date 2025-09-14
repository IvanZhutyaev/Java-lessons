# Java-lessons
My java lessons

Java-компилятор
Байт-код - нужен для кроссплатформенности, производительности
JVM-позволяет выполнять скомпилированный java код на каждой OС
Сборщик мусора в JVM - автоматически освобождает память(переменные, которые просто забивают ЦП)
JRE-Java Runtime Environment - среда выполнения java

JVM совместно со стандартными Java-библиотеками образует Среду Выполнения Java(JRE)

JDK(Java development kit+инструменты для Java-разработчиков)->JRE(Java Runtime Environment+набор стандартных Java-библиотек)->JVM(Java Virtual Machine)
sout - System.out.println("Hello world");
psvm - public static void main(){}

Форматированный вывод
System.out.format("Hello. My name is %s, i am %d years old ", name, age);

System - класс, который позволяет разработчику возможность общение с окружающей его средой - ОС

Константа объявляется ключевым словом - final:
final int LIMIT=5;
Название констант в Java-БОЛЬШИМИ БУКВАМИ

При делении целового числа на целое получится ЦЕЛОЕ ЧИСЛО
При делении числа с вещественным типом данных получится обычное деление:

int a =5;
int b= 2;
float c=2;
System.out.print(a/b)//2
System.out.print(a/c)//2.5


При явной конвертации большего типа данных к меньшему происходит потеря данных, лишние биты отбрасываются
int a=258;
byte b=(byte) a; //2

Ввод данных:
Scanner console = new Scanner(System.in);
String name=console.nextLine();
int age = console.nextInt();

.equals <-> ==(касается строк)

switch:

int a=5;
switch (a){
case 1:
System.out.println("1");
case 2:
System.out.println("2");
case 3:
System.out.println("3");
default:
System.out.println("default");

Тернарная операция:
z=(x<y)?x+y:x-y;
(x<y) - условие
?-если
x+y - если true
x-y - если false

ЦИКЛЫ
break - остановить цикл
continue - пропустить круг и перейти к другому кругу

String
Классы строк: String, StringBuffer StringBullder

class String:
У класса String не может быть наследников(final) и экземпляры класса нельзя изменить после создания(immutable)