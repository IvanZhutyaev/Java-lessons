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

.equals <-> ==(касается строк) - СРАВНИВАЕТ ПО ЗНАЧЕНИЮ

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
Классы строк: String, StringBuffer StringBuilder
class String:
У класса String не может быть наследников(final) и экземпляры класса нельзя изменить после создания(immutable)
При изменении строки создаются КОПИИ
String a="111" //1 ячейка
a="222" //2 ячейка
СТРОКИ МОГУТ БЫТЬ ЛИТЕРАЛЛАМИ:
String s1="Hello"
ЛИБО СТРОКОВЫМИ ОБЪЕКТАМИ:
String s1= new String("Hello")
Строковые литераллы с одинаковым значением указывает на один и тот же объект в памяти
Строковые объекты с одинаковым значением указывают на разные объекты в памяти

== сравнивает адреса в памяти(ссылки)
.equals сравнивает значения в памяти

length() - длина строки
concat(String) - сложение строк(аналог +)
indexof(String) - найти индекс позиции первого элемента в строке(в скобках указываешь символ, диапозон)
substring(..) - получить подстроку(по факту вырезать кусок)

class StringBuffer:
Уже изменяемый
StringBuffer sb2 = new StringBuffer("Not empty")
append - метод для конкатенации(просто так перезаписать строку не получится!!!)
StringBuffer.append можно добавить любой тип данных
![img.png](img.png)
StringBuffer - изменяемый класс, поэтому при ра~~~~боте с ним не возникает такого же количества мусора в памяти, как со String
StringBuffer - потокобезопасный класс. Его методы синхронизированы, а экземпляры могут быть использованы несколькими потоками одновременно
Синхронизированные методы работают медленнее не синхронизированных

class StringBuilder:
Отсутствует потокобезопасность
![img_1.png](img_1.png)

Регулярное выражение
Шаблон для строк
String a= "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
По факту проверка на валидность строки по шаблону(стандарту)
Как пример: регулярное выражение для email/телефона

String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");
Метод split применяется для разделения строки

Pattern pattern = Pattern.compile("bob");
Matcher matcher= pattern.matcher("bob1");
System.out.println(matcher.find()); //true (ищет любое совпадение)
System.out.println(matcher.matches()); //false (смотрит в общем всю строку)

Pattern pattern = Pattern.compile("bob");
Matcher matcher= pattern.matcher("aboba aboba aboba");
while(matcher.find()) //ищет любое совпадение
System.out.println(matcher.group()); // bob bob bob(группирует ответ)


matcher.matches() - любое вхождение подстроки в строке должно совладать с регулярным выражение 
matcher.find() - полное совпадение строки на регулярное выражение


**Массивы**
Вариант создания:
int nums[]=new int[4];
int[] nums1=new int[5];

int[] nums2={1,2,3,4,5}
int[] nums3=new int[] {1,2,3}