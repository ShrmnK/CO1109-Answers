# 2015 Zone B Answers

| **DISCLAIMER**  |
| :---: |
| This repository of documents and source codes were created with the intention of helping fellow students. No infringement of copyrights or legal rights intended. |
| Please only take these answers as a *reference* for your research purposes. |

---

## Question 1

* a) i) 65
* a) ii) 7
* a) iii) 123
* a) iv) 37
* a) v) 3

---

* b) i) No
* b) ii) Yes
* b) iii) Yes
* b) iv) Yes
* b) v) No
* b) vi) Yes
* b) vii) Yes
* b) viii) Yes
* b) ix) Yes
* b) x) Yes

---

* c) i) Method Overloading
* c) ii) `parseInt(String)` and `parseInt(String, int)`
* c) iii)
```java
public class descending {
  public static void main(String[] args) {
    int[] argsi = {
      Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])
    };
    int largestIndex = 0;
    for(int i = 0; i < 3; i++)
      if(argsi[i] > argsi[largestIndex])
        largestIndex = i;
    int mid, max;
    if(largestIndex == 0) {
      mid = Math.max(argsi[1], argsi[2]);
      max = Math.min(argsi[1], argsi[2]);
    } else if(largestIndex == 1) {
      mid = Math.max(argsi[0], argsi[2]);
      max = Math.min(argsi[0], argsi[2]);
    } else {
      mid = Math.max(argsi[1], argsi[0]);
      max = Math.min(argsi[1], argsi[0]);
    }
    System.out.println(args[largestIndex] + ", " + mid + ", " + max);
  }
}
```

---

## Question 2

* a) i)
```java
0
1
2
3
4
5
6
```

* a) ii) Array Index Out Of Bounds exception will be thrown

* b) When the user keys in more than 1000 inputs, which would cause an Array Index Out of Bounds exception.

* c)
```java
int shortestLength(String[] arr) {
    if(arr.length == 0) return 0;
    int shortLength = arr[0].length();

    for(int i = 1; i < arr.length; i++)
      if(shortLength > arr[i].length())
        shortLength = arr[i].length();
    return shortLength;
  }
```

---

## Question 3

* a)
```java
Enter Width>4
****
****
****
****
```

* b)
```java
import java.util.Scanner;
class F {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int j = 0;
    while(j < 265) {
      int i = 0;
      while(i < 100) {
        System.out.print("*");
        i++;
      }
      System.out.println();
      j++;
    }
  }
}
```


* c)
```java
  public void rightTriangle(int n) {
    for(int i =0; i < n; i++) {
      for(int j = 0; j < i; j++)
        System.out.print(" ");
      for(int k = 0; k < (n-i); k++)
        System.out.print("*");
      System.out.println();
    }
  }
 ```

---

## Question 4

* a)
```java
boolean isOdd(int n) {
  return (n%2) > 0;
}
```

* b)
```java
int syr(int n) {
    System.out.print(n + " ");
    if(n == 1) {
      return 1;
    }
    if(n % 2 > 0) {
      return syr(n * 3 + 1);
    }
    return syr(n/2);
}
```

* c)
```java
class q4c {
  // Googling resulted in the following method:
  // Exponentiation by squaring
  // https://en.wikipedia.org/wiki/Exponentiation_by_squaring
  int exponentiation(int x, int n) {
    if(n == 1) return x;
    if(n == 2) return x * x;

    if(x % 2 > 0)
      return x * exponentiation(exponentiation(x, (n - 1) / 2), 2);
    return exponentiation(exponentiation(x, n / 2), 2);
  }

  public static void main(String[] args) {
    q4c go = new q4c();
    System.out.println("Exponentiation by squaring:");
    System.out.println("2^4 = " + go.exponentiation(2, 4));
    System.out.println("---");
    System.out.println("Exponentiation by method overloading:");
    System.out.println("2^4 = " + go.exp(2, 4));
  }

  // However, this question can also be solved by overloading the exp() method
  int exp(int x, int n) {
      return exp(x, n ,1);
  }
  int exp(int x, int n, int result) {
      if(n == 0) return result;
      return exp(x, n-1, result * n);
  }
}
```

---

## Question 5

* a) i) It will output the source code of the `filey` program.

* a) ii) When the `BufferedReader` file pointer is at the end of the file.

* a) iii) The output would be empty as the `BufferedReader` file pointer will be at the end of the file upon opening the file for reading.

* b) c

* c)
```java
// Assuming the question asks for the second last character
// e.g. the "l" in "example", then:
s.charAt(s.length()-2);

// Assuming the question asks for the String from the start til the second
// last character, e.g. "exampl" in "example", then:
s.substring(0, s.length()-1);
```

* d)
```java
import java.io.*;

public class swapcdxy {
  public static void main(String[] args) throws Exception{
    BufferedReader inone = new BufferedReader(new FileReader(args[0]));
    int t = inone.read();
    // We are assuming that we are to perform case-sensitive comparisons
    // Since the question literally quotes lower-case characters
    while(t != -1) {
      if(t == (int)'a')
        System.out.print('x');
      else if(t == (int)'b')
        System.out.print('y');
      else
        System.out.print((char)t);
      t = inone.read();
    }
  }
}
```

---

## Question 6

* a) `peach`

* b)
```java
public class Date {
  private int d, m, y;
  public Date(int d, int m, int y) {
    this.d = d;
    this.m = m;
    this.y = y;
  }
}
```

```java
public class Person {
  private String firstName, lastName;
  private Date d;

  public Person(String firstName, String lastName, Date d) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.d = d;
    }
}
```

* c)
```java
public class PersonOccupation extends Person {
  private String occupation;

  public PersonOccupation(String firstName, String lastName, Date d, String occupation) {
      super(firstName, lastName, d);
      this.occupation = occupation;
  }
}
```

* d)
```java
public class q6d {
  static int roll() {
    java.util.Random r = new java.util.Random();
    return r.nextInt(6) + 1;
  }

  // for() loop method
  // While (no pun intended) this method works, we generally use while() loops
  // for when we do not know the exact number of times to run the loop for.
  /*public static void main(String[] args) {
    int consecutive = 0, i = 1;
    for(i = 1; consecutive != 3; i++) {
      if(roll() == 5)
        consecutive++;
      else
        consecutive = 0;
    }
    System.out.println(i);
}*/

  // while() loop method
  public static void main(String[] args) {
      int consecutiveFives = 0, count = 0;
      while(consecutiveFives < 3) {
          if(roll() == 5) {
              consecutiveFives++;
          } else {
              consecutiveFives = 0;
          }
          count++;
      }
      System.out.println(count);
  }
}
```
