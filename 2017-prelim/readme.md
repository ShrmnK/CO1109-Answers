# 2017 Prelim Answers

| **DISCLAIMER**  |
| :---: |
| This repository of documents and source codes were created with the intention of helping fellow students. No infringement of copyrights or legal rights intended. |
| Please only take these answers as a *reference* for your research purposes. |

---

## Question 1

* a) c = -1

---

* b) i) 
`Ha`
`99`
* b) ii)
7
100.0
100
64
* iii) false

---

* c) 
7
0
9
20
9

---

* d)

```java
static double average(Vector v){
  double avg = 0.0;
  for(int i=0; i<v.size(); i++){
    avg += v.get(i);
  }
  return avg;
}
```

---

## Question 2

* a) i) no
* a) ii) yes
* a) iii) no
* a) iv) yes
* a) v) yes

---

* b) 1) Final keyword cannot reassign value. 2) cannot assign string to integer

---

* c) i) 8
* c) ii) It will throw error, InputMismatchException
* c) iii) Try{} Catch(Exception ex){}

---

* d) i)

```java
void printChars(int start, int end, String s){
  int len = s.length()-1;
  if(len > 0 && start >= len && end <= s)
  {
    for(int i=start; i<=end; i++)
    {
      System.out.print(s.charAt(i));
    }
  }
  else
  {
    System.out.println("Invalid String entered");
  }
}
```

---

## Question 3

* a) i) Heisenberg is the danger
* a) ii) x[0]:3 x[1]:5

---

* b) i) it is reversing the string
* b) ii)
```java
int i=0;
while(i<length/2)
{
  int temp = ta[i];
  ta[i] = ta[length - i -1];
  ta[length - i - 1] = temp
}
```

---

* c) i)

```java
boolean isSum(double[][] s, double[][] a, double[][] b)
{
  boolean result = true;
  for(int i = 0; i<a.length; i++)
  {
    for(int j=0; j<a[0].length; j++)
    {
      double sum = a[i][j] + b[i][j];
      if(sum != s[i][j])
      {
        result false;
        break;
      }
    }
  }
  return result;
}
```

* c) ii)

```java
int whichIsSum(double[][] s, double[][] a, double[][] b)
{
  if(isSum(s,a,b){ return 1; }
  else if(isSum(a,s,b){ return 2; }
  else if(isSum(b,a,s){ return 3; }
  else{ return 0; } 
}
```

---

## Question 4

* a) i) x==3
* a) ii) x==35||y%2==0
* a) iii) x%2!=0&&x==y&&y==z

---

* b) i) `public int doSomething(int i){}` and `public void doSomething(int i){}` OR `public int doSomething(int i){} //nothing is returning`

---

* c)

```java
int power(int m, int n)
{
if(n==0) return 1;
else { return m*power(m,n-1);}
}
```

* d)

```java
int power2(int m, int n)//m^n
{
int product = 1;
for(int i=n; i>=0; i--)
{
  product *= m;
}
return product;
}
```

---

## Question 5

* a) TODO

---

* b) 
```java
public static String reverseString(String original)
{
  String rev = "";
  for(int i=original.length()-1; i>=0; i--)
  {
    rev += original.charAt(i);
  }
  return rev;
}
```

---

* c)
```java
public static String sortString(String original)
{
  char[] arr = original.toCharArray();
  Arrays.sort(arr);
  String result = new String(arr);
  return result;
}
```

---

* d)
```java
public static void playLines(String filename)throws Exception
{
  Scanner in = new Scanner(new FileReader(filename));
  while(in.hasNextLine())
  {
    String line  = in.nextLine();
    line = sortString(line);
    line = reverseString(line);
    System.out.println(line);
  }
}
```

---

## Question 6

* a) i) false
* a) ii) false
* a) iii) true

---

* b) i) 

---

* c) 11

---

* d) 
```java
public class Child extends Parent
{
  //overrides
  public int doNothing(int i)
  {
    return i+1;
  }
  
  //overloads
  public int doNothing(String s)
  {
    return 1;
  }
}
```
---

* e) i)
```java
Fraction(int numer, int denom)
{
  this.numer = number;
  this.denom = denom;
}
```

* e) ii)
```java
String toString()
{
  String output = numer +"/"+ demon;
  return output;
}
```

* e) iii)
```java
boolean equals(Fraction f)
{
  if(f.number == numer && f.demon == demon)
  {
    return true;
  }
  else
  {
    return false;
  }
}
```

Note: All the above answers may have one or many solutions. And di confirm each by compiling it.

###### Contributors
> These people helped to make the above answers: @shah-smit
