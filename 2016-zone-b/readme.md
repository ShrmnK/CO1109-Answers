# 2016 Zone B Answers

| **DISCLAIMER**  |
| :---: |
| This repository of documents and source codes were created with the intention of helping fellow students. No infringement of copyrights or legal rights intended. |
| Please only take these answers as a *reference* for your research purposes. |

---

## Question 1

* a) i) int
* a) ii) char
* a) iii) short
* a) iv) double

---

* b) i) int,Long
* b) ii) double
* b) iii) boolean
* b) iv) char

---

* c)
```java
public class Sample{
  public static void main(String[] args){
    
  }
}
```

---

* d)
```java
public class Count{
  public static void main(String[] args){
    System.out.println(args.length);
  }
}
```

---

* e)
```java
public class ToDoList{
  private String item;
  private boolean done;
  
  public ToDoList(String item, boolean done){
    this.item = item;
    this.done = done;
  }
  
  public boolean isDone(){
    return done;
  }
  
  public String toString(){
    String s = ("The to do list item: "+item+"\n");
    
    if(isDone()) s = s + "has been done";
    else s = s + "has not been done";
    
    return s;
  }
  
  public static void main(String[] args){
    ToDoList toDoList = new ToDoList("take cat to vet",false);
    System.out.println(toDoList);
  }
}
```

---

## Question 2

* a) i) yes
* a) ii) yes
* a) iii) no
* a) iv) yes
* a) v) yes
* a) vi) yes
* a) vii) yes

---

* b) (A)

---

* c) i) 12
* c) ii) 6
* c) iii) Infinite loop
* c) iv) 22
* c) v) Infinite loop
* c) vi) 0
* c) vii) 10
* c) viii) 10

---

* d)
```java
static int shortestLength(String [] arr){
int short = 0;
if(arr.length > 0) short = a[0];
  for(int i=1; i<arr.length; i++){
    if(short > arr[i]){
      short = arr[i];
    }
  }
return short;
}
```
---

## Question 3

* a) i) Cannot assign String to int.
* a) ii) Cannot declare a variable again.
* a) iii) Class D has an error, because String z must be static in order to be used in static method.

---

* b) i)
```java
if(t 1 > t2 && b) t1 = t2+1;
System.out.println(t1);
```
* b) ii)
```java
if( b != true) { y = 7 + 10; } 
```
* b) iii)
```java
public static int CoinToss2(int n)
{
  int sum = 0;
  for(int i=0; i<n; i++){
    int r = (int)(Math.random()*2);
    sum = sum + r;
  }
  return sum;
}
```

---

* c)
```java
*
**
***
****
*****
*****
****
***
**
*
 ```

---

## Question 4

* a) i) It will printout every character(character by character) of the file filey.java
* a) ii) Value of t will be -1, when the filereader reaches end of file.
* a) iii) It will throw exception "FileNotFoundException"

---

* b) g

---

* c) `s.charAt(1);` and `s.charAt(s.length()-2);` Assuming the String length is greater than 2.

---

* d) 
```java
public class swapcd{
  public static void main(String[] args){
    try{
      FileReader fr = new FileReader(args[0]);
      int t = fr.read();
      while(t != -1){
        char current = (char)t;
        if(current == 'c') System.out.print('d');
        else if(current == 'd') System.out.print('c');
        else System.out.print(current);
      }
    }
    catch(FileNotFoundException ex){
      System.out.println("File Not Found");
    }
    catch(Exception ex){}
  }
}
```
Note: In the Question 4d, Writing message in exception is not necessary as there was not marks intended for it.

---

## Question 5

* a) A) true
* a) B) false
* a) C) true
* a) D) false
* a) E) true

---

* b) i)
```java
public static String eightBall()
{
  Random r = new Random();
  int randomA = r.nextInt(6);
  return answers[randomA];
}
```
* b) ii)
```java
public static void main(String[] args){
  String randomAnswer = eightBall();
  System.out.println(randomAnswer);
}
```

---

* c) i)
```java
public String aToss(){
  int randomA = r.nextInt(6);
  return tosses[randomA];
}
```
* c) ii)
```java
public static void main(String[] args){
  String toss = aToss();
  System.out.println(toss);
}
```

---

* d)
```java
public static void insertSpace(String word){
  for(int i=0;i<word.length()-1;i++){
    System.out.print(word.charAt(i)+" "+" ");
  }
  System.out.print(word.charAt(word.length()-1));
}
```

---

## Question 6

* a) i) 
0
1
2
3
4
* a) ii) It will throw error `ArrayIndexOutOfBoundException` as the array with length five has indexes range from 0 - 4.
* a) iii) `hello`

---

* b)
```java
public GolfClubMember(String firstName, String familyName, double handicap, boolean annulaFeesPaid){
  this.firstName = firstName;
  this.familyName = familyName;
  this.handicap = handicap;
  this.annulaFeesPaid = annulaFeesPaid;
}
```

---

* c)
```java
public String reverse(String word){
  String rev = "";
  for(int i=word.length()-1;i>=0;i--){
    rev += word.charAt(i);
  }
  return rev;
}
```
