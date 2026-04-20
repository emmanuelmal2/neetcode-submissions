# Definition for a pair.
# class Pair:
#     def __init__(self, key: int, value: str):
#         self.key = key
#         self.value = value
class Solution:
    def quickSort(self, pairs: List[Pair]) -> List[Pair]:
        return self.quickSortHelper(pairs, 0, len(pairs)-1)

    
    def quickSortHelper(self, arr, s, e):

        if e - s + 1 <= 1:
            return arr

        pivot = arr[e]
        j = s # left pointer

        for i in range(s, e):
            if arr[i].key < pivot.key:
                aux = arr[j] # izq
                arr[j] = arr[i]
                arr[i] = aux
                j = j + 1

        arr[e] = arr[j] 
        arr[j] = pivot
            
        self.quickSortHelper(arr, s, j-1)
        self.quickSortHelper(arr, j+1, e)

        return arr