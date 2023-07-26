# PROJE 1:
 ## Insertion Sort ve Selection Sort
- **[22,27,16,2,18,6]**  
Yukarıdaki dizinin Insertion Sort Algoritmasına göre aşamaları:
 Dizi: [22,27,16,2,18,6]
1. Adım:  [22,27,16,2,18,6]	->	1
2. Adım: [22,27,16,2,18,6]	->	2 
3. Adım:[16,22,27,2,18,6]	->	3
4. Adım: [2,16,22,27,18,6]	->	4
5. Adım: [2,6,16,22,27,18]	->	5
6. Adım: [2,6,16,18,22,27]	->	6
n. Adım: ...								->	n
BigO: (n*(n+1))/2 = n^2
			O(n^2)

- Time Complexity: Dizi sıralandıktan sonra 18 sayısı aşağıdaki case'lerden hangisinin kapsamına girer? Yazınız

1.  Average case: Aradığımız sayının ortada olması
2.  Worst case: Aradığımız sayının sonda olması
3.  Best case: Aradığımız sayının dizinin en başında olması.

Average Case

- [7,3,5,8,2,9,4,15,6] dizisinin Selection Sort'a göre ilk 4 adımını yazınız.

Dizi: [7,3,5,8,2,9,4,15,6] 
1. Adım: [2,3,5,8,7,9,4,15,6]  
2. Adım: [2,3,4,8,7,9,5,15,6]  
3. Adım: [2,3,4,5,7,9,8,15,6]  
4. Adım: [2,3,4,5,6,9,8,15,7] 

---
# Proje 2: 
## Merge Sort
Dizi: **[16,21,11,8,12,22]**
- [16,21,11]-----[8,12,22]
- [16]----[21,11]-----[8]----[12,22]
- [16]-----[21]-----[11]-----[8]-----[12]-----[22]
- [16]-----[11,21]-----[8]-----[12,22]
- [11,16,21]------[8,12,22]
- [8,11,12,16,21,22]
**BigO:** O(nlogn)

-----
# Proje 3:
## Binary-Search-Tree
Dizi: **[7, 5, 1, 8, 3, 6, 0, 9, 4, 2]**

Root: 6

          6
         / \
        5   7
       /     \
      1       8
     / \       \
    0   3       9
       / \
      2   4          
                          