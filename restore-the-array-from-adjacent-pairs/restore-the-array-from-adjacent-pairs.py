class Solution(object):
    def restoreArray(self, adjacentPairs):
        """
        :type adjacentPairs: List[List[int]]
        :rtype: List[int]
        """
        nums = []
        dicts = {}
        visited = set()
        
        for pair in adjacentPairs:
            if pair[0] not in dicts:
                dicts[pair[0]] = [pair[1]]
            else:
                dicts[pair[0]].append(pair[1])
                
            if pair[1] not in dicts:
                dicts[pair[1]] = [pair[0]]
            else:
                dicts[pair[1]].append(pair[0])
        
        for i in dicts:
            if len(dicts[i]) == 1:
                start = i
                break
                
        def DFS(s, arr, visited,hashMap):
            
            arr.append(s)
            visited.add(s)
            for num in hashMap[s]:
                if num not in visited:
                    visited.add(num)
                    DFS(num, arr, visited, hashMap)
         
        
        DFS(start, nums, visited, dicts)
        return nums
                
            
        
  
        