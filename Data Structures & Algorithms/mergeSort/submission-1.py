# Definition for a pair.
# class Pair:
#     def __init__(self, key: int, value: str):
#         self.key = key
#         self.value = value
class Solution:
    def mergeSort(self, pairs: List[Pair]) -> List[Pair]:

        return self.mergeSortHelper(pairs, 0, len(pairs)-1)

    def mergeSortHelper(self, lists, s, e):

        if e-s+1 <= 1:
            return lists

        m = (s+e)//2

        self.mergeSortHelper(lists, s, m)

        self.mergeSortHelper(lists, m+1, e)

        self.merge(lists, s, m, e)

        return lists

        
    def merge(self, lists, s, m, e):

        left = lists[s:m+1]
        right = lists[m+1:e+1]
            
        i = 0
        j = 0
        k = s

        while i < len(left) and j < len(right):
            if left[i].key <= right[j].key:
                lists[k] = left[i]
                i+=1
            else:
                lists[k] = right[j]
                j+=1
            k+=1
                
        while i < len(left):
                lists[k] = left[i]
                i+=1
                k+=1

        while j < len(right):
                lists[k] = right[j]
                j+=1
                k+=1





